package com.finance.ui.key.group;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.finance.BR;
import com.finance.MVVMApplication;
import com.finance.R;
import com.finance.constant.Constants;
import com.finance.data.model.api.ApiModelUtils;
import com.finance.data.model.api.response.key.KeyGroupResponse;
import com.finance.databinding.ActivityKeyGroupBinding;
import com.finance.di.component.ActivityComponent;
import com.finance.ui.CallBackApi;
import com.finance.ui.base.BaseActivity;
import com.finance.ui.dialog.DeleteDialog;
import com.finance.ui.key.adapter.KeyGroupAdapter;
import com.finance.ui.key.group.details.KeyGroupDetailsActivity;
import com.finance.ui.view.EndlessRecyclerViewScrollListener;
import com.finance.utils.NetworkUtils;

import java.util.Objects;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;
import timber.log.Timber;

public class KeyGroupActivity extends BaseActivity<ActivityKeyGroupBinding, KeyGroupViewModel> implements View.OnTouchListener{
    KeyGroupAdapter keyGroupAdapter;
    private float xAxis, yAxis,initialX,initialY;
    int lastAction;
    private final ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
        result -> {
            if (result.getResultCode() == Activity.RESULT_OK) {
                Intent data = result.getData();
                if(data != null){
                    if(viewModel.positionUC.get() != null){
                        String keyGroupS = Objects.requireNonNull(data.getExtras()).getString(Constants.KEY_GROUP);
                        KeyGroupResponse keyGroupResponse = ApiModelUtils.fromJson(keyGroupS, KeyGroupResponse.class);
                        assert keyGroupResponse != null;
                        updateKeyGroup(keyGroupResponse.getId());
                    }else {
                        viewModel.page = 0;
                        getKey();
                    }
                }
            }
    });

    @Override
    public int getLayoutId() {
        return R.layout.activity_key_group;
    }

    @Override
    public int getBindingVariable() {
        return BR.vm;
    }

    @Override
    public void performDependencyInjection(ActivityComponent buildComponent) {
        buildComponent.inject(this);
    }

    @SuppressLint({"ClickableViewAccessibility", "NotifyDataSetChanged"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        keyGroupAdapter = new KeyGroupAdapter();
        setupAdapter();
        observeValidKey();
        refreshLayout();
        observeGroupKey();
        viewBinding.btnAdd.setOnTouchListener(this);
    }

    private void refreshLayout() {
        viewBinding.swipeLayout.setOnRefreshListener(() -> {
            viewModel.page = 0;
            getKey();
            viewBinding.swipeLayout.setRefreshing(false);
        });
    }

    private void observeValidKey() {
        viewModel.validKey.observe(this, valid->{
            Timber.d("CHECK KEY");
            if(valid){
                getKey();
                viewModel.isValidKey.set(true);
            }else {
                showInputKey();
                viewModel.isValidKey.set(false);
            }
        });
    }

    @SuppressLint("NotifyDataSetChanged")
    private void observeGroupKey() {
        viewModel.keyGroupResponseLiveData.observe(this, keyGroupResponses -> {
            if (keyGroupResponses == null || keyGroupResponses.isEmpty()) {
                viewModel.showErrorMessage(getString(R.string.do_not_have_any_data));
                return;
            }
            keyGroupAdapter.addList(keyGroupResponses);
            keyGroupAdapter.notifyDataSetChanged();
        });
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                xAxis = v.getX() - event.getRawX();
                yAxis = v.getY() - event.getRawY();
                initialX = event.getRawX();
                initialY = event.getRawY();
                lastAction = MotionEvent.ACTION_DOWN;
                break;

            case MotionEvent.ACTION_MOVE:
                float newX = event.getRawX() + xAxis;
                float newY = event.getRawY() + yAxis;

                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int screenWidth = displayMetrics.widthPixels;
                int screenHeight = displayMetrics.heightPixels;

                int viewWidth = v.getWidth();
                int viewHeight = v.getHeight();

                if (newX < 0) {
                    newX = 0;
                } else if (newX + viewWidth > screenWidth) {
                    newX = screenWidth - viewWidth;
                }

                if (newY < 0) {
                    newY = 0;
                } else if (newY + viewHeight > screenHeight) {
                    newY = screenHeight - viewHeight;
                }

                v.setX(newX);
                v.setY(newY);
                lastAction = MotionEvent.ACTION_MOVE;
                break;

            case MotionEvent.ACTION_UP:
                if (lastAction == MotionEvent.ACTION_DOWN) {
                    v.performClick();
                } else {
                    float finalX = event.getRawX();
                    float finalY = event.getRawY();
                    float distance = (float) Math.sqrt(Math.pow(finalX - initialX, 2) + Math.pow(finalY - initialY, 2));
                    if (distance < Constants.CLICK_ACTION_THRESHOLD) {
                        navigateToDetails();
                    }
                }
                break;

            default:
                return false;
        }
        return true;
    }

    public void navigateToDetails(){
        Intent intent = new Intent(getApplicationContext(), KeyGroupDetailsActivity.class);
        intent.putExtra(Constants.IS_CREATE, true);
        activityResultLauncher.launch(intent);
        viewModel.positionUC.set(null);
    }

    private void getKey(){
        if (viewModel.page == 0) {
            viewModel.showLoading();
        }
        viewModel.getAllKeyGroups();
    }

    public void setupAdapter(){
        keyGroupAdapter.setLock(!checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_DELETE));
        LinearLayoutManager layout = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        viewBinding.rcKeys.setAdapter(keyGroupAdapter);

        keyGroupAdapter.setKeyGroupListener(new KeyGroupAdapter.KeyGroupListener() {
            @Override
            public void itemClick(int position, KeyGroupResponse KeyGroup) {
                if(!checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_GET)){
                    return;
                }
                viewModel.positionUC.set(position);
                Intent intent = new Intent(getApplicationContext(), KeyGroupDetailsActivity.class);
                intent.putExtra(Constants.KEY_GROUP_ID, KeyGroup.getId());
                activityResultLauncher.launch(intent);
            }

            @Override
            public void deleteKeyGroup(int position, KeyGroupResponse KeyGroup) {
                deleteAt(KeyGroup.getId(), position);
            }

        });

        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener
                = new EndlessRecyclerViewScrollListener(layout) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view){
                if (viewModel.page < viewModel.totalPage - 1) {
                    viewModel.page++;
                    getKey();
                }
            }
        };
        viewBinding.rcKeys.addOnScrollListener(endlessRecyclerViewScrollListener);
        viewBinding.rcKeys.setLayoutManager(layout);
    }

    public void deleteAt(Long id, int position){
        DeleteDialog deleteDialog = new DeleteDialog(getString(R.string.key_group), new DeleteDialog.DeleteListener() {
            @Override
            public void confirmDelete() {
                deleteKey(id, position);

            }
            @Override
            public void cancelDelete() {

            }
        });
        deleteDialog.show(this.getSupportFragmentManager(), Constants.DELETE_DIALOG);
    }

    public void deleteKey(Long id, int position){
        viewModel.showLoading();
        viewModel.compositeDisposable.add(viewModel.deleteKeyGroup(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .retryWhen(throwable ->
                        throwable.flatMap((Function<Throwable, ObservableSource<?>>) throwable1 -> {
                            if (NetworkUtils.checkNetworkError(throwable1)) {
                                viewModel.hideLoading();
                                return ((MVVMApplication) getApplicationContext()).showDialogNoInternetAccess();
                            }else{
                                return Observable.error(throwable1);
                            }
                        })
                )
                .subscribe(
                        response -> {
                            viewModel.hideLoading();
                            if (response.isResult()) {
                                keyGroupAdapter.deleteItem(position);
                                viewModel.totalElement.set(keyGroupAdapter.getItemCount());
                                viewModel.showSuccessMessage(getString(R.string.delete_key_group_success));
                            }else {
                                viewModel.showErrorMessage(response.getMessage());
                            }
                        }, throwable -> {
                            viewModel.hideLoading();
                            viewModel.showErrorMessage(application.getResources().getString(R.string.no_internet));
                        }
                ));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void updateKeyGroup(Long id){
        viewModel.getKeyGroupDetail(id, new CallBackApi<KeyGroupResponse>() {
            @Override
            public void doSuccess(KeyGroupResponse object) {
                keyGroupAdapter.updateItem(viewModel.positionUC.get(), object);
                viewModel.positionUC.set(null);
            }

            @Override
            public void doSuccess() {

            }

            @Override
            public void doError(Throwable throwable) {
                Timber.d(throwable);
            }
        });
    }
}

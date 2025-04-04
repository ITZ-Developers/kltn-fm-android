package com.finance.ui.key.group;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.finance.MVVMApplication;
import com.finance.R;
import com.finance.data.Repository;
import com.finance.data.model.api.ResponseStatus;
import com.finance.data.model.api.ResponseWrapper;
import com.finance.data.model.api.response.key.KeyGroupResponse;
import com.finance.ui.CallBackApi;
import com.finance.ui.base.BaseViewModel;
import com.finance.utils.NetworkUtils;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class KeyGroupViewModel extends BaseViewModel{

    public int page = 0;
    public int size = 20;
    public int totalPage = 0;

    public ObservableField<Integer> totalElement = new ObservableField<>();
    public ObservableField<Integer> positionUC = new ObservableField<>();
    public ObservableField<Boolean> isValidKey = new ObservableField<>(false);
    public MutableLiveData<List<KeyGroupResponse>> keyGroupResponseLiveData = new MutableLiveData<>();
    public KeyGroupViewModel(Repository repository, MVVMApplication application) {
        super(repository, application);
    }

    public Observable<ResponseStatus> deleteKeyGroup(Long id){
        return repository.getApiService().deleteKeyGroup(id);
    }

    public void getAllKeyGroups(){
        showLoading();
        compositeDisposable.add(repository.getApiService().getKeyGroupList(page, size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .retryWhen(throwable ->
                        throwable.flatMap((Function<Throwable, ObservableSource<?>>) throwable1 -> {
                            if (NetworkUtils.checkNetworkError(throwable1)) {
                                hideLoading();
                                return application.showDialogNoInternetAccess();
                            }else{
                                return Observable.error(throwable1);
                            }
                        })
                )
                .subscribe(
                        response -> {
                            if (response.isResult()) {
                                keyGroupResponseLiveData.setValue(response.getData().getContent());
                                totalElement.set(response.getData().getTotalElements().intValue());
                                totalPage = response.getData().getTotalPages();
                            }
                            hideLoading();
                        }, throwable -> {
                            hideLoading();
                            showErrorMessage(application.getResources().getString(R.string.no_internet));
                        }
                ));
    }

    public void getKeyGroupDetail(long id, CallBackApi<KeyGroupResponse> callBack){
        showLoading();
        compositeDisposable.add(repository.getApiService().getKeyGroupDetail(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .retryWhen(throwable ->
                        throwable.flatMap((Function<Throwable, ObservableSource<?>>) throwable1 -> {
                            if (NetworkUtils.checkNetworkError(throwable1)) {
                                hideLoading();
                                return application.showDialogNoInternetAccess();
                            }else{
                                return Observable.error(throwable1);
                            }
                        })
                )
                .subscribe(
                        response -> {
                            if (response.isResult()) {
                                callBack.doSuccess(response.getData());
                            }
                            hideLoading();
                        }, throwable -> {
                            callBack.doError(throwable);
                            hideLoading();
                            showErrorMessage(application.getResources().getString(R.string.no_internet));
                        }
                ));
    }
}

package com.finance.ui.fragment.account;


import static android.app.Activity.RESULT_OK;

import android.Manifest;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

import com.finance.BR;
import com.finance.R;
import com.finance.constant.Constants;
import com.finance.data.model.api.request.account.UpdateProfileRequest;
import com.finance.data.model.api.request.privatekey.PrivateKeyRequest;
import com.finance.databinding.FragmentAccountBinding;
import com.finance.di.component.FragmentComponent;
import com.finance.ui.base.BaseFragment;
import com.finance.ui.dialog.DownLoadDialog;
import com.finance.ui.fragment.account.update.UpdateProfileActivity;
import com.finance.utils.BindingUtils;
import com.finance.utils.DateUtils;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import timber.log.Timber;

public class AccountFragment extends BaseFragment<FragmentAccountBinding, AccountFragmentViewModel>
        implements DownLoadDialog.Listener
{
    //Set up activityResultLauncher for update profile
    ActivityResultLauncher<Intent> activityResultLauncher =
            getIntentActivityResultLauncher();

    DownLoadDialog downLoadDialog;

    @Override
    public int getBindingVariable() {
        return BR.vm;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_account;
    }

    @Override
    protected void performDataBinding() {
        viewModel.filePath.observe(this, filePath -> {
            if (filePath != null) {
                BindingUtils.setImageUrl(binding.imgAccountIcon,
                        Objects.requireNonNull(viewModel.profile.get()).getAvatarPath());
            }
        });
    }

    public void goToUpdateProfile(){
        Intent intent = new Intent(getActivity(), UpdateProfileActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.ACCOUNT_RESPONSE, viewModel.profile.get());
        intent.putExtras(bundle);
        activityResultLauncher.launch(intent);
    }

    @Override
    protected void performDependencyInjection(FragmentComponent buildComponent) {
        buildComponent.inject(this);
    }

    public void requestKey(){
        viewModel.showLoading();
        if (downLoadDialog.password.get() == null || Objects.requireNonNull(downLoadDialog.password.get()).isEmpty()) {
            viewModel.showErrorMessage(getString(R.string.invalid_password));
            viewModel.hideLoading();
            return;
        }
        compositeDisposable.add(viewModel.requestKey(
                new PrivateKeyRequest(downLoadDialog.password.get()))
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                    response -> {
                        viewModel.fileContent = response;
                        if (android.os.Build.VERSION.SDK_INT == android.os.Build.VERSION_CODES.Q) {
                            saveFileToDownloads(response);
                        }else {
                            viewModel.saveFile2(response);
                        }
                        downLoadDialog.dismiss();
                        viewModel.hideLoading();
                    },
                    throwable -> {
                        viewModel.hideLoading();
                        if (throwable instanceof HttpException) {
                            // Handle HTTP errors
                            HttpException httpException = (HttpException) throwable;
                            ResponseBody errorBody = Objects.requireNonNull(httpException.response()).errorBody();
                            try {
                                if (errorBody != null) {
                                    String errorResponse = errorBody.string();
                                    // Parse the error response (JSON parsing example)
                                    JSONObject jsonObject = new JSONObject(errorResponse);
//                                    String code = jsonObject.optString(getString(R.string.code), getString(R.string.unknown_code));
                                    String message = jsonObject.optString(getString(R.string.message), getString(R.string.unknown_code));
                                    // Log and display a specific error message
                                    if (message.equals(getString(R.string.wrong_password_eng))) {
                                        viewModel.showErrorMessage(getString(R.string.wrong_password));
                                    } else {
                                        viewModel.showErrorMessage(message);
                                    }
                                }
                            } catch (Exception e) {
                                viewModel.showErrorMessage(getString(R.string.no_internet));
                            }
                        } else {

                            viewModel.showErrorMessage(getString(R.string.no_internet));
                        }
                    }
            ));
    }

    public void checkFilePermission(){
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q &&
                ContextCompat.checkSelfPermission(requireContext(),
                        Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(requireContext(),
                        Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

            ActivityResultLauncher<String[]> requestPermissionLauncher = registerForActivityResult(
                    new ActivityResultContracts.RequestMultiplePermissions(),
                    isGranted -> {
                        if (isGranted.containsValue(Boolean.FALSE)) {
                            Toast.makeText(getActivity(),
                                    getString(R.string.permission_storage_denied),
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            confirmDownloadFile();
                        }
                    });

            requestPermissionLauncher.launch( new String[]{
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE
            });
        }else {
            confirmDownloadFile();
        }
    }

    public void confirmDownloadFile(){
        downLoadDialog = new DownLoadDialog();
        downLoadDialog.setListener(this);
        downLoadDialog.show(getChildFragmentManager(), "Download File");
    }

    @Override
    public void confirm() {
        requestKey();
    }

    @Override
    public void cancel() {

    }

    @NonNull
    private ActivityResultLauncher<Intent> getIntentActivityResultLauncher() {
        return registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                activityResult -> {
                    int result = activityResult.getResultCode();
                    Intent data = activityResult.getData();
                    if (result == RESULT_OK && data != null) {
                        //Get data from UpdateProfileActivity
                        Bundle bundle = data.getExtras();
                        UpdateProfileRequest updateProfileRequest
                                = (UpdateProfileRequest) Objects.requireNonNull(bundle).getSerializable(Constants.UPDATE_PROFILE);
                        Objects.requireNonNull(viewModel.profile.get()).setAccountResponse(Objects.requireNonNull(updateProfileRequest));
                        viewModel.profile.notifyChange();
                        //Get avatarPath from UpdateProfileActivity
                        if (viewModel.profile.get() != null
                                && Objects.requireNonNull(viewModel.profile.get()).getAvatarPath() != null) {
                            BindingUtils.setImageUrl(binding.imgAccountIcon,
                                    Objects.requireNonNull(viewModel.profile.get()).getAvatarPath());
                        }
                    }
                }
        );
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    private void saveFileToDownloads(ResponseBody body) {
        ContentResolver resolver = requireActivity().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MediaStore.MediaColumns.DISPLAY_NAME, Constants.KEY_FILE_NAME + DateUtils.getCurrentDateTime() + ".txt");
        contentValues.put(MediaStore.MediaColumns.MIME_TYPE, "text/plain");
        contentValues.put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOWNLOADS);
        Uri uri = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
            uri = resolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        }

        if (uri != null) {
            try (OutputStream outputStream = resolver.openOutputStream(uri)) {
                byte[] fileReader = new byte[4096];
                InputStream inputStream = body.byteStream();
                while (true) {
                    int read = inputStream.read(fileReader);
                    if (read == -1) {
                        break;
                    }
                    Objects.requireNonNull(outputStream).write(fileReader, 0, read);
                }
                Objects.requireNonNull(outputStream).flush();
                viewModel.showSuccessMessage(getString(R.string.save_file_success));
            } catch (IOException e) {
                Timber.d(e);
                viewModel.showSuccessMessage(getString(R.string.save_file_failed));
            }
        }
    }




}
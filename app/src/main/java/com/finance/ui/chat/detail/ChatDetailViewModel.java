package com.finance.ui.chat.detail;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.finance.MVVMApplication;
import com.finance.R;
import com.finance.constant.Constants;
import com.finance.data.Repository;
import com.finance.data.model.api.ApiModelUtils;
import com.finance.data.model.api.request.chat.ChatRoomUpdateRequest;
import com.finance.data.model.api.request.chat.MessageReactionRequest;
import com.finance.data.model.api.request.chat.MessageSendRequest;
import com.finance.data.model.api.request.chat.MessageUpdateRequest;
import com.finance.data.model.api.response.chat.ChatRoomResponse;
import com.finance.data.model.api.response.chat.detail.ChatDetailResponse;
import com.finance.data.model.api.response.document.DocumentResponse;
import com.finance.data.socket.Command;
import com.finance.data.socket.dto.Message;
import com.finance.ui.base.BaseViewModel;
import com.finance.utils.NetworkUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import timber.log.Timber;

public class ChatDetailViewModel extends BaseViewModel {
    public ObservableField<Boolean> isValidKey = new ObservableField<>(false);
    public ObservableField<String> isSearchEmpty = new ObservableField<>("");
    public ObservableField<Boolean> isSearch = new ObservableField<>(false);
    public ObservableField<Boolean> canEdit = new ObservableField<>(false);
    public ObservableField<ChatRoomResponse> chatRoomCurrent = new ObservableField<>(new ChatRoomResponse());
    public ObservableField<String> editTextSend = new ObservableField<>("");
    public ObservableField<Boolean> isTyping = new ObservableField<>(false);

    public MutableLiveData<List<ChatDetailResponse>> chatDetailLiveData = new MutableLiveData<>(new ArrayList<>());
    public List<ChatDetailResponse> listMessages = new ArrayList<>();
    public ObservableField<String> documentSend = new ObservableField<>("");

    public ObservableField<String> textSearch = new ObservableField<>("");
    public DocumentResponse currentDocument = new DocumentResponse();
    public Integer currentDocumentPosition = -1;
    public MutableLiveData<String> filePathDocuments = new MutableLiveData<>("");
    public MutableLiveData<String> filePathEditImage = new MutableLiveData<>("");
    public Boolean isEditingGroup = false;
    public ObservableField<String> avatarGroupUpdate = new ObservableField<>("");


    public ChatDetailViewModel(Repository repository, MVVMApplication application) {
        super(repository, application);
    }

    public void isShowSearch() {
        isSearch.set(Boolean.FALSE.equals(isSearch.get()));
    }

    public void setCanEdit() {
        canEdit.set(Boolean.FALSE.equals(canEdit.get()));
    }

    public String getStatus(String lastLoginStr) {
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT_FROM_API);
        try {
            Date lastLogin = formatter.parse(lastLoginStr);
            Date now = new Date();

            long diffMillis = now.getTime() - lastLogin.getTime();
            long diffMinutes = TimeUnit.MILLISECONDS.toMinutes(diffMillis);
            long diffHours = TimeUnit.MILLISECONDS.toHours(diffMillis);
            long diffDays = TimeUnit.MILLISECONDS.toDays(diffMillis);

            if (diffMinutes <= 10) {
                return "Đang hoạt động";
            } else if (diffHours < 24) {
                return diffHours + " giờ trước";
            } else if (diffDays <= 7) {
                return diffDays + " ngày trước";
            } else {
                return "";
            }
        } catch (ParseException e) {
            Timber.e("ParseException: %s", e.getMessage());
            return "";
        }
    }

    public void getChatDetail(Long id){
        compositeDisposable.add(repository.getApiService().getChatDetail(id, 0)
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
                                chatDetailLiveData.setValue(response.getData().getContent());
                            }
                            hideLoading();
                        }, throwable -> {
                            hideLoading();
                            Timber.tag("ChatDetailViewModel").e(throwable);
                            showErrorMessage(application.getResources().getString(R.string.no_internet));
                        }
                ));
    }

    public void getChatRoomDetail(Long id) {
        showLoading();
        compositeDisposable.add(repository.getApiService().getChatRoomDetail(id)
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
                                chatRoomCurrent.set(response.getData());
                            }
                            hideLoading();
                        }, throwable -> {
                            hideLoading();
                            Timber.tag("ChatDetailViewModel").e(throwable);
                            showErrorMessage(application.getResources().getString(R.string.no_internet));
                        }
                ));
    }

    public void sendMessage(MessageSendRequest request){
        showLoading();
        compositeDisposable.add(repository.getApiService().createMessage(request)
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
                                editTextSend.set("");
                                documentSend.set("");
                            }
                            hideLoading();
                        }, throwable -> {
                            hideLoading();
                            Timber.tag("ChatDetailViewModel").e(throwable);
                            showErrorMessage(application.getResources().getString(R.string.no_internet));
                        }
                ));
    }

    public void editMessage (MessageUpdateRequest request){
        showLoading();
        compositeDisposable.add(repository.getApiService().updateMessage(request)
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
                                showSuccessMessage(application.getResources().getString(R.string.message_edited));
                            }
                            hideLoading();
                        }, throwable -> {
                            hideLoading();
                            Timber.tag("ChatDetailViewModel").e(throwable);
                            showErrorMessage(application.getResources().getString(R.string.no_internet));
                        }
                ));
    }

    public void removeMessage (Long id){
        showLoading();
        compositeDisposable.add(repository.getApiService().removeMessage(id)
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
                                showSuccessMessage(application.getResources().getString(R.string.message_removed));
                            }
                            hideLoading();
                        }, throwable -> {
                            hideLoading();
                            Timber.tag("ChatDetailViewModel").e(throwable);
                            showErrorMessage(application.getResources().getString(R.string.no_internet));
                        }
                ));
    }

    public void reactMessage(MessageReactionRequest request){
        showLoading();
        compositeDisposable.add(repository.getApiService().reactMessage(request)
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
                                Timber.tag("ChatDetailViewModel").d("Message reaction updated successfully");
                            }
                            hideLoading();
                        }, throwable -> {
                            hideLoading();
                            Timber.tag("ChatDetailViewModel").e(throwable);
                            showErrorMessage(application.getResources().getString(R.string.no_internet));
                        }
                ));
    }

    public void doUploadFile(MultipartBody.Part imagePart){
        showLoading();
        RequestBody type = RequestBody.create("DOCUMENT", MediaType.parse("multipart/form-data"));
        compositeDisposable.add(repository.getApiMediaService().uploadFile(type, imagePart)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .retryWhen(throwable ->
                        throwable.flatMap((Function<Throwable, ObservableSource<?>>) throwable1 -> {
                            if (NetworkUtils.checkNetworkError(throwable1)) {
                                return application.showDialogNoInternetAccess();
                            }else{
                                return Observable.error(throwable1);
                            }
                        })
                )
                .subscribe(
                        response -> {
                            if(response.isResult() && response.getData() != null){
                                if (isEditingGroup) {
                                    filePathEditImage.setValue(response.getData().getFilePath());
                                } else {
                                    filePathDocuments.setValue(response.getData().getFilePath());
                                }
                            }else{
                                showErrorMessage(response.getMessage());
                            }
                            hideLoading();
                        },
                        throwable -> {
                            hideLoading();
                            Timber.e(throwable);
                            showErrorMessage(throwable.getMessage());
                        }
                )
        );
    }

    public void updateChatRoom(ChatRoomUpdateRequest request) {
        showLoading();
        compositeDisposable.add(repository.getApiService().updateChatRoom(request)
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
                                showSuccessMessage(application.getResources().getString(R.string.update_success));
                                getChatRoomDetail(chatRoomCurrent.get().getId());
                            }
                            hideLoading();
                        }, throwable -> {
                            hideLoading();
                            Timber.tag("ChatDetailViewModel").e(throwable);
                            showErrorMessage(application.getResources().getString(R.string.no_internet));
                        }
                ));
    }



    @Override
    public void messageReceived(Message message) {
        super.messageReceived(message);
        if(message != null && message.getResponseCode() == 200) {
            switch (message.getCmd()) {
                case Command.COMMAND_CLIENT_PING:
                case Command.COMMAND_CLIENT_INFO:
                    break;
                case Command.CMD_NEW_MESSAGE:
                case Command.CMD_MESSAGE_UPDATED:
                    getChatDetail(chatRoomCurrent.get().getId());
                    break;

            }
        }else if(message != null && message.getResponseCode() == 400){
            switch (message.getCmd()) {
                case Command.CMD_MESSAGE_UPDATED:

            }
        }else {
            application.getCurrentActivity().runOnUiThread(this::hideLoading);
        }
    }
}

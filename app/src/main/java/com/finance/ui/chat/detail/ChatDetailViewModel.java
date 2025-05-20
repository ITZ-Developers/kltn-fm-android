package com.finance.ui.chat.detail;

import android.os.Build;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.finance.MVVMApplication;
import com.finance.R;
import com.finance.constant.Constants;
import com.finance.data.Repository;
import com.finance.data.model.api.response.chat.ChatRoomResponse;
import com.finance.data.model.api.response.chat.chatdetail.ChatDetailResponse;
import com.finance.ui.base.BaseViewModel;
import com.finance.utils.NetworkUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;
import timber.log.Timber;

public class ChatDetailViewModel extends BaseViewModel {
    public ObservableField<Boolean> isValidKey = new ObservableField<>(false);
    public ObservableField<String> isSearchEmpty = new ObservableField<>("");
    public ObservableField<Boolean> isSearch = new ObservableField<>(false);
    public ObservableField<ChatRoomResponse> chatRoomCurrent = new ObservableField<>(new ChatRoomResponse());

    public MutableLiveData<List<ChatDetailResponse>> chatDetailLiveData = new MutableLiveData<>(new ArrayList<>());


    public ChatDetailViewModel(Repository repository, MVVMApplication application) {
        super(repository, application);
    }

    public void isShowSearch() {
        isSearch.set(Boolean.FALSE.equals(isSearch.get()));
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
        showLoading();
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
}

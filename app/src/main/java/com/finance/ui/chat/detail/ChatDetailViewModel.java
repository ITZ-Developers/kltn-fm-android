package com.finance.ui.chat.detail;

import androidx.databinding.ObservableField;

import com.finance.MVVMApplication;
import com.finance.data.Repository;
import com.finance.ui.base.BaseViewModel;

public class ChatDetailViewModel extends BaseViewModel {
    public ObservableField<Boolean> isValidKey = new ObservableField<>(false);
    public ObservableField<String> isSearchEmpty = new ObservableField<>("");
    public ObservableField<Boolean> isSearch = new ObservableField<>(false);

    public ChatDetailViewModel(Repository repository, MVVMApplication application) {
        super(repository, application);
    }

    public void isShowSearch() {
        isSearch.set(Boolean.FALSE.equals(isSearch.get()));
    }
}

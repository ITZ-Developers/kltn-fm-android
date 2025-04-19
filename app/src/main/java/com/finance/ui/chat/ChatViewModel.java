package com.finance.ui.chat;

import androidx.databinding.ObservableField;

import com.finance.MVVMApplication;
import com.finance.data.Repository;
import com.finance.ui.base.BaseViewModel;

public class ChatViewModel extends BaseViewModel {
    public ObservableField<Boolean> isValidKey = new ObservableField<>(false);
    public ObservableField<String> isSearchEmpty = new ObservableField<>("");

    public ObservableField<Boolean> isSearch = new ObservableField<>(false);

    public ChatViewModel(Repository repository, MVVMApplication application) {
        super(repository, application);
    }

    public void isShowSearch() {
        isSearch.set(Boolean.FALSE.equals(isSearch.get()));
    }
}

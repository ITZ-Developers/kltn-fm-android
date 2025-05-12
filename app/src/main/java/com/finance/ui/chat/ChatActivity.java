package com.finance.ui.chat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import androidx.annotation.Nullable;
import androidx.databinding.Observable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.finance.BR;
import com.finance.R;
import com.finance.data.SecretKey;
import com.finance.databinding.ActivityChatBinding;
import com.finance.di.component.ActivityComponent;
import com.finance.ui.base.BaseActivity;
import com.finance.ui.chat.detail.ChatDetailActivity;

import java.util.ArrayList;

public class ChatActivity extends BaseActivity<ActivityChatBinding, ChatViewModel> {
    ChatRoomAdapter chatRoomAdapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_chat;
    }

    @Override
    public int getBindingVariable() {
        return BR.vm;
    }

    @Override
    public void performDependencyInjection(ActivityComponent buildComponent) {
        buildComponent.inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupSearch();
        setupAdapter();
        setupSwipeFreshLayout();
    }

    private void setupAdapter() {
        chatRoomAdapter = new ChatRoomAdapter(new ArrayList<>(), chat -> {
            // Handle click
            Intent intent = new Intent(this, ChatDetailActivity.class);
            ChatDetailActivity.CHAT_RESPONSE = chat;
            startActivity(intent);
        });
        chatRoomAdapter.setSecretKey(SecretKey.getInstance().getKey());

        viewModel.getAllChatRooms();

        observeChatRoomList(chatRoomAdapter);

        viewBinding.rcvChat.setLayoutManager(new LinearLayoutManager(this));
        viewBinding.rcvChat.setAdapter(chatRoomAdapter);
    }

    private void observeChatRoomList(ChatRoomAdapter chatRoomAdapter) {
        viewModel.chatRoomLiveData.observe(this, chatRooms -> {
            if (chatRooms == null) {
                return;
            }
            chatRoomAdapter.setChatList(chatRooms);
            chatRoomAdapter.notifyDataSetChanged();
        });
    }

    private void setupSearch() {
        viewBinding.edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String editSearch = viewBinding.edtSearch.getText().toString();
                viewModel.isSearchEmpty.set(editSearch);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        viewModel.isSearch.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (Boolean.TRUE.equals(viewModel.isSearch.get())){
                    viewBinding.edtSearch.requestFocus();
                    showKeyboard();
                }
            }
        });
        //Set hint italic
        SpannableString spannableHint = new SpannableString(viewBinding.edtSearch.getHint());
        spannableHint.setSpan(new StyleSpan(Typeface.ITALIC), 0, viewBinding.edtSearch.getHint().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        viewBinding.edtSearch.setHint(spannableHint);
    }

    public void deleteEditSearch(){
        viewBinding.edtSearch.setText("");
    }

    @SuppressLint("NotifyDataSetChanged")
    private void setupSwipeFreshLayout() {
        viewBinding.swipeLayout.setEnabled(true);
        viewBinding.swipeLayout.setOnRefreshListener(() -> {
            if (checkSecretKeyValid()){
                chatRoomAdapter.setChatList(new ArrayList<>());
                viewModel.getAllChatRooms();
                viewBinding.swipeLayout.setRefreshing(false);
            } else
            {
                if (chatRoomAdapter != null){
                    chatRoomAdapter.setChatList(new ArrayList<>());
                    chatRoomAdapter.notifyDataSetChanged();
                }
                viewBinding.swipeLayout.setRefreshing(false);
                this.showInputKey();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (Boolean.TRUE.equals(viewModel.isSearch.get())){
            viewModel.isShowSearch();
            deleteEditSearch();
            hideKeyboard();
        } else {
            super.onBackPressed();
        }
    }
}

package com.finance.ui.chat.detail;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.finance.BR;
import com.finance.R;
import com.finance.data.model.api.response.chat.ChatRoomResponse;
import com.finance.databinding.ActivityChatDetailBinding;
import com.finance.di.component.ActivityComponent;
import com.finance.ui.base.BaseActivity;
import com.finance.ui.chat.adapter.MessageAdapter;

import java.util.ArrayList;

public class ChatDetailActivity  extends BaseActivity<ActivityChatDetailBinding, ChatDetailViewModel> {

    private MessageAdapter adapter;
    public static ChatRoomResponse CHAT_ROOM_RESPONSE = null;

    @Override
    public int getLayoutId() {
        return R.layout.activity_chat_detail;
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

        viewModel.chatRoomCurrent.set(CHAT_ROOM_RESPONSE);
        setupAdapter();
        viewModel.getChatDetail(CHAT_ROOM_RESPONSE.getId());
        observeMessages();
    }

    @SuppressLint("NotifyDataSetChanged")
    private void observeMessages() {
        viewModel.chatDetailLiveData.observe(this, chatDetailResponse -> {
            if (chatDetailResponse != null) {
                adapter.setMessages(chatDetailResponse);
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void setupAdapter() {
        adapter = new MessageAdapter(new ArrayList<>());
        viewBinding.rcvMessage.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true));
        viewBinding.rcvMessage.setAdapter(adapter);
    }

    public void deleteEditSearch(){
        viewBinding.edtSearch.setText("");
    }

    @Override
    protected void onDestroy() {
        CHAT_ROOM_RESPONSE = null;
        super.onDestroy();
    }
}

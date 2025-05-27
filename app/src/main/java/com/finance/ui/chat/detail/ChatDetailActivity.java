package com.finance.ui.chat.detail;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.finance.BR;
import com.finance.R;
import com.finance.data.model.api.request.chat.MessageReactionRequest;
import com.finance.data.model.api.request.chat.MessageSendRequest;
import com.finance.data.model.api.request.chat.MessageUpdateRequest;
import com.finance.data.model.api.response.chat.ChatRoomResponse;
import com.finance.data.model.api.response.chat.MessageReaction;
import com.finance.data.model.api.response.chat.detail.ChatDetailResponse;
import com.finance.databinding.ActivityChatDetailBinding;
import com.finance.di.component.ActivityComponent;
import com.finance.ui.base.BaseActivity;
import com.finance.ui.chat.adapter.MessageAdapter;
import com.finance.ui.chat.adapter.MessageSearchAdapter;
import com.finance.ui.dialog.EditMessageDialog;
import com.finance.ui.dialog.ListReactionsDialog;
import com.finance.ui.dialog.MessageOptionsDialog;
import com.finance.ui.dialog.RemoveMessageDialog;

import java.util.ArrayList;
import java.util.List;

import timber.log.Timber;

public class ChatDetailActivity  extends BaseActivity<ActivityChatDetailBinding, ChatDetailViewModel> {

    private MessageAdapter adapter;
    private MessageSearchAdapter searchAdapter;
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
        setupSearchAdapter();
        setupSearch();

        viewModel.showLoading();
        viewModel.getChatDetail(CHAT_ROOM_RESPONSE.getId());
        observeMessages();

        viewModel.editTextSend.addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                if (viewModel.editTextSend.get() != null && !viewModel.editTextSend.get().isEmpty()) {
                    viewModel.isTyping.set(true);
                } else  {
                    viewModel.isTyping.set(false);
                }
            }
        });

        viewBinding.imgSend.setOnClickListener(v -> {
            try {
                sendMessage();
            } catch (Exception e) {
                Timber.e(e, "Error sending message");
            }
        });
    }

    @SuppressLint("NotifyDataSetChanged")
    private void observeMessages() {
        viewModel.chatDetailLiveData.observe(this, chatDetailResponse -> {
            if (chatDetailResponse != null) {
                viewModel.listMessages = new ArrayList<>(chatDetailResponse);
                for (int i = 0; i < viewModel.listMessages.size(); i++) {
                    ChatDetailResponse message = viewModel.listMessages.get(i);
                    message.setContent(decrypt(message.getContent()));
                    message.setPositionInChat(i);
                }
                adapter.setMessages(viewModel.listMessages);
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void setupAdapter() {
        adapter = new MessageAdapter(new ArrayList<>(), new MessageAdapter.OnMessageClickListener() {
            @Override
            public void onMessageLongClick(ChatDetailResponse message, int position) {
                MessageOptionsDialog dialog = new MessageOptionsDialog(
                        ChatDetailActivity.this,
                        message,
                        position,
                        new MessageOptionsDialog.MessageOptionsListener() {
                            @Override
                            public void onEmojiSelected(String emoji, ChatDetailResponse message, int position) {
                                MessageReactionRequest reactionRequest = new MessageReactionRequest();
                                reactionRequest.setMessageId(message.getId());
                                switch (emoji) {
                                    case MessageReaction.EMOJI_KIND_1:
                                        reactionRequest.setKind(1);
                                        break;
                                    case MessageReaction.EMOJI_KIND_2:
                                        reactionRequest.setKind(2);
                                        break;
                                    case MessageReaction.EMOJI_KIND_3:
                                        reactionRequest.setKind(3);
                                        break;
                                    case MessageReaction.EMOJI_KIND_4:
                                        reactionRequest.setKind(4);
                                        break;
                                    case MessageReaction.EMOJI_KIND_5:
                                        reactionRequest.setKind(5);
                                        break;
                                    default:
                                        reactionRequest.setKind(0);
                                }
                                viewModel.reactMessage(reactionRequest);
                            }

                            @Override
                            public void onEditMessage(ChatDetailResponse message, int position) {
                                // Xử lý chỉnh sửa tin nhắn
                                showEditMessageDialog(message, position);
                            }

                            @Override
                            public void onRecallMessage(ChatDetailResponse message, int position) {
                                // Xử lý thu hồi tin nhắn
                                showRecallConfirmDialog(message, position);
                            }
                        }
                );
                dialog.show();
            }

            @Override
            public void onReactionClick(List<MessageReaction> reactions, MessageReaction reaction) {
                ListReactionsDialog dialog = new ListReactionsDialog(
                        ChatDetailActivity.this,
                        reactions
                );
                dialog.show();
            }
        });
        viewBinding.rcvMessage.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true));
        viewBinding.rcvMessage.setAdapter(adapter);
    }

    private void setupSearchAdapter() {
        searchAdapter = new MessageSearchAdapter(new ArrayList<>(), new MessageSearchAdapter.OnMessageSearchClickListener() {
            @Override
            public void onMessageSearchClick(ChatDetailResponse message) {
                hideKeyboard();
                viewModel.isShowSearch();
                scrollToPosition(message.getPositionInChat());
            }
        });
        viewBinding.rcvMessageSearch.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        viewBinding.rcvMessageSearch.setAdapter(searchAdapter);
    }

    private void showEditMessageDialog(ChatDetailResponse message, int position) {
        EditMessageDialog dialog = new EditMessageDialog(this, message, position, new EditMessageDialog.OnEditMessageListener() {
            @Override
            public void onMessageEdited(String newContent, ChatDetailResponse message, int position) {
                MessageUpdateRequest messageSendRequest = new MessageUpdateRequest();
                messageSendRequest.setId(message.getId());
                messageSendRequest.setContent(encrypt(newContent));
                messageSendRequest.setDocument(message.getDocument());
                viewModel.editMessage(messageSendRequest);
            }

            @Override
            public void onMessageUploaded(ChatDetailResponse message, int position) {

            }
        });
        dialog.show();
    }

    private void showRecallConfirmDialog(ChatDetailResponse message, int position) {
        RemoveMessageDialog dialog = new RemoveMessageDialog(
                "",
                new RemoveMessageDialog.DeleteListener() {
                    @Override
                    public void confirmDelete() {
                        viewModel.removeMessage(message.getId());
                    }

                    @Override
                    public void cancelDelete() {
                        // Do nothing
                    }
                }
        );
        dialog.show(getSupportFragmentManager(), "RemoveMessageDialog");
    }

    public void deleteEditSearch(){
        viewBinding.edtSearch.setText("");
    }

    public void sendMessage() throws Exception {
        String content = encrypt(viewModel.editTextSend.get());
        String document = encrypt(viewModel.documentSend.get());
        MessageSendRequest messageSendRequest = new MessageSendRequest(CHAT_ROOM_RESPONSE.getId(), content, document);
        viewModel.sendMessage(messageSendRequest);
    }

    @Override
    protected void onDestroy() {
        CHAT_ROOM_RESPONSE = null;
        super.onDestroy();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setMessagesSearch(String searchText) {
        if (viewModel.listMessages == null || viewModel.listMessages.isEmpty()) {
            searchAdapter.setMessages(new ArrayList<>());
            searchAdapter.notifyDataSetChanged();
            return;
        }
        List<ChatDetailResponse> messageFilters = new ArrayList<>();
        for (int i = 0; i < viewModel.listMessages.size(); i++) {
            ChatDetailResponse message = viewModel.listMessages.get(i);
            if (message.getContent() != null && message.getContent().toLowerCase().contains(searchText.toLowerCase())) {
                messageFilters.add(message);
            }
        }
        searchAdapter.setMessages(messageFilters);
        searchAdapter.notifyDataSetChanged();
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
                setMessagesSearch(editSearch);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void scrollToPosition(int position) {
        if (viewBinding.rcvMessage.getLayoutManager() != null) {
            viewBinding.rcvMessage.getLayoutManager().scrollToPosition(position);
        }
    }


    @Override
    public void onBackPressed() {
        if (Boolean.TRUE.equals(viewModel.isSearch.get())){
            hideKeyboard();
            viewModel.isShowSearch();
            deleteEditSearch();
        } else {
            setResult(RESULT_OK);
            super.onBackPressed();
        }
    }
}

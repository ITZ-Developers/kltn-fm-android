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
import com.finance.data.model.api.response.debit.DebitResponse;
import com.finance.databinding.ActivityChatBinding;
import com.finance.di.component.ActivityComponent;
import com.finance.ui.base.BaseActivity;
import com.finance.ui.chat.detail.ChatDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends BaseActivity<ActivityChatBinding, ChatViewModel> {
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
        List<ChatResponse> sampleChats = new ArrayList<>();
        sampleChats.add(new ChatResponse("1", "David", "Hi there!", "9:40 AM", 0, R.drawable.ic_user_default));
        sampleChats.add(new ChatResponse("2", "John", "How are you?", "9:45 AM", 1, R.drawable.ic_user_default));
        sampleChats.add(new ChatResponse("3", "Alice", "Let's meet up!", "10:00 AM", 0, R.drawable.ic_user_default));
        sampleChats.add(new ChatResponse("4", "Bob", "See you later!", "10:15 AM", 1, R.drawable.ic_user_default));
        sampleChats.add(new ChatResponse("5", "Charlie", "Good morning!", "10:30 AM", 0, R.drawable.ic_user_default));
        sampleChats.add(new ChatResponse("6", "Eve", "Happy birthday!", "10:45 AM", 1, R.drawable.ic_user_default));

        ChatAdapter chatAdapter = new ChatAdapter(sampleChats, chat -> {
            // Handle click
            Intent intent = new Intent(this, ChatDetailActivity.class);
            ChatDetailActivity.CHAT_RESPONSE = chat;
            startActivity(intent);

        });
        viewBinding.rcvChat.setLayoutManager(new LinearLayoutManager(this));
        viewBinding.rcvChat.setAdapter(chatAdapter);
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

//                List<DebitResponse> debitResponseFilters = new ArrayList<>();
//                if (debits == null || debits.isEmpty()){
//                    return;
//                }
//
//                for (DebitResponse debitResponse : debits){
//                    if (debitResponse.getName().toLowerCase().contains(editSearch.toLowerCase())){
//                        debitResponseFilters.add(debitResponse);
//                    }
//                }
//                adapter.setListDebitResponse(debitResponseFilters);
//                adapter.notifyDataSetChanged();
//
//                viewModel.totalElements.set(debitResponseFilters.size());
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

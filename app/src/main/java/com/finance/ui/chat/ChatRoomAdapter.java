package com.finance.ui.chat;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.finance.data.model.api.response.chat.ChatRoomResponse;
import com.finance.databinding.ItemChatBinding;
import com.finance.utils.BindingUtils;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatRoomAdapter extends RecyclerView.Adapter<ChatRoomAdapter.ChatViewHolder> {
    private List<ChatRoomResponse> chatList;
    private OnChatClickListener listener;
    @Getter
    @Setter
    private String secretKey;

    public ChatRoomAdapter(List<ChatRoomResponse> chatList, OnChatClickListener listener) {
        this.chatList = new ArrayList<>();
        this.chatList.addAll(chatList);
        this.listener = listener;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setChatList(List<ChatRoomResponse> chatList) {
        this.chatList = chatList;
        notifyDataSetChanged();
    }

    public void addChat(ChatRoomResponse chat) {
        this.chatList.add(chat);
        notifyItemInserted(chatList.size() - 1);
    }



    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemChatBinding binding = ItemChatBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new ChatViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        ChatRoomResponse chat = chatList.get(position);
        holder.bind(chat);
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public class ChatViewHolder extends RecyclerView.ViewHolder {
        private ItemChatBinding binding;

        public ChatViewHolder(ItemChatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

            binding.getRoot().setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION && listener != null) {
                    listener.onChatClick(chatList.get(position));
                }
            });
        }

        public void bind(ChatRoomResponse chat) {
            binding.setItem(chat);
            BindingUtils.setImageUrl(binding.imgUser, chat.getAvatar());
            binding.setSecretKey(secretKey);
            binding.executePendingBindings();
            // Có thể thêm logic để hiển thị trạng thái tin nhắn dựa vào chat.getState()
            // Ví dụ: nếu state = 1 thì hiển thị biểu tượng đã đọc, state = 0 thì hiển thị chưa đọc
            // Hoặc có thể cài đặt hình ảnh người dùng nếu có URL trong ChatRoomResponse
        }
    }

    public interface OnChatClickListener {
        void onChatClick(ChatRoomResponse chat);
    }
}

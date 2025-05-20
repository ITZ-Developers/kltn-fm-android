package com.finance.ui.chat.adapter;

import android.annotation.SuppressLint;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.finance.R;
import com.finance.data.SecretKey;
import com.finance.data.model.api.response.chat.chatdetail.ChatDetailResponse;
import com.finance.databinding.ItemMessageBinding;
import com.finance.utils.AESUtils;
import com.finance.utils.BindingUtils;
import com.google.android.material.shape.ShapeAppearanceModel;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<ChatDetailResponse> messageList;

    public String secretKey;

    public MessageAdapter(List<ChatDetailResponse> messages) {
        this.messageList = messages;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setMessages(List<ChatDetailResponse> messages) {
        this.messageList = messages;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMessageBinding binding = ItemMessageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MessageViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        ChatDetailResponse message = messageList.get(position);
        holder.bind(message, position, messageList);
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        ItemMessageBinding binding;
        public MessageViewHolder(@NonNull ItemMessageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(ChatDetailResponse message, int position, List<ChatDetailResponse> messages) {
            // Determine if message is sent by current user
            boolean isSent = message.getIsSender();

            // Determine position in sequence
            boolean isTop = isTopMessage(position, messages);
            boolean isBottom = isBottomMessage(position, messages);

            // Get the appropriate shape appearance resource
            int shapeAppearanceRes;
            if (isSent) {
                if (isTop) {
                    shapeAppearanceRes = R.style.ShapeAppearance_App_ChatBubble_Sent_Top;
                } else if (isBottom) {
                    shapeAppearanceRes = R.style.ShapeAppearance_App_ChatBubble_Sent_Bottom;
                } else {
                    shapeAppearanceRes = R.style.ShapeAppearance_App_ChatBubble_Sent_Middle;
                }
            } else {
                if (isTop) {
                    shapeAppearanceRes = R.style.ShapeAppearance_App_ChatBubble_Received_Top;
                } else if (isBottom) {
                    shapeAppearanceRes = R.style.ShapeAppearance_App_ChatBubble_Received_Bottom;
                } else {
                    shapeAppearanceRes = R.style.ShapeAppearance_App_ChatBubble_Received_Middle;
                }
            }

            // Apply the shape appearance
            ShapeAppearanceModel shapeAppearanceModel = ShapeAppearanceModel.builder(
                    itemView.getContext(), 0, shapeAppearanceRes
            ).build();



            binding.cardView.setShapeAppearanceModel(shapeAppearanceModel);

            // Set bubble color based on sent/received
            binding.cardView.setCardBackgroundColor(
                    ContextCompat.getColor(
                            itemView.getContext(),
                            isSent ? R.color.sent_bubble_color : R.color.received_bubble_color
                    )
            );

            // Set the message text
            binding.textViewMessage.setText(AESUtils.decrypt(SecretKey.getInstance().getKey(), message.getContent()));


            // Set text color based on message type
            binding.textViewMessage.setTextColor(
                    ContextCompat.getColor(
                            itemView.getContext(),
                            isSent ? R.color.text_sent_color : R.color.text_received_color
                    )
            );

            // Position the bubble on the right or left side
            FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) binding.cardView.getLayoutParams();
            if (isSent) {
                params.gravity = Gravity.END;
                params.setMarginEnd(8);
            } else {
                params.gravity = Gravity.START;
                params.setMarginStart(8);
            }
            binding.cardView.setLayoutParams(params);

            // Set vertical spacing between bubble groups
//            if (isTop) {
//                params.topMargin = (int) itemView.getContext().getResources()
//                        .getDimension(R.dimen.chat_bubble_group_spacing);
//            } else {
//                params.topMargin = (int) itemView.getContext().getResources()
//                        .getDimension(R.dimen.chat_bubble_spacing);
//            }
        }

        private boolean isTopMessage(int position, List<ChatDetailResponse> messages) {
            return position == 0 || !messages.get(position).getSender().getId().equals(messages.get(position - 1).getSender().getId());
        }

        private boolean isBottomMessage(int position, List<ChatDetailResponse> messages) {
            return position == messages.size() - 1 || !messages.get(position).getSender().getId().equals(messages.get(position + 1).getSender().getId());
        }
    }
}

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
import com.finance.databinding.ItemMessageBinding;
import com.google.android.material.shape.ShapeAppearanceModel;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<MessageResponse> messageList;
    private final String currentUserId;

    public MessageAdapter(List<MessageResponse> messages, String currentUserId) {
        this.messageList = messages;
        this.currentUserId = currentUserId;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setMessages(List<MessageResponse> messages) {
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
        MessageResponse message = messageList.get(position);
        holder.bind(message, position, messageList, currentUserId);
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

        public void bind(MessageResponse message, int position, List<MessageResponse> messages, String currentUserId) {
            // Determine if message is sent by current user
            boolean isSent = message.getSenderId().equals(currentUserId);

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
            binding.textViewMessage.setText(message.getContent());

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

        private boolean isTopMessage(int position, List<MessageResponse> messages) {
            return position == 0 || !messages.get(position).getSenderId().equals(messages.get(position - 1).getSenderId());
        }

        private boolean isBottomMessage(int position, List<MessageResponse> messages) {
            return position == messages.size() - 1 || !messages.get(position).getSenderId().equals(messages.get(position + 1).getSenderId());
        }
    }
}

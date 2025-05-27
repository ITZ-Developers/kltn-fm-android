package com.finance.ui.chat.adapter;

import android.annotation.SuppressLint;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.finance.R;
import com.finance.data.SecretKey;
import com.finance.data.model.api.response.chat.AccountChatResponse;
import com.finance.data.model.api.response.chat.MessageReaction;
import com.finance.data.model.api.response.chat.detail.ChatDetailResponse;
import com.finance.databinding.ItemMessageBinding;
import com.finance.utils.AESUtils;
import com.google.android.material.shape.ShapeAppearanceModel;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<ChatDetailResponse> messageList;

    public String secretKey;

    public OnMessageClickListener listener;
    public interface OnMessageClickListener {
        void onMessageLongClick(ChatDetailResponse message, int position);
        void onReactionClick(List<MessageReaction> reactions, MessageReaction reaction);
    }

    public MessageAdapter(List<ChatDetailResponse> messages, OnMessageClickListener listener) {
        this.messageList = messages;
        this.listener = listener;
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
        holder.itemView.setOnLongClickListener(v -> {
            if (listener != null) {
                listener.onMessageLongClick(message, position);
            }
            return false;
        });

        if (message.getMessageReactions() != null && !message.getMessageReactions().isEmpty()) {
            holder.binding.listReactions.setVisibility(View.VISIBLE);
            holder.binding.listReactions.setLayoutManager(
                    new LinearLayoutManager(holder.itemView.getContext(), LinearLayoutManager.HORIZONTAL, false)
            );
            MessageReactionAdapter reactionAdapter = new MessageReactionAdapter(getListMessageReactionsByKind(message), new MessageReactionAdapter.OnReactionClickListener() {
                @Override
                public void onReactionClick(MessageReaction reaction, int position) {
                    if (listener != null) {
                        listener.onReactionClick(getListMessageReactionsByKind(message), reaction);
                    }
                }
            });
            holder.binding.listReactions.setAdapter(reactionAdapter);
        } else {
            holder.binding.listReactions.setVisibility(View.GONE);
        }
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

            binding.setItem(message);

            // Set the message text
            if (message.getIsDeleted()) {
                binding.textViewMessage.setText(R.string.text_removed);
            } else {
                binding.textViewMessage.setText(message.getContent());
            }

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

            ConstraintLayout.LayoutParams textParams = (ConstraintLayout.LayoutParams) binding.textViewMessage.getLayoutParams();
            if (isSent) {
                textParams.startToStart = ConstraintLayout.LayoutParams.UNSET;
                textParams.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID;
            } else {
                textParams.endToEnd = ConstraintLayout.LayoutParams.UNSET;
                textParams.startToStart = ConstraintLayout.LayoutParams.PARENT_ID;
            }
            binding.textViewMessage.setLayoutParams(textParams);

            LinearLayout.LayoutParams paramsEdited = (LinearLayout.LayoutParams) binding.tvIsEdited.getLayoutParams();
            if (isSent) {
                paramsEdited.gravity = Gravity.END;
                paramsEdited.setMarginEnd(8);
            } else {
                paramsEdited.gravity = Gravity.START;
                paramsEdited.setMarginStart(8);
            }
            binding.tvIsEdited.setLayoutParams(paramsEdited);

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

    public static List<MessageReaction> getListMessageReactionsByKind(ChatDetailResponse currentItem) {
        List<MessageReaction> listMessageReactions = new ArrayList<>(currentItem.getMessageReactions());
        Map<Integer, MessageReaction> reactionMap = new LinkedHashMap<>();
        for (MessageReaction reaction : listMessageReactions) {
            Integer kind = reaction.getKind();
            if (reactionMap.containsKey(kind)) {
                MessageReaction existingReaction = reactionMap.get(kind);
                existingReaction.setTotalReactions(existingReaction.getTotalReactions() + 1);
                existingReaction.getAccountReactions().add(existingReaction.getAccount());
            } else {
                MessageReaction newReaction = new MessageReaction();
                newReaction.setKind(reaction.getKind());
                newReaction.setTotalReactions(1);
                List<AccountChatResponse> accounts = new ArrayList<>();
                accounts.add(reaction.getAccount());
                newReaction.setAccountReactions(accounts);
                reactionMap.put(kind, newReaction);
            }
        }
        return new ArrayList<>(reactionMap.values());
    }


}

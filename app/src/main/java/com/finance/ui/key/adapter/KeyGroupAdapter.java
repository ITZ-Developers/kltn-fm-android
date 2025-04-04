package com.finance.ui.key.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chauthai.swipereveallayout.ViewBinderHelper;
import com.finance.data.SecretKey;
import com.finance.data.model.api.response.key.KeyGroupResponse;
import com.finance.databinding.ItemKeyGroupBinding;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class KeyGroupAdapter extends RecyclerView.Adapter<KeyGroupAdapter.KeyGroupViewHolder> {

    @Getter
    private List<KeyGroupResponse> keyGroups;

    private final ViewBinderHelper viewBinderHelper = new ViewBinderHelper();

    public KeyGroupAdapter(){
        viewBinderHelper.setOpenOnlyOne(true);
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setKeyGroups(List<KeyGroupResponse> keyGroups){
        this.keyGroups = keyGroups;
        notifyDataSetChanged();
    }
    @Getter
    @Setter
    private KeyGroupListener keyGroupListener;
    @Getter
    @Setter
    private boolean lock;

    public void updateItem(Integer position, KeyGroupResponse keyGroupResponse) {
        keyGroups.set(position, keyGroupResponse);
        notifyItemChanged(position);
    }

    public interface KeyGroupListener{
        void itemClick(int position, KeyGroupResponse KeyGroup);
        void deleteKeyGroup(int position, KeyGroupResponse KeyGroup);
    }
    @NonNull
    @Override
    public KeyGroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemKeyGroupBinding binding = ItemKeyGroupBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        return new KeyGroupViewHolder(binding,keyGroupListener);
    }

    @Override
    public void onBindViewHolder(@NonNull KeyGroupViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public int getItemCount() {
        return keyGroups!= null? keyGroups.size() : 0;
    }

    public void addList(List<KeyGroupResponse> keyGroups){
        if(keyGroups == null){
            return;
        }
        this.keyGroups.addAll(keyGroups);
        notifyItemRangeInserted(this.keyGroups.size() - keyGroups.size(),keyGroups.size());
    }

    public void deleteItem(int position){
        keyGroups.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, keyGroups.size());
    }

    public class KeyGroupViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ItemKeyGroupBinding binding;
        KeyGroupListener keyGroupListener;
        int position;
        KeyGroupResponse keyGroup;
        public KeyGroupViewHolder(ItemKeyGroupBinding binding, KeyGroupListener KeyGroupListener) {
            super(binding.getRoot());
            this.binding = binding;
            binding.getRoot().setOnClickListener(this);
            this.keyGroupListener = KeyGroupListener;
        }

        void onBind(int position){
            this.position = position;
            keyGroup = keyGroups.get(position);
            viewBinderHelper.bind(binding.swipeRevealLayout, String.valueOf(keyGroup.getId()));
            if(lock){
                viewBinderHelper.lockSwipe(String.valueOf(keyGroup.getId()));
            }
            binding.setIvm(keyGroup);
            binding.setSecretKey(SecretKey.getInstance().getKey());
            binding.imgDelete.setOnClickListener(view -> {
                keyGroupListener.deleteKeyGroup(position,keyGroup);
                viewBinderHelper.closeLayout(String.valueOf(keyGroup.getId()));
            });
            binding.layoutMain.setOnClickListener(view -> keyGroupListener.itemClick(position,keyGroup));
            binding.executePendingBindings();
        }

        @Override
        public void onClick(View view) {
            keyGroupListener.itemClick(position, keyGroup);
        }
    }
}

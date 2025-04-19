package com.finance.ui.chat.detail;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.finance.BR;
import com.finance.R;
import com.finance.databinding.ActivityChatBinding;
import com.finance.databinding.ActivityChatDetailBinding;
import com.finance.di.component.ActivityComponent;
import com.finance.ui.base.BaseActivity;
import com.finance.ui.chat.ChatViewModel;
import com.finance.ui.chat.adapter.Message;
import com.finance.ui.chat.adapter.MessageAdapter;

import java.util.ArrayList;
import java.util.List;

public class ChatDetailActivity  extends BaseActivity<ActivityChatDetailBinding, ChatDetailViewModel> {

    private MessageAdapter adapter;
    private List<Message> messageList;

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


        adapter = new MessageAdapter(getSampleMessages(), CURRENT_USER_ID);
        viewBinding.rcvMessage.setLayoutManager(new LinearLayoutManager(this));
        viewBinding.rcvMessage.setAdapter(adapter);
    }
    // Current user ID
    public static final String CURRENT_USER_ID = "user_self";
    // Other user ID
    public static final String OTHER_USER_ID = "user_other";
    // Generate sample chat data
    public static List<Message> getSampleMessages() {
        List<Message> messages = new ArrayList<>();

        long currentTime = System.currentTimeMillis();
        // Base timestamp that we'll increment
        long baseTime = currentTime - 3600000; // 1 hour ago

        // Add conversation messages
        messages.add(new Message("msg1", OTHER_USER_ID, "Xin chào, bạn khỏe không?", baseTime));
        baseTime += 60000; // Add 1 minute

        messages.add(new Message("msg2", CURRENT_USER_ID, "Chào bạn! Mình khỏe, còn bạn thì sao?", baseTime));
        baseTime += 120000; // Add 2 minutes

        // A sequence of messages from the other user
        messages.add(new Message("msg3", OTHER_USER_ID, "Mình cũng khỏe, cảm ơn bạn!", baseTime));
        baseTime += 20000; // Add 20 seconds

        messages.add(new Message("msg4", OTHER_USER_ID, "Dạo này bạn có dự án gì mới không?", baseTime));
        baseTime += 15000; // Add 15 seconds

        messages.add(new Message("msg5", OTHER_USER_ID, "Mình đang làm một ứng dụng chat mới và cần một số ý kiến.", baseTime));
        baseTime += 180000; // Add 3 minutes

        // A sequence of messages from the current user
        messages.add(new Message("msg6", CURRENT_USER_ID, "Ồ, thú vị đấy!", baseTime));
        baseTime += 10000; // Add 10 seconds

        messages.add(new Message("msg7", CURRENT_USER_ID, "Mình cũng đang làm một ứng dụng chat.", baseTime));
        baseTime += 5000; // Add 5 seconds

        messages.add(new Message("msg8", CURRENT_USER_ID, "Mình đang cố gắng làm cho các chat bubble trông đẹp mắt.", baseTime));
        baseTime += 90000; // Add 1.5 minutes

        messages.add(new Message("msg9", OTHER_USER_ID, "Thật trùng hợp!", baseTime));
        baseTime += 60000; // Add 1 minute

        messages.add(new Message("msg10", CURRENT_USER_ID, "Phải không? Có thể chúng ta nên hợp tác.", baseTime));
        baseTime += 300000; // Add 5 minutes

        // Another sequence from the other user
        messages.add(new Message("msg11", OTHER_USER_ID, "Đó là một ý tưởng hay!", baseTime));
        baseTime += 25000; // Add 25 seconds

        messages.add(new Message("msg12", OTHER_USER_ID, "Bạn đã sử dụng thiết kế chat bubble nào chưa?", baseTime));
        baseTime += 40000; // Add 40 seconds

        messages.add(new Message("msg13", CURRENT_USER_ID, "Mình đang sử dụng MaterialCardView với các corner khác nhau.", baseTime));
        baseTime += 70000; // Add 1 minute 10 seconds

        messages.add(new Message("msg14", OTHER_USER_ID, "Nghe hay đấy! Gửi cho mình một ảnh chụp màn hình được không?", baseTime));
        baseTime += 65000; // Add 1 minute 5 seconds

        messages.add(new Message("msg15", CURRENT_USER_ID, "Chắc chắn rồi! Mình sẽ gửi cho bạn sau khi hoàn thành.", baseTime));

        return messages;
    }

    public void deleteEditSearch(){
        viewBinding.edtSearch.setText("");
    }
}

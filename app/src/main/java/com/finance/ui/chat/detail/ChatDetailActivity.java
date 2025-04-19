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


        adapter = new MessageAdapter(getSampleMessages(), "id1");
        viewBinding.rcvMessage.setLayoutManager(new LinearLayoutManager(this));
        viewBinding.rcvMessage.setAdapter(adapter);
    }
    // Current user ID
    public static final String ID1 = "id1";
    public static final String ID2 = "id2";

    public static List<Message> getSampleMessages() {
        List<Message> messages = new ArrayList<>();

        long currentTime = System.currentTimeMillis();
        long baseTime = currentTime - 3600000; // 1 hour ago

        messages.add(new Message("id1", ID1, "Xin chào, bạn khỏe không?", baseTime));
        baseTime += 60000;

        messages.add(new Message("id2", ID2, "Chào bạn! Mình khỏe, còn bạn thì sao?", baseTime));
        baseTime += 120000;

        messages.add(new Message("id1", ID1, "Mình cũng khỏe, cảm ơn bạn!", baseTime));
        baseTime += 20000;

        messages.add(new Message("id1", ID1, "Dạo này bạn có dự án gì mới không?", baseTime));
        baseTime += 15000;

        messages.add(new Message("id1", ID1, "Mình đang làm một ứng dụng chat mới và cần một số ý kiến.", baseTime));
        baseTime += 180000;

        messages.add(new Message("id2", ID2, "Ồ, thú vị đấy!", baseTime));
        baseTime += 10000;

        messages.add(new Message("id2", ID2, "Mình cũng đang làm một ứng dụng chat.", baseTime));
        baseTime += 5000;

        messages.add(new Message("id2", ID2, "Mình đang cố gắng làm cho các chat bubble trông đẹp mắt.", baseTime));
        baseTime += 90000;

        messages.add(new Message("id1", ID1, "Thật trùng hợp!", baseTime));
        baseTime += 60000;

        messages.add(new Message("id2", ID2, "Phải không? Có thể chúng ta nên hợp tác.", baseTime));
        baseTime += 300000;

        messages.add(new Message("id1", ID1, "Đó là một ý tưởng hay!", baseTime));
        baseTime += 25000;

        messages.add(new Message("id1", ID1, "Bạn đã sử dụng thiết kế chat bubble nào chưa?", baseTime));
        baseTime += 40000;

        messages.add(new Message("id2", ID2, "Mình đang sử dụng MaterialCardView với các corner khác nhau.", baseTime));
        baseTime += 70000;

        messages.add(new Message("id1", ID1, "Nghe hay đấy! Gửi cho mình một ảnh chụp màn hình được không?", baseTime));
        baseTime += 65000;

        messages.add(new Message("id2", ID2, "Chắc chắn rồi! Mình sẽ gửi cho bạn sau khi hoàn thành.", baseTime));

        return messages;
    }

    public void deleteEditSearch(){
        viewBinding.edtSearch.setText("");
    }
}

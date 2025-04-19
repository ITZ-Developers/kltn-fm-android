package com.finance.ui.chat.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    public static final int TYPE_TOP = 0;
    public static final int TYPE_MIDDLE = 1;
    public static final int TYPE_BOTTOM = 2;
    private String time;
    private String name;
    private String content;
    private String group;
    private String senderId;
    private int state;

    public Message(String senderId, String name, String content, long timestamp) {
        this.senderId = senderId;
        this.name = name;
        this.content = content;
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        this.time = timeFormat.format(new Date(timestamp));
        this.group = "";
        this.state = TYPE_MIDDLE;
    }
}

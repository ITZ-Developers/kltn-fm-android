package com.finance.ui.chat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatResponse {
    public static final String NAME = "CHAT_RESPONSE";
    private String id;
    private String name;
    private String lastMessage;
    private String time;
    private Integer state;
    private int avatar;
}

package com.finance.data.model.api.request.chat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageSendRequest {
    Long chatRoomId;
    String content;
    String document;
}

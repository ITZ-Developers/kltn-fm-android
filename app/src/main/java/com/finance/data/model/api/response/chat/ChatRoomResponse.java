package com.finance.data.model.api.response.chat;


import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatRoomResponse {
    private String avatar;
    private ZonedDateTime createdDate;
    private int id;
    private int kind;
    private MessageResponse lastMessage;
    private ZonedDateTime modifiedDate;
    private String name;
    private String otherAvatar;
    private String otherFullName;
    private AccountChatResponse owner;
    private String settings;
    private int status;
    private int totalMembers;
    private int totalUnreadMessages;
}

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
    private String createdDate;
    private Long id;
    private Long kind;
    private MessageResponse lastMessage;
    private String modifiedDate;
    private String name;
    private String otherAvatar;
    private String otherFullName;
    private AccountChatResponse owner;
    private String settings;
    private Integer status;
    private Integer totalMembers;
    private Integer totalUnreadMessages;
}

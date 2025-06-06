package com.finance.data.model.api.response.chat;

import java.time.ZonedDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponse {
    private Long id;
    private String content;
    private String createdDate;
    private String document;
    private List<MessageReaction> messageReactions;
    private String modifiedDate;
    private AccountChatResponse sender;
    private Integer status;
}

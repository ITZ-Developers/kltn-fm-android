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
    private String content;
    private ZonedDateTime createdDate;
    private String document;
    private int id;
    private List<MessageReaction> messageReactions;
    private ZonedDateTime modifiedDate;
    private AccountChatResponse sender;
    private int status;
}

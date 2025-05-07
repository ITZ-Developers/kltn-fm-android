package com.finance.data.model.api.response.chat;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageReaction {
    public AccountChatResponse account;
    public ZonedDateTime createdDate;
    public int id;
    public int kind;
    public ZonedDateTime modifiedDate;
    public int status;
}

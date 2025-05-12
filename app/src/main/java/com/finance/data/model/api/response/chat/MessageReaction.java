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
    public String createdDate;
    public Long id;
    public Integer kind;
    public String modifiedDate;
    public Integer status;
}

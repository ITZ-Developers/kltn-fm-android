package com.finance.data.model.api.response.chat.detail;

import com.finance.data.model.api.response.chat.AccountChatResponse;
import com.finance.data.model.api.response.chat.MessageReaction;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatDetailResponse {
    public static final int TYPE_TOP = 0;
    public static final int TYPE_MIDDLE = 1;
    public static final int TYPE_BOTTOM = 2;
    private Long id;
    private String createdDate;
    private AccountChatResponse sender;
    private String content;
    private Boolean isChildren;
    private Boolean isSender;
    private Boolean isReacted;
    private Integer totalReactions;
    private Integer totalSeenMembers;
    private List<AccountChatResponse> seenMembers;
    private Boolean isDeleted;
    private Boolean isUpdated;
    private List<MessageReaction> messageReactions;
    private String document;
    private Integer positionInChat;
}

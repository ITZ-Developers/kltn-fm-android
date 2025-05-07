package com.finance.data.model.api.response.chat;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountChatResponse {
    public String address;
    public String avatarPath;
    public String birthDate;
    public DepartmentChat department;
    public String email;
    public String fullName;
    public Group group;
    public int id;
    public boolean isFaceIdRegistered;
    public boolean isSuperAdmin;
    public int kind;
    public String phone;
    public String publicKey;
    public String secretKey;
    public int status;
    public String username;
}

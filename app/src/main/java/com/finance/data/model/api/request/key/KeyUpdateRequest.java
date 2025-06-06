package com.finance.data.model.api.request.key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeyUpdateRequest {
    private String additionalInformation;
    private String description;
    private Long keyInformationGroupId;
    private Long organizationId;
    private Integer kind;
    private String name;
    private String username;
    private String password;
    private Long id;
    private String document;
    private Long tagId;
}

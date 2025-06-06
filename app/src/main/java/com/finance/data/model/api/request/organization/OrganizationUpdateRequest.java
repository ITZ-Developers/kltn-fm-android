package com.finance.data.model.api.request.organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationUpdateRequest {
    Long id;
    String name;
    String logo;
}

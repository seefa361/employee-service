package com.square.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupportToolsAndApplicationDto {
    private Boolean airWatch;
    private Boolean microsoftTeam;
    private Boolean trainingAccess;
    private Boolean intranetAccess;
    private Boolean serviceNowPortal;
    private Boolean myAliciaPortal;
    private Boolean shareFolderAccess;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    private Integer employeeIdemployee;
}

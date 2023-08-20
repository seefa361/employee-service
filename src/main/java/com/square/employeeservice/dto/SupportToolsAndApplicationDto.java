package com.square.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupportToolsAndApplicationDto {
    private Byte airWatch;
    private Byte microsoftTeam;
    private Byte trainingAccess;
    private Byte intranetAccess;
    private Byte serviceNowPortal;
    private Byte myAliciaPortal;
    private Byte shareFolderAccess;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    private Integer employeeIdemployee;
}

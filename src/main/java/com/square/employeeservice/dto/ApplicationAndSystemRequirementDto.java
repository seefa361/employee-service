package com.square.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApplicationAndSystemRequirementDto {
    private Boolean acs;
    private String acsReplacementUserId;
    private Boolean ims;
    private String imsUserRoleDetails;
    private Boolean acsReports;
    private Boolean emotor;
    private Boolean dmsMotor;
    private Boolean dmsNonMotor;
    private Boolean dm;
    private Boolean finsFinder;
    private Boolean acsi;
    private Boolean photoCloud;
    private Boolean dmsOld;
    private String anyOther;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    private Integer employeeIdemployee;
}

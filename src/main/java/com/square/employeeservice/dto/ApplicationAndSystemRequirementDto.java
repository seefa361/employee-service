package com.square.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApplicationAndSystemRequirementDto {
    private Byte acs;
    private String acsReplacementUserId;
    private Byte ims;
    private String imsUserRoleDetails;
    private Byte acsReports;
    private Byte emotor;
    private Byte dmsMotor;
    private Byte dmsNonMotor;
    private Byte dm;
    private Byte finsFinder;
    private Byte acsi;
    private Byte photoCloud;
    private Byte dmsOld;
    private String anyOther;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    private Integer employeeIdemployee;
}

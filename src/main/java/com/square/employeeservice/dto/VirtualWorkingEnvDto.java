package com.square.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VirtualWorkingEnvDto {
    private Integer employeeIdemployee;
    private Boolean avc;
    private Boolean localCitrixLaptop;
    private Boolean localCitrixPc;
    private Boolean vpnCallCenter;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
}

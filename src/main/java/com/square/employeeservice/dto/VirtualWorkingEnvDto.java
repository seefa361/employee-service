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
    private Byte avc;
    private Byte localCitrixLaptop;
    private Byte localCitrixPc;
    private Byte vpnCallCenter;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
}

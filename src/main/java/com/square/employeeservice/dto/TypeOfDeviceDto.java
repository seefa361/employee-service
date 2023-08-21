package com.square.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TypeOfDeviceDto {
    private Integer idtypeOfDevice;
    private Boolean personalComputer;
    private Boolean laptopAndDataFacility;
    private Boolean thinClient;
    private Boolean phoneExtension;
    private Boolean deskPhone;
    private Boolean mobilePhone;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    private Integer employeeIdemployee;
}

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
    private Byte personalComputer;
    private Byte laptopAndDataFacility;
    private Byte thinClient;
    private Byte phoneExtension;
    private Byte deskPhone;
    private Byte mobilePhone;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;
    private Integer employeeIdemployee;
}

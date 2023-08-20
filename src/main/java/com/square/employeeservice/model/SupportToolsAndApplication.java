package com.square.employeeservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="SupportToolsAndApplication")
@AllArgsConstructor
@NoArgsConstructor
public class SupportToolsAndApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idsupportToolsAndApplication;
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

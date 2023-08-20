package com.square.employeeservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name="ApplicationAndSystemRequirement")
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationAndSystemRequirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idapplicationAndSystemRequirement;
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

    @OneToOne
    @JoinColumn(name = "employeeIdemployee")
    private Employee employee;



}

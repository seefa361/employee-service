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
@Table(name = "application_and_system_requirements")
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationAndSystemRequirement {
    @Id
    @SequenceGenerator(
            name = "application-and-system-requirement-seq",
            sequenceName = "application-and-system-requirement-seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "application-and-system-requirement-seq"
    )
    private Integer idapplicationAndSystemRequirement;
    @Column(name = "acs", columnDefinition = "boolean default false")
    private Boolean acs;

    @Column(name = "acs_replacement_user_id")
    private String acsReplacementUserId;

    @Column(name = "ims", columnDefinition = "boolean default false")
    private Boolean ims;

    @Column(name = "ims_user_role_details")
    private String imsUserRoleDetails;

    @Column(name = "acs_reports", columnDefinition = "boolean default false")
    private Boolean acsReports;

    @Column(name = "emotor", columnDefinition = "boolean default false")
    private Boolean emotor;

    @Column(name = "dms_motor", columnDefinition = "boolean default false")
    private Boolean dmsMotor;

    @Column(name = "dms_non_motor", columnDefinition = "boolean default false")
    private Boolean dmsNonMotor;

    @Column(name = "clm", columnDefinition = "boolean default false")
    private Boolean clm;

    @Column(name = "fins_finder", columnDefinition = "boolean default false")
    private Boolean finsFinder;

    @Column(name = "acsfl", columnDefinition = "boolean default false")
    private Boolean acsfl;

    @Column(name = "photo_cloud", columnDefinition = "boolean default false")
    private Boolean photoCloud;

    @Column(name = "dms_old", columnDefinition = "boolean default false")
    private Boolean dmsOld;

    @Column(name = "any_other")
    private String anyOther;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "modified_by", nullable = false)
    private String modifiedBy;

    @OneToOne
    @JoinColumn(name = "employeeIdemployee")
    private Employee employee;



}

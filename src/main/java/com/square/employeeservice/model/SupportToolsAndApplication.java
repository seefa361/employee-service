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
    @SequenceGenerator(
            name = "support-tools-and-application-seq",
            sequenceName = "support-tools-and-application-seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "support-tools-and-application-seq"
    )
    private Integer idsupportToolsAndApplication;
    @Column(name = "air_watch", nullable = false)
    private boolean airWatch;

    @Column(name = "microsoft_team", nullable = false)
    private boolean microsoftTeam;

    @Column(name = "training_access", nullable = false)
    private boolean trainingAccess;

    @Column(name = "intranet_access", nullable = false)
    private boolean intranetAccess;

    @Column(name = "servicenow_portal", nullable = false)
    private boolean serviceNowPortal;

    @Column(name = "myallicia_portal", nullable = false)
    private boolean myAliciaPortal;

    @Column(name = "share_folder_access", nullable = false)
    private boolean shareFolderAccess;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @Column(name = "modified_date", nullable = false)
    private LocalDateTime modifiedDate;

    @Column(name = "modified_by", nullable = false)
    private String modifiedBy;

    @OneToOne
    @JoinColumn(name = "employeeIdemployee")
    private Employee employee;
}

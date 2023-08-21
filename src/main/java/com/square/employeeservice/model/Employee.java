package com.square.employeeservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="Employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employee-seq",
            sequenceName = "employee-seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee-seq"
    )
    private Integer idemployee;
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name", nullable = false)
    private String middleName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "epf_no")
    private String epfNo;

    @Column(name = "department")
    private String department;

    @Column(name = "branch")
    private String branch;

    @Column(name = "company")
    private String company;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "hod_name")
    private String hodName;

    @Column(name = "epf_no_of_hod")
    private String epfNoOfHod;

    @Column(name = "virtual_working_env")
    private String virtualWorkingEnv;

    @Column(name = "office365_license_type")
    private String office365LicenseType;

    @Column(name = "designation")
    private String designation;

    @Column(name = "grade")
    private String grade;

    @Column(name = "date_of_joining")
    private String dateOfJoining;

    @Column(name = "system_access_request")
    private String systemAccessRequest;

    @Column(name = "other_specific_notes", columnDefinition = "text")
    private String otherSpecificNotes;

    @Column(name = "last_working_date")
    private String lastWorkingDate;

    @Column(name = "requirement_data_backups")
    private String requirementDataBackups;

    @Column(name = "email_delegation_requirements")
    private String emailDelegationRequirements;

    @Column(name = "other_requirements")
    private String otherRequirements;

    @Column(name = "windows_user_account")
    private String windowsUserAccount;

    @OneToOne(mappedBy = "employee")
    private ApplicationAndSystemRequirement applicationAndSystemRequirement;

    @OneToOne(mappedBy = "employee")
    private TypeOfDevice typeOfDevice;

    @OneToOne(mappedBy = "employee")
    private Office365 office365;

    @OneToOne(mappedBy = "employee")
    private VirtualWorkingEnv virtualWorkingEnvironment;

    @OneToOne(mappedBy = "employee")
    private SupportToolsAndApplication supportToolsAndApplication;



}

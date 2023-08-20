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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idemployee;
    private String firstName;
    private String middleName;
    private String lastName;
    private String epfNo;
    private String department;
    private String branch;
    private String company;
    private String mobileNo;
    private String hodName;
    private String epfNoOfHod;
    private String virtualWorkingEnv;
    private String office365LicenseType;
    private String designation;
    private String grade;
    private String dateOfJoining;
    private String systemAccessRequest;
    private String otherSpecificNotes;
    private LocalDateTime lastWorkingDate;
    private String requirementDataBackups;
    private String emailDelegationRequirements;
    private String otherRequirements;
    private String windowsUserAccount;
    private Integer hodUserIdUser;

}

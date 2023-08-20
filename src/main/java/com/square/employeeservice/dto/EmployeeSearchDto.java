package com.square.employeeservice.dto;

import lombok.Data;

@Data
public class EmployeeSearchDto {
    private String firstName;
    private String middleName;
    private String lastName;
    private String epfNo;
    // ... add other search parameters
}

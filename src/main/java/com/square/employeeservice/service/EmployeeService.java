package com.square.employeeservice.service;

import com.square.employeeservice.dto.*;
import com.square.employeeservice.model.Employee;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface EmployeeService {
    void saveTypeOfDevice(TypeOfDeviceDto typeOfDeviceDto);

    void saveVirtualWorkingEnvironment(VirtualWorkingEnvDto virtualWorkingEnvDto);

    void saveSupportToolsAndApplication(SupportToolsAndApplicationDto toolsAndApplicationDto);

    void saveApplicationAndSystemRequirement(ApplicationAndSystemRequirementDto requirementDto);

    void saveOffice365(Office365Dto office365Dto);

    void saveEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Integer employeeId) throws ChangeSetPersister.NotFoundException;

    Employee updateEmployeeDetails(Integer employeeId, EmployeeDto employeeDto);

}

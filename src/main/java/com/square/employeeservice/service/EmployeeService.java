package com.square.employeeservice.service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.square.employeeservice.dto.*;
import com.square.employeeservice.model.*;
import com.square.employeeservice.repository.*;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    TypeOfDeviceRepository typeOfDeviceRepository;
    @Autowired
    ApplicationAndSystemRequirementService applicationAndSystemRequirementService;
    @Autowired
    ApplicationAndSystemRequirementRepository applicationAndSystemRequirementRepository;
    @Autowired
    VirtualWorkingEnvRepository virtualWorkingEnvRepository;
    @Autowired
    TypeOfDeviceService typeOfDeviceService;
    @Autowired
    VirtualWorkingEnvService virtualWorkingEnvService;

    @Autowired
    Office365Service office365Service;
    @Autowired
    Office365Repository office365Repository;
    @Autowired
    SupportToolsAndApplicationRepository supportToolsAndApplicationRepository;
    @Autowired
    SupportToolsAndApplicationService supportToolsAndApplicationService;
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EntityManager entityManager;

    public void saveTypeOfDevice(TypeOfDeviceDto typeOfDeviceDto) {
        TypeOfDevice typeOfDevice = typeOfDeviceService.convertDtoToEntity(typeOfDeviceDto);
        typeOfDeviceRepository.save(typeOfDevice);
    }
    public void saveVirtualWorkingEnvironment(VirtualWorkingEnvDto virtualWorkingEnvDto) {
        VirtualWorkingEnv virtualWorkingEnv = virtualWorkingEnvService.convertDtoToEntity(virtualWorkingEnvDto);
        virtualWorkingEnvRepository.save(virtualWorkingEnv);
    }

    public void saveApplicationAndSystemRequirement(ApplicationAndSystemRequirementDto dto) {
        ApplicationAndSystemRequirement applicationAndSystemRequirement = applicationAndSystemRequirementService.convertDtoToEntity(dto);
        applicationAndSystemRequirementRepository.save(applicationAndSystemRequirement);
    }


    public void saveOffice365(Office365Dto office365Dto) {
        Office365 office365 = office365Service.convertDtoToEntity(office365Dto);
        office365Repository.save(office365);
    }
    public void saveSupportToolsAndApplication(SupportToolsAndApplicationDto toolsAndApplicationDto) {
        SupportToolsAndApplication toolsAndApplication = supportToolsAndApplicationService.convertDtoToEntity(toolsAndApplicationDto);
        supportToolsAndApplicationRepository.save(toolsAndApplication);
    }

    public void saveEmployee(EmployeeDto employeeDto) {
        Employee employee = convertDtoToEntity(employeeDto);
        employeeRepository.save(employee);
    }


    public EmployeeDto getEmployeeById(Integer employeeId) throws ChangeSetPersister.NotFoundException {
        Employee employee =employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ChangeSetPersister.NotFoundException());

        return convertEntityToDto(employee);
    }

    public Employee updateEmployeeDetails(Integer employeeId, EmployeeDto employeeDto) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        if (optionalEmployee.isEmpty()) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + employeeId);
        }

        Employee existingEmployee = optionalEmployee.get();

        existingEmployee.setFirstName(employeeDto.getFirstName());
        existingEmployee.setMiddleName(employeeDto.getMiddleName());
        existingEmployee.setLastName(employeeDto.getLastName());
        existingEmployee.setEpfNo(employeeDto.getEpfNo());
        existingEmployee.setDepartment(employeeDto.getDepartment());
        existingEmployee.setBranch(employeeDto.getBranch());
        existingEmployee.setCompany(employeeDto.getCompany());
        existingEmployee.setMobileNo(employeeDto.getMobileNo());
        existingEmployee.setHodName(employeeDto.getHodName());
        existingEmployee.setEpfNoOfHod(employeeDto.getEpfNoOfHod());
        existingEmployee.setVirtualWorkingEnv(employeeDto.getVirtualWorkingEnv());
        existingEmployee.setOffice365LicenseType(employeeDto.getOffice365LicenseType());
        existingEmployee.setDesignation(employeeDto.getDesignation());
        existingEmployee.setGrade(employeeDto.getGrade());
        existingEmployee.setDateOfJoining(employeeDto.getDateOfJoining());
        existingEmployee.setSystemAccessRequest(employeeDto.getSystemAccessRequest());
        existingEmployee.setOtherSpecificNotes(employeeDto.getOtherSpecificNotes());
        existingEmployee.setLastWorkingDate(employeeDto.getLastWorkingDate());
        existingEmployee.setRequirementDataBackups(employeeDto.getRequirementDataBackups());
        existingEmployee.setEmailDelegationRequirements(employeeDto.getEmailDelegationRequirements());
        existingEmployee.setOtherRequirements(employeeDto.getOtherRequirements());
        existingEmployee.setWindowsUserAccount(employeeDto.getWindowsUserAccount());
        existingEmployee.setHodUserIdUser(employeeDto.getHodUserIdUser());

        // Save the updated employee
        return employeeRepository.save(existingEmployee);
    }


    private Employee convertDtoToEntity(EmployeeDto dto) {
        Employee employee = new Employee();
        employee.setFirstName(dto.getFirstName());
        employee.setMiddleName(dto.getMiddleName());
        employee.setLastName(dto.getLastName());
        employee.setEpfNo(dto.getEpfNo());
        employee.setDepartment(dto.getDepartment());
        employee.setBranch(dto.getBranch());
        employee.setCompany(dto.getCompany());
        employee.setMobileNo(dto.getMobileNo());
        employee.setHodName(dto.getHodName());
        employee.setEpfNoOfHod(dto.getEpfNoOfHod());
        employee.setVirtualWorkingEnv(dto.getVirtualWorkingEnv());
        employee.setOffice365LicenseType(dto.getOffice365LicenseType());
        employee.setDesignation(dto.getDesignation());
        employee.setGrade(dto.getGrade());
        employee.setDateOfJoining(dto.getDateOfJoining());
        employee.setSystemAccessRequest(dto.getSystemAccessRequest());
        employee.setOtherSpecificNotes(dto.getOtherSpecificNotes());
        employee.setLastWorkingDate(dto.getLastWorkingDate());
        employee.setRequirementDataBackups(dto.getRequirementDataBackups());
        employee.setEmailDelegationRequirements(dto.getEmailDelegationRequirements());
        employee.setOtherRequirements(dto.getOtherRequirements());
        employee.setWindowsUserAccount(dto.getWindowsUserAccount());
        employee.setHodUserIdUser(dto.getHodUserIdUser());

        return employee;
    }

    private EmployeeDto convertEntityToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setMiddleName(employee.getMiddleName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setEpfNo(employee.getEpfNo());
        employeeDto.setDepartment(employee.getDepartment());
        employeeDto.setBranch(employee.getBranch());
        employeeDto.setCompany(employee.getCompany());
        employeeDto.setMobileNo(employee.getMobileNo());
        employeeDto.setHodName(employee.getHodName());
        employeeDto.setEpfNoOfHod(employee.getEpfNoOfHod());
        employeeDto.setVirtualWorkingEnv(employee.getVirtualWorkingEnv());
        employeeDto.setOffice365LicenseType(employee.getOffice365LicenseType());
        employeeDto.setDesignation(employee.getDesignation());
        employeeDto.setGrade(employee.getGrade());
        employeeDto.setDateOfJoining(employee.getDateOfJoining());
        employeeDto.setSystemAccessRequest(employee.getSystemAccessRequest());
        employeeDto.setOtherSpecificNotes(employee.getOtherSpecificNotes());
        employeeDto.setLastWorkingDate(employee.getLastWorkingDate());
        employeeDto.setRequirementDataBackups(employee.getRequirementDataBackups());
        employeeDto.setEmailDelegationRequirements(employee.getEmailDelegationRequirements());
        employeeDto.setOtherRequirements(employee.getOtherRequirements());
        employeeDto.setWindowsUserAccount(employee.getWindowsUserAccount());
        employeeDto.setHodUserIdUser(employee.getHodUserIdUser());

        return employeeDto;
    }

}

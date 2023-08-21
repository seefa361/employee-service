package com.square.employeeservice.service.impl;

import com.square.employeeservice.dto.ApplicationAndSystemRequirementDto;
import com.square.employeeservice.model.ApplicationAndSystemRequirement;
import com.square.employeeservice.model.Employee;
import com.square.employeeservice.repository.EmployeeRepository;
import com.square.employeeservice.service.ApplicationAndSystemRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationAndSystemRequirementServiceImpl implements ApplicationAndSystemRequirementService {

    @Autowired
    EmployeeRepository employeeRepository;
    public ApplicationAndSystemRequirement convertDtoToEntity(ApplicationAndSystemRequirementDto dto) {
        ApplicationAndSystemRequirement applicationAndSystemRequirement = new ApplicationAndSystemRequirement();
        applicationAndSystemRequirement.setAcs(dto.getAcs());
        applicationAndSystemRequirement.setAcsReplacementUserId(dto.getAcsReplacementUserId());
        applicationAndSystemRequirement.setIms(dto.getIms());
        applicationAndSystemRequirement.setImsUserRoleDetails(dto.getImsUserRoleDetails());
        applicationAndSystemRequirement.setAcsReports(dto.getAcsReports());
        applicationAndSystemRequirement.setEmotor(dto.getEmotor());
        applicationAndSystemRequirement.setDmsMotor(dto.getDmsMotor());
        applicationAndSystemRequirement.setDmsNonMotor(dto.getDmsNonMotor());
        applicationAndSystemRequirement.setFinsFinder(dto.getFinsFinder());
        applicationAndSystemRequirement.setPhotoCloud(dto.getPhotoCloud());
        applicationAndSystemRequirement.setDmsOld(dto.getDmsOld());
        applicationAndSystemRequirement.setAnyOther(dto.getAnyOther());
        applicationAndSystemRequirement.setCreatedDate(dto.getCreatedDate());
        applicationAndSystemRequirement.setCreatedBy(dto.getCreatedBy());
        applicationAndSystemRequirement.setModifiedDate(dto.getModifiedDate());
        applicationAndSystemRequirement.setModifiedBy(dto.getModifiedBy());
        Employee employee = employeeRepository.findById(dto.getEmployeeIdemployee()).get();
        applicationAndSystemRequirement.setEmployee(employee);

        return applicationAndSystemRequirement;
    }
}

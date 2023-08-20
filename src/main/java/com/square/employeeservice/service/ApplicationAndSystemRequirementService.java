package com.square.employeeservice.service;

import com.square.employeeservice.dto.ApplicationAndSystemRequirementDto;
import com.square.employeeservice.model.ApplicationAndSystemRequirement;
import org.springframework.stereotype.Service;

@Service
public class ApplicationAndSystemRequirementService {
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
        applicationAndSystemRequirement.setDm(dto.getDm());
        applicationAndSystemRequirement.setFinsFinder(dto.getFinsFinder());
        applicationAndSystemRequirement.setAcsi(dto.getAcsi());
        applicationAndSystemRequirement.setPhotoCloud(dto.getPhotoCloud());
        applicationAndSystemRequirement.setDmsOld(dto.getDmsOld());
        applicationAndSystemRequirement.setAnyOther(dto.getAnyOther());
        applicationAndSystemRequirement.setCreatedDate(dto.getCreatedDate());
        applicationAndSystemRequirement.setCreatedBy(dto.getCreatedBy());
        applicationAndSystemRequirement.setModifiedDate(dto.getModifiedDate());
        applicationAndSystemRequirement.setModifiedBy(dto.getModifiedBy());
        applicationAndSystemRequirement.setEmployeeIdemployee(dto.getEmployeeIdemployee());

        return applicationAndSystemRequirement;
    }
}

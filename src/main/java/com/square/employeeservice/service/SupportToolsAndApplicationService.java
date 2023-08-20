package com.square.employeeservice.service;

import com.square.employeeservice.dto.SupportToolsAndApplicationDto;
import com.square.employeeservice.model.Employee;
import com.square.employeeservice.model.SupportToolsAndApplication;
import com.square.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupportToolsAndApplicationService {
    @Autowired
    EmployeeRepository employeeRepository;
    public SupportToolsAndApplication convertDtoToEntity(SupportToolsAndApplicationDto dto) {
        SupportToolsAndApplication toolsAndApplication = new SupportToolsAndApplication();
        toolsAndApplication.setAirWatch(dto.getAirWatch());
        toolsAndApplication.setMicrosoftTeam(dto.getMicrosoftTeam());
        toolsAndApplication.setTrainingAccess(dto.getTrainingAccess());
        toolsAndApplication.setIntranetAccess(dto.getIntranetAccess());
        toolsAndApplication.setServiceNowPortal(dto.getServiceNowPortal());
        toolsAndApplication.setMyAliciaPortal(dto.getMyAliciaPortal());
        toolsAndApplication.setShareFolderAccess(dto.getShareFolderAccess());
        toolsAndApplication.setCreatedDate(dto.getCreatedDate());
        toolsAndApplication.setCreatedBy(dto.getCreatedBy());
        toolsAndApplication.setModifiedDate(dto.getModifiedDate());
        toolsAndApplication.setModifiedBy(dto.getModifiedBy());
        Employee employee = employeeRepository.findById(dto.getEmployeeIdemployee()).get();
        toolsAndApplication.setEmployee(employee);

        return toolsAndApplication;
    }
}

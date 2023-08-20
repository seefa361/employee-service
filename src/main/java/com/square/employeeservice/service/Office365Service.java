package com.square.employeeservice.service;

import com.square.employeeservice.dto.Office365Dto;
import com.square.employeeservice.model.Office365;
import org.springframework.stereotype.Service;

@Service
public class Office365Service {
    public Office365 convertDtoToEntity(Office365Dto dto) {
        Office365 office365 = new Office365();
        office365.setE1(dto.getE1());
        office365.setE3(dto.getE3());
        office365.setF3(dto.getF3());
        office365.setPowerAutomate(dto.getPowerAutomate());
        office365.setCreatedDate(dto.getCreatedDate());
        office365.setCreatedBy(dto.getCreatedBy());
        office365.setModifiedDate(dto.getModifiedDate());
        office365.setModifiedBy(dto.getModifiedBy());
        office365.setEmployeeIdemployee(dto.getEmployeeIdemployee());
        return office365;
    }
}

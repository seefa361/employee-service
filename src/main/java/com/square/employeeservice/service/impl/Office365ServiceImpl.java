package com.square.employeeservice.service.impl;

import com.square.employeeservice.dto.Office365Dto;
import com.square.employeeservice.model.Employee;
import com.square.employeeservice.model.Office365;
import com.square.employeeservice.repository.EmployeeRepository;
import com.square.employeeservice.service.Office365Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Office365ServiceImpl implements Office365Service {

    @Autowired
    EmployeeRepository employeeRepository;
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
        Employee employee = employeeRepository.findById(dto.getEmployeeIdemployee()).get();
        office365.setEmployee(employee);
        return office365;
    }
}

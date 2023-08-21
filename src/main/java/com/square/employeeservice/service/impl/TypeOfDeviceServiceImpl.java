package com.square.employeeservice.service.impl;

import com.square.employeeservice.dto.TypeOfDeviceDto;
import com.square.employeeservice.model.Employee;
import com.square.employeeservice.model.TypeOfDevice;
import com.square.employeeservice.repository.EmployeeRepository;
import com.square.employeeservice.repository.TypeOfDeviceRepository;
import com.square.employeeservice.service.TypeOfDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfDeviceServiceImpl implements TypeOfDeviceService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    TypeOfDeviceRepository typeOfDeviceRepository;


    public List<TypeOfDevice> getTypeOfDevices(){
        return typeOfDeviceRepository.findAll();
    }

    public TypeOfDevice convertDtoToEntity(TypeOfDeviceDto typeOfDeviceDto) {
        TypeOfDevice typeOfDevice = new TypeOfDevice();

        typeOfDevice.setIdtypeOfDevice(typeOfDeviceDto.getIdtypeOfDevice());
        typeOfDevice.setPersonalComputer(typeOfDeviceDto.getPersonalComputer());
        typeOfDevice.setLaptopAndDataFacility(typeOfDeviceDto.getLaptopAndDataFacility());
        typeOfDevice.setThinClient(typeOfDeviceDto.getThinClient());
        typeOfDevice.setPhoneExtension(typeOfDeviceDto.getPhoneExtension());
        typeOfDevice.setDeskPhone(typeOfDeviceDto.getDeskPhone());
        typeOfDevice.setMobilePhone(typeOfDeviceDto.getMobilePhone());
        typeOfDevice.setCreatedDate(typeOfDeviceDto.getCreatedDate());
        typeOfDevice.setCreatedBy(typeOfDeviceDto.getCreatedBy());
        typeOfDevice.setModifiedDate(typeOfDeviceDto.getModifiedDate());
        typeOfDevice.setModifiedBy(typeOfDeviceDto.getModifiedBy());
        Employee employee = employeeRepository.findById(typeOfDeviceDto.getEmployeeIdemployee()).get();
        typeOfDevice.setEmployee(employee);

        return typeOfDevice;
    }
}

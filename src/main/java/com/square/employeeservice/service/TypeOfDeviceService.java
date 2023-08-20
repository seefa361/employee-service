package com.square.employeeservice.service;

import com.square.employeeservice.dto.TypeOfDeviceDto;
import com.square.employeeservice.model.TypeOfDevice;
import com.square.employeeservice.repository.TypeOfDeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfDeviceService {

    private final TypeOfDeviceRepository typeOfDeviceRepository;


    public TypeOfDeviceService(TypeOfDeviceRepository typeOfDeviceRepository) {
        this.typeOfDeviceRepository = typeOfDeviceRepository;
    }

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
        typeOfDevice.setEmployeeIdemployee(typeOfDeviceDto.getEmployeeIdemployee());

        return typeOfDevice;
    }
}

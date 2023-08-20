package com.square.employeeservice.service;
import com.square.employeeservice.dto.VirtualWorkingEnvDto;
import com.square.employeeservice.model.VirtualWorkingEnv;
import com.square.employeeservice.repository.VirtualWorkingEnvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VirtualWorkingEnvService {
    @Autowired
    VirtualWorkingEnvRepository virtualWorkingEnvRepository;

    public List<VirtualWorkingEnv> getVirtualWorkingEnv(){
        return virtualWorkingEnvRepository.findAll();
    }
    public VirtualWorkingEnv convertDtoToEntity(VirtualWorkingEnvDto virtualWorkingEnvDto) {
        VirtualWorkingEnv virtualWorkingEnv = new VirtualWorkingEnv();
        // Map fields from DTO to Entity
        virtualWorkingEnv.setEmployeeIdemployee(virtualWorkingEnvDto.getEmployeeIdemployee());
        virtualWorkingEnv.setAvc(virtualWorkingEnvDto.getAvc());
        virtualWorkingEnv.setLocalCitrixLaptop(virtualWorkingEnvDto.getLocalCitrixLaptop());
        virtualWorkingEnv.setLocalCitrixPc(virtualWorkingEnvDto.getLocalCitrixPc());
        virtualWorkingEnv.setVpnCallCenter(virtualWorkingEnvDto.getVpnCallCenter());
        virtualWorkingEnv.setCreatedDate(virtualWorkingEnvDto.getCreatedDate());
        virtualWorkingEnv.setCreatedBy(virtualWorkingEnvDto.getCreatedBy());
        virtualWorkingEnv.setModifiedDate(virtualWorkingEnvDto.getModifiedDate());
        virtualWorkingEnv.setModifiedBy(virtualWorkingEnvDto.getModifiedBy());
        return virtualWorkingEnv;
    }
}

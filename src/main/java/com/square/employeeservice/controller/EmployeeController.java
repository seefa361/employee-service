package com.square.employeeservice.controller;

import com.square.employeeservice.dto.*;
import com.square.employeeservice.model.Employee;
import com.square.employeeservice.model.TypeOfDevice;
import com.square.employeeservice.model.VirtualWorkingEnv;
import com.square.employeeservice.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    TypeOfDeviceService typeOfDeviceService;
    @Autowired
    VirtualWorkingEnvService virtualWorkingEnvService;
    @Autowired
    EmployeeService employeeService;


    @PostMapping("/saveTypeOfDevice")
    public ResponseEntity<String> createTypeOfDevice(@RequestBody TypeOfDeviceDto typeOfDeviceDto) {
        employeeService.saveTypeOfDevice(typeOfDeviceDto);
        return ResponseEntity.ok("TypeOfDevice created successfully.");
    }

    @PostMapping("/saveVirtualWorkingEnvironment")
    public ResponseEntity<String> saveVirtualWorkingEnvironment(@RequestBody VirtualWorkingEnvDto virtualWorkingEnvDto) {
        employeeService.saveVirtualWorkingEnvironment(virtualWorkingEnvDto);
        return ResponseEntity.ok("VirtualWorkingEnv created successfully.");
    }

    @PostMapping("/saveOffice365")
    public ResponseEntity<String> saveOffice365(@RequestBody Office365Dto office365Dto) {
        employeeService.saveOffice365(office365Dto);
        return ResponseEntity.ok("Office365 created successfully.");
    }

    @PostMapping("/saveApplicationAndSystemRequirement")
    public ResponseEntity<String> saveApplicationAndSystemRequirement(
            @RequestBody ApplicationAndSystemRequirementDto requirementDto) {
        employeeService.saveApplicationAndSystemRequirement(requirementDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Application and System Requirement data saved successfully.");
    }

    @PostMapping("/saveSupportToolsAndApplication")
    public ResponseEntity<String> saveSupportToolsAndApplication(
            @RequestBody SupportToolsAndApplicationDto toolsAndApplicationDto) {
        employeeService.saveSupportToolsAndApplication(toolsAndApplicationDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Support Tools and Application data saved successfully.");
    }
    @PostMapping("/save")
    public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>("Employee saved successfully", HttpStatus.CREATED);
    }

    @GetMapping("/getTypeOfDevice")
    public List<TypeOfDevice> getTypeOfDevices() {
        return typeOfDeviceService.getTypeOfDevices();
    }


    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Integer employeeId) throws ChangeSetPersister.NotFoundException {
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }
    @PutMapping("/{employeeId}")
    public ResponseEntity<String> updateEmployeeDetails(@PathVariable Integer employeeId,
                                                        @RequestBody EmployeeDto employeeDto) {
        try {
            Employee updatedEmployee = employeeService.updateEmployeeDetails(employeeId, employeeDto);
            return new ResponseEntity<>("Employee details updated successfully", HttpStatus.OK);
        } catch (EmployeeNotFoundException e) {
            return new ResponseEntity<>("Employee not found with ID: " + employeeId, HttpStatus.NOT_FOUND);
        }
    }


}

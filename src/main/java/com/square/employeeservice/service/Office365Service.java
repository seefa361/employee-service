package com.square.employeeservice.service;

import com.square.employeeservice.dto.Office365Dto;
import com.square.employeeservice.model.Office365;

public interface Office365Service {
    Office365 convertDtoToEntity(Office365Dto office365Dto);
}

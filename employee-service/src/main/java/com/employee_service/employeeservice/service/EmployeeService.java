package com.employee_service.employeeservice.service;

import com.employee_service.employeeservice.dto.APIResponseDto;
import com.employee_service.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long empId);
}

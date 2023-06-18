package com.employee_service.employeeservice.service;


import com.employee_service.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8009", value = "DEPARTMENT-SERVICE")
public interface ApiClient {

    @GetMapping("api/departments/code/{code}")
    DepartmentDto getDepartmentByCode(@PathVariable("code") String code);

}

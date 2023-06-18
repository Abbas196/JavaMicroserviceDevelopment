package com.employee_service.employeeservice.service.impl;

import com.employee_service.employeeservice.dto.APIResponseDto;
import com.employee_service.employeeservice.dto.DepartmentDto;
import com.employee_service.employeeservice.dto.EmployeeDto;
import com.employee_service.employeeservice.entity.Employee;
import com.employee_service.employeeservice.repository.EmployeeRepository;
import com.employee_service.employeeservice.service.ApiClient;
import com.employee_service.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
//    private RestTemplate restTemplate;
//    private WebClient webClient;
    private ApiClient apiClient;
    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getDepartmentCode()
        );
        Employee savedEmployee = employeeRepository.save(employee);
        EmployeeDto savedEmployeeDto = new EmployeeDto(
                savedEmployee.getId(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName(),
                savedEmployee.getEmail(),
                savedEmployee.getDepartmentCode()
        );
        return savedEmployeeDto;
    }

    @Override
    public APIResponseDto getEmployeeById(Long empId) {
        Employee emp = employeeRepository.findById(empId).get();

//        ResponseEntity<DepartmentDto> responseEntity =  restTemplate.getForEntity("http://localhost:8009/api/departments/" + emp.getDepartmentCode(), DepartmentDto.class);

//        DepartmentDto departmentDto = responseEntity.getBody();
//        DepartmentDto departmentDto = webClient.get().uri("http://localhost:8009/api/departments/code/" + emp.getDepartmentCode())
//                .retrieve()
//                .bodyToMono(DepartmentDto.class)
//                .block();
        DepartmentDto departmentDto =  apiClient.getDepartmentByCode(emp.getDepartmentCode());
        EmployeeDto empDto = new EmployeeDto(
                emp.getId(),
                emp.getFirstName(),
                emp.getLastName(),
                emp.getEmail(),
                emp.getDepartmentCode()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEmployeeDto(empDto);
        apiResponseDto.setDepartmentDto(departmentDto);
        return apiResponseDto;
    }
}

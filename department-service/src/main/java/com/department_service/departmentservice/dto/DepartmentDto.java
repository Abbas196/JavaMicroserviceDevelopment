package com.department_service.departmentservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartmentDto {
    private Long id;
    private String departmentName;
    private String departDescription;
    private String departmentCode;
}

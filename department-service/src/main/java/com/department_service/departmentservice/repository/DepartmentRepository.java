package com.department_service.departmentservice.repository;

import com.department_service.departmentservice.dto.DepartmentDto;
import com.department_service.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentCode(String code);
}

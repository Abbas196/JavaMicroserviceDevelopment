package com.department_service.departmentservice.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Schema(
        description = "DepartmentDto Model Information"
)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartmentDto {
    private Long id;

    @Schema(
            description = "Department Name"
    )
    private String departmentName;

    @Schema(
            description = "Department Description"
    )
    private String departDescription;

    @Schema(
            description = "Department Code"
    )
    private String departmentCode;
}

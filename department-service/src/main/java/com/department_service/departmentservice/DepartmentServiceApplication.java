package com.department_service.departmentservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@OpenAPIDefinition(
		info = @Info(
				title = "Department Service Rest API's",
				description = "Department Service REST API's documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Abbas"
				),
				license = @License(
						name = "Apache 2.0"
				)
		)
)
@SpringBootApplication
public class DepartmentServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}

package br.com.control.finances;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class ControlFinancesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlFinancesApplication.class, args);
	}
}

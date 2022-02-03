package br.com.control.finances.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"br.com.control.finances.domain.entities"})
@EnableJpaRepositories(basePackages = {"br.com.control.finances.infrastructure.repository"})
@ComponentScan(basePackages = {"br.com.control.finances.application.controller, " +
		"br.com.control.finances.service, br.com.control.finances.infrastructure.exceptions"})
@SpringBootApplication
public class ControlFinancesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlFinancesApplication.class, args);
	}
}

package br.com.control.finances;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class ControlFinancesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlFinancesApplication.class, args);
	}
}

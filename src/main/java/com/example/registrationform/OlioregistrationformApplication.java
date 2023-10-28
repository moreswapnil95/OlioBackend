package com.example.registrationform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"repository"})
@EntityScan(basePackages = {"entity"})
@ComponentScan(basePackages = {"controller","service"})
public class OlioregistrationformApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlioregistrationformApplication.class, args);
	}

}

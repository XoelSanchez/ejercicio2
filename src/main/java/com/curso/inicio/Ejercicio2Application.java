package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.curso.controller","com.curso.service"})
public class Ejercicio2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio2Application.class, args);
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
}

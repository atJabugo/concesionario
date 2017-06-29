package com.atsistemas.concesionario.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.atsistemas.concesionario.configuracion", "com.atsistemas.concesionario.controladores"})
public class ConPresentacionSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConPresentacionSpringBootApplication.class, args);
	}
}

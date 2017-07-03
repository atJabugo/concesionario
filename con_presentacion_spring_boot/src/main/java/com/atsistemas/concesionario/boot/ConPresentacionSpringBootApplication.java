package com.atsistemas.concesionario.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.atsistemas.concesionario.configuracion", "com.atsistemas.concesionario.controladores"})
public class ConPresentacionSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConPresentacionSpringBootApplication.class, args);
    }
    
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

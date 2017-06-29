package com.atsistemas.concesionario.boot;

import com.atsistemas.concesionario.servicio.security.ServicioSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//Anotación que significa lo mismo que @Controller @EnableAutoConfiguration y @ComponentScan
@SpringBootApplication(scanBasePackages = {"com.atsistemas.concesionario.controladores","com.atsistemas.concesionario.servicio", "com.atsistemas.concesionario.configuracion"})
public class ConRestBootApplication extends WebSecurityConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(ConRestBootApplication.class, args);
    }

    @Autowired
    private ServicioSecurity servicioSecurity;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http //autorizamos por http básico a cada rol a hacer modificaciones y a todos a consultar
                .authorizeRequests()
                .mvcMatchers(HttpMethod.GET, "/pedido/entrega/*").hasAnyRole("ADMINISTRATIVO", "COMERCIAL")
                .mvcMatchers(HttpMethod.POST, "/vehiculo/*", "/pedido/*").hasRole("ADMINISTRATIVO")
                .mvcMatchers(HttpMethod.PUT, "/vehiculo/*", "/pedido/*").hasRole("ADMINISTRATIVO")
                .mvcMatchers(HttpMethod.GET, "/vehiculo/*", "/pedido/*").authenticated()
                .mvcMatchers(HttpMethod.POST, "/factura/generarFactura").hasAnyRole("ADMINISTRATIVO", "COMERCIAL")
                .mvcMatchers(HttpMethod.POST, "/cliente/*", "/factura/*").hasRole("COMERCIAL")
                .mvcMatchers(HttpMethod.PUT, "/cliente/*", "/factura/*").hasRole("COMERCIAL")
                .mvcMatchers(HttpMethod.GET, "/cliente/*", "/factura/*").authenticated()
                .mvcMatchers(HttpMethod.POST, "/comercial/*").hasRole("GERENTE")
                .mvcMatchers(HttpMethod.PUT, "/comercial/*").hasRole("GERENTE")
                .mvcMatchers(HttpMethod.GET, "/comercial/*").authenticated()
                .anyRequest().permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        //Utilizamos el servicio para obtener los usuarios de la base de datos
        auth.userDetailsService(servicioSecurity);

    }
}

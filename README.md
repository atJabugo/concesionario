# Concesionario
Ejercicio concesionario Víctor Chico

Necesario desplegar con_rest en el puerto 8080/con_rest

Necesario Derby en el puerto 1527 con el esquema Concesionario

Necesario generar certificado 

    - keytool -exportcert -keystore keystore.p12 -storepass spring -storetype PKCS12 -alias tomcat -file tomcat.cer
    
Necesario importar certificado
    
    - keytool -importcert -keystore $Env:JAVA_HOME\jre\lib\security\cacerts -storepass changeit -alias tomcat -file .\tomcat.cer




con_entidades

    - JPA
    - Hibernate
    - Jackson
    
con_interfaces


con_persistencia

    - Spring Data JPA
    - Apache Derby
    - DBCP2
    
    
con_servicio

    - Spring context
    
    
con_rest

    - Spring Web MVC
    - Jackson
    - Spring Security
    
    
con_presentacion_spring

    - Spring Web MVC
    - Thymeleaf
    - Jackson
    - Spring Security

con_tools

    - Spring Web
    
con_rest_boot

    - Spring Boot
    - Spring Boot Starter Data JPA
    - Spring Boot Starter Security
    - Spring Boot Starter Web
    
con_presentacion_spring_boot

    - Spring Boot
    - Spring Boot Starter Thymeleaf
    - Spring Boot Starter Web
    - Spring Boot Starter Tomcat

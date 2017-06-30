package com.atsistemas.concesionario.boot;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.atsistemas.concesionario.configuracion", "com.atsistemas.concesionario.controladores"})
public class ConPresentacionSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConPresentacionSpringBootApplication.class, args);
    }
    
    @Bean
    public HostnameVerifier hostnameVerifier(){
        return (String hostname, SSLSession ssls) -> hostname.equals("localhost") ;
    }
    
    @Bean
    public CloseableHttpClient httpClient(HostnameVerifier hostnameVerifier){
        return HttpClients.custom().setSSLHostnameVerifier(hostnameVerifier).build();
    }
    
    @Bean
    public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory(CloseableHttpClient httpClient){
        return new HttpComponentsClientHttpRequestFactory(httpClient);
    }
    
    @Bean
    public RestTemplate restTemplate(HttpComponentsClientHttpRequestFactory clientHttpRequestFactory){
        return new RestTemplate(clientHttpRequestFactory);
    }

}

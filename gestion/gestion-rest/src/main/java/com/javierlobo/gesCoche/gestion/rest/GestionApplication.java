package com.javierlobo.gesCoche.gestion.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(GestionApplication.class, args);
    }
    
}

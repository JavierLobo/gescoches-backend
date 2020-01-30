package com.javierlobo.gescoche.gestion.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.javierlobo.gescoche"})
@EntityScan("com.javierlobo.gescoche")
@EnableMongoRepositories("com.javierlobo.gescoche")
public class GestionApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(GestionApplication.class, args);
    }
    
}

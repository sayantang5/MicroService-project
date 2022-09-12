package com.example.Microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmenterviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmenterviceApplication.class, args);
		
		
		System.out.println("done");
		System.out.println("logging");
		
	}
	
	
	
	// this change is only for feature branch 
	
	
	

}

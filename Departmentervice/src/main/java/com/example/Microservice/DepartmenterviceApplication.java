package com.example.Microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmenterviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmenterviceApplication.class, args);
	}

}

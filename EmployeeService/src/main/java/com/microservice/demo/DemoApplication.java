package com.microservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
    @Bean
    @LoadBalanced
	public  RestTemplate getRestTemplate(){
		
		
		
        System.out.println("Domo1");
		
		System.out.println("Domo2");
		
		return  new RestTemplate() ;
	}

}

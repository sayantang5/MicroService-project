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

        System.out.println("This is demo3");
		
		System.out.println("This is demo4");
		
		System.out.println("This is feature 3");
		
<<<<<<< HEAD
		System.out.println("This is feature 4 changes");
=======
>>>>>>> 9568bdc222415d23fa01ef89d7f9c84fe9b2c780
		
		
		

		return  new RestTemplate() ;
	}

}

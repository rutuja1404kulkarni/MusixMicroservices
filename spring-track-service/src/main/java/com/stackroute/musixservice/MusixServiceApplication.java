package com.stackroute.musixservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MusixServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusixServiceApplication.class, args);
	}

}

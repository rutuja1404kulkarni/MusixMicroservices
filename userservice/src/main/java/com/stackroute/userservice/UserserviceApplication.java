package com.stackroute.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableEurekaClient
@SpringBootApplication
public class UserserviceApplication {


	public static void main(String[] args)
	{

		SpringApplication.run(UserserviceApplication.class, args);
		System.out.println("*******************");
	}

}

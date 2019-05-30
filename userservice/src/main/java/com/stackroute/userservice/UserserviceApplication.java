package com.stackroute.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
=======
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
>>>>>>> 9c7079737d21f517dde977e3938ea921b4b20261


@EnableEurekaClient
@SpringBootApplication
public class UserserviceApplication {


	public static void main(String[] args)
	{

		SpringApplication.run(UserserviceApplication.class, args);
		System.out.println("*******************");
	}

}

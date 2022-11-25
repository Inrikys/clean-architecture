package com.henrique.cleanarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CleanarchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanarchApplication.class, args);
	}

}

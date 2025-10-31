package com.gymapp.gymapp_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GymappEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(GymappEurekaApplication.class, args);
	}
}

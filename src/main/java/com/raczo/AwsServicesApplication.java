package com.raczo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AwsServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsServicesApplication.class, args);
	}
}

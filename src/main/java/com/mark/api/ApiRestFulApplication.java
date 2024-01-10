package com.mark.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.mark.api.config.property.MarkApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(MarkApiProperty.class)
public class ApiRestFulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestFulApplication.class, args);
	}
}

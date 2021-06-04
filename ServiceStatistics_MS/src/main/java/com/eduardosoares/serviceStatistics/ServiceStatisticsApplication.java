package com.eduardosoares.serviceStatistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.eduardosoares" })
@EntityScan(basePackages = { "com.eduardosoares" })
public class ServiceStatisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceStatisticsApplication.class, args);
	}
}

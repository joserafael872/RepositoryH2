package com.repository.repositoryh2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "com.repository")
public class RepositoryH2Application {

	public static void main(String[] args) {
		SpringApplication.run(RepositoryH2Application.class, args);
	}

}

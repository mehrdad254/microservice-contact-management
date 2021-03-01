package com.mhr.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceContactManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceContactManagementApplication.class, args);
	}

}

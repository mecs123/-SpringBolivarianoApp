package com.microservice_admin.microservice_admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableAdminServer
public class MicroserviceAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAdminApplication.class, args);
	}

}

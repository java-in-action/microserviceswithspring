package com.microservices.portsmoduleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservices.portsmoduleservice")
public class PortsModuleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortsModuleServiceApplication.class, args);
	}

}

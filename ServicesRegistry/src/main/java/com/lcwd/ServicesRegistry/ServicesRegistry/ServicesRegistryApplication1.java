package com.lcwd.ServicesRegistry.ServicesRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicesRegistryApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(ServicesRegistryApplication1.class, args);
	}

}

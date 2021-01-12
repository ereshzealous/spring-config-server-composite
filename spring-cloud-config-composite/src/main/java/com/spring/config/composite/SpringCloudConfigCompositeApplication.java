package com.spring.config.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigCompositeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigCompositeApplication.class, args);
	}

}

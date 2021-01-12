package com.spring.redis.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class SpringRedisClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRedisClientApplication.class, args);
	}

}

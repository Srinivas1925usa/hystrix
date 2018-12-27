package com.motubo.restconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class RestconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestconsumerApplication.class, args);
	}

}


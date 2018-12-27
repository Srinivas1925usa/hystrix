package com.motubo.restconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
public class RestConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestConsumerFeignApplication.class, args);
	}

}


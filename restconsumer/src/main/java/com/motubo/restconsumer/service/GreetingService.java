package com.motubo.restconsumer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class GreetingService {

	@HystrixCommand(fallbackMethod="defaultGreeting")
	public String greeting(String userName) {
		
		return new RestTemplate().getForObject("http://localhost:9090/greeting/{userName}", String.class, userName);
	}
	
	public String defaultGreeting(String username) {
		
		return "Hello User!";
	}
	
}

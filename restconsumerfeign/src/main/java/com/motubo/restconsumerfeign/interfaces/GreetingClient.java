package com.motubo.restconsumerfeign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.motubo.restproducer.interfaces.GreetingController;

@FeignClient(name="rest-producer",
url = "http://localhost:9090",
fallback = GreetingClient.GreetingClientFallback.class)
public interface GreetingClient extends GreetingController{
	
	@Component
	public static class GreetingClientFallback implements GreetingClient {
		
		public String greeting(@PathVariable String userName) {
			
			return "Hello User";
		}
	}

}

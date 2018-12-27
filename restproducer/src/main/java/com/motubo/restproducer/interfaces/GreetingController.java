package com.motubo.restproducer.interfaces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingController {
	
	@RequestMapping("/greeting/{userName}")
	String greeting(@PathVariable String userName);

}

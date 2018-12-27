package com.motubo.restproducer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.motubo.restproducer.interfaces.GreetingController;

@RestController
public class GreetingControllerImpl implements GreetingController {

	@Override
	public String greeting(@PathVariable String userName) {
	
		return String.format("Hello %s!/n", userName);
	}

}

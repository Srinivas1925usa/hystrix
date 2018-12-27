package com.motubo.restconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.motubo.restconsumer.service.GreetingService;

@Controller
public class GreetingController {
	
	@Autowired
	private GreetingService greetingService;
	
	@GetMapping("/get-greeting/{userName}")
	public String  getGreeting(Model model,@PathVariable String userName) {
		model.addAttribute("greeting",greetingService.greeting(userName));		
		return "greeting-view";		
	}
}

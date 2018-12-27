package com.motubo.restconsumerfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.motubo.restconsumerfeign.interfaces.GreetingClient;

@Controller
public class GreetingController {
	
	@Autowired
	private GreetingClient greetingClient;
	
	@GetMapping("/get-greeting/{userName}")
	public String getGreeting(Model model, @PathVariable String userName) {
		
		model.addAttribute("greeting",greetingClient.greeting(userName));
		return "greeting-view";		
	}
}

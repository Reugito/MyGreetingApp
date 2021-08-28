package com.blz.greetingApp.controller;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blz.greetingApp.model.Greeting;
import com.blz.greetingApp.model.User;
import com.blz.greetingApp.service.IgreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController 
{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private IgreetingService greetingService;
	
	@GetMapping(value = {"", "/", "/home"})
	public Greeting greeting (@RequestParam(value ="name", defaultValue = "world") String name)
	{
		User user = new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
	}
}

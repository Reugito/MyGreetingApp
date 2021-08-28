package com.blz.greetingApp.service;

import com.blz.greetingApp.model.Greeting;
import com.blz.greetingApp.model.User;

public interface IgreetingService 
{
	Greeting addGreeting(User user);
	Greeting getById(long id);
}

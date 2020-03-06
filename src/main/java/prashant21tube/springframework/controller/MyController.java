package prashant21tube.springframework.controller;

import org.springframework.stereotype.Controller;

import prashant21tube.springframework.service.GreetingService;

@Controller
public class MyController{
	
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayHello();
	}
}
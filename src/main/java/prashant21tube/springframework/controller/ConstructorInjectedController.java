/**
 * 
 */
package prashant21tube.springframework.controller;

import prashant21tube.springframework.service.GreetingService;

/**
 * @author lenovo
 *
 */
public class ConstructorInjectedController {
	
	private GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayHello();
	}

}

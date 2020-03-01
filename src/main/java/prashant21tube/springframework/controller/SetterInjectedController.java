/**
 * 
 */
package prashant21tube.springframework.controller;

import prashant21tube.springframework.service.GreetingService;

/**
 * @author lenovo
 *
 */
public class SetterInjectedController {

	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}

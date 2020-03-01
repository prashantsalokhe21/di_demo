/**
 * 
 */
package prashant21tube.springframework.controller;

import prashant21tube.springframework.service.GreetingServiceImpl;

/**
 * @author lenovo
 *
 */
public class PropertyInjectedController {
	
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayHello();
	}

}

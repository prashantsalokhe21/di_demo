/**
 * 
 */
package prashant21tube.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import prashant21tube.springframework.service.GreetingService;

/**
 * @author lenovo
 *
 */
@Controller
public class SetterInjectedController {

	
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}
	
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}

/**
 * 
 */
package prashant21tube.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import prashant21tube.springframework.service.GreetingService;

/**
 * @author lenovo
 *
 */
@Controller
public class PropertyInjectedController {
	
	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingService greetingServiceImpl;
	
	public String sayHello() {
		return greetingServiceImpl.sayHello();
	}

}

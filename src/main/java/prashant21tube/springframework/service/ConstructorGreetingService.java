/**
 * 
 */
package prashant21tube.springframework.service;

import org.springframework.stereotype.Service;

/**
 * @author lenovo
 *
 */
@Service
public class ConstructorGreetingService implements GreetingService {

	/* (non-Javadoc)
	 * @see prashant21tube.springframework.service.GreetingService#sayHello()
	 */
	@Override
	public String sayHello() {
		return "Hello!!!  I have injected via Constructor";
	}

}

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
public class GreetingServiceImpl implements GreetingService {
	
	public static final String HELLO_GURUS = "Hello Gurus!!!";

	/* (non-Javadoc)
	 * @see prashant21tube.springframework.service.GreetingService#sayHello()
	 */
	@Override
	public String sayHello() {
		return HELLO_GURUS;
	}

}

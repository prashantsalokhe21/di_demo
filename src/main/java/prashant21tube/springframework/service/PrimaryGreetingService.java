/**
 * 
 */
package prashant21tube.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 *
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService{

	@Override
	public String sayHello() {
		return "Hello - from Primary Greeting!!";
	}

}

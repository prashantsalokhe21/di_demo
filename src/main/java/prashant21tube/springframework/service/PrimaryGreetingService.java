/**
 * 
 */
package prashant21tube.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 *
 */
@Service
@Primary
//Default is added if no active profile is set then this profile will get seleted
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService{

	@Override
	public String sayHello() {
		return "Hello - from Primary Greeting!!";
	}

}

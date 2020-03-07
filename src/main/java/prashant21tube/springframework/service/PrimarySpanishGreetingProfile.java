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
@Profile("es")
@Primary
public class PrimarySpanishGreetingProfile implements GreetingService {

	/* (non-Javadoc)
	 * @see prashant21tube.springframework.service.GreetingService#sayHello()
	 */
	@Override
	public String sayHello() {
		return "Hola!!! Este es un servicio español.";
	}

}

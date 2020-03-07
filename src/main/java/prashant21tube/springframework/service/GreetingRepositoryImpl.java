/**
 * 
 */
package prashant21tube.springframework.service;

import org.springframework.stereotype.Component;

/**
 * @author lenovo
 *
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	/* (non-Javadoc)
	 * @see prashant21tube.springframework.service.GreetingRepository#getEnglishGreeting()
	 */
	@Override
	public String getEnglishGreeting() {
		return "Hello - from Primary Greeting Serice!!!";
	}

	/* (non-Javadoc)
	 * @see prashant21tube.springframework.service.GreetingRepository#getSpanishGreeting()
	 */
	@Override
	public String getSpanishGreeting() {
		return " ¡Hola, del servicio de saludo primario!";
	}

	/* (non-Javadoc)
	 * @see prashant21tube.springframework.service.GreetingRepository#getGermanGreeting()
	 */
	@Override
	public String getGermanGreeting() {
		return "Hallo - vom Primary Greeting Serice !!!";
	}

}

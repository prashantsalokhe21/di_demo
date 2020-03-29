/**
 * 
 */
package prashant21tube.springframework.service;

/**
 * @author lenovo
 *
 */
public class PrimarySpanishGreetingProfile implements GreetingService {

	private GreetingRepository greetingRespository;
	
	
	public PrimarySpanishGreetingProfile(GreetingRepository greetingRespository) {
		super();
		this.greetingRespository = greetingRespository;
	}


	/* (non-Javadoc)
	 * @see prashant21tube.springframework.service.GreetingService#sayHello()
	 */
	@Override
	public String sayHello() {
		//return "Hola!!! Este es un servicio español.";
		return greetingRespository.getSpanishGreeting();
	}

}

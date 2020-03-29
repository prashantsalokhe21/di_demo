/**
 * 
 */
package prashant21tube.springframework.service;

/**
 * @author lenovo
 *
 */
public class PrimaryGermanGreetingService implements GreetingService {
	
	private GreetingRepository greetingRepository;

	
	public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}


	/* (non-Javadoc)
	 * @see prashant21tube.springframework.service.GreetingService#sayHello()
	 */
	@Override
	public String sayHello() {
		//return "Hallo!!! Dies ist spanischer Service" ;
		return greetingRepository.getGermanGreeting();
	}

}

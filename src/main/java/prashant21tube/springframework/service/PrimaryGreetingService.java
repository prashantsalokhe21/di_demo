/**
 * 
 */
package prashant21tube.springframework.service;

/**
 * @author lenovo
 *
 */

public class PrimaryGreetingService implements GreetingService{
	
	private GreetingRepository greetingRepository;
	
	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayHello() {
		return greetingRepository.getEnglishGreeting();
	}

}

/**
 * 
 */
package prashant21tube.springframework.service;

/**
 * @author lenovo
 *
 */
public class GreetingServiceFactory {
	
	private GreetingRepository greetingRepository;
	
	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService getGreetingService(String lang) {
		switch (lang) {
		case "en":
			return new PrimaryGreetingService(greetingRepository);
		case "de":
			return new PrimaryGermanGreetingService(greetingRepository);
		case "es":
			return new PrimarySpanishGreetingProfile(greetingRepository);
		default:
			return new PrimaryGreetingService(greetingRepository);
		}
	}

}

package prashant21tube.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import prashant21tube.springframework.service.GreetingRepository;
import prashant21tube.springframework.service.GreetingServiceFactory;
import prashant21tube.springframework.service.PrimaryGermanGreetingService;
import prashant21tube.springframework.service.PrimaryGreetingService;
import prashant21tube.springframework.service.PrimarySpanishGreetingProfile;

@Configuration
public class GreetingServiceConfig {
	
	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
		return new GreetingServiceFactory(repository);
	}
	
	@Bean
	@Primary
	@Profile({"default", "en"})
	PrimaryGreetingService PrimaryGreetingService(GreetingRepository repository) {
		return new PrimaryGreetingService(repository);
	}
	
	@Bean
	@Primary
	@Profile("de")
	PrimaryGermanGreetingService primaryGermanGreetingService(GreetingRepository repository ) {
		return new PrimaryGermanGreetingService(repository);
	}
	
	@Bean
	@Primary
	@Profile("es")
	PrimarySpanishGreetingProfile primarySpanishGreetingProfile(GreetingRepository repository) {
		return new PrimarySpanishGreetingProfile(repository);
	}

}

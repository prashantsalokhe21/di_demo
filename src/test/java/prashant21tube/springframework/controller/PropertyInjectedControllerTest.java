/**
 * 
 */
package prashant21tube.springframework.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import prashant21tube.springframework.service.GreetingServiceImpl;

/**
 * @author lenovo
 *
 */
@SpringBootTest
public class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() throws Exception{
		System.out.println("Hello");
		assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
	}

}

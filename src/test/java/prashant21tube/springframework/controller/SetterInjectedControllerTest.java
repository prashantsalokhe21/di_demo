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
public class SetterInjectedControllerTest {
	
	private SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception{
		System.out.println("Hello");
		assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
	}


}

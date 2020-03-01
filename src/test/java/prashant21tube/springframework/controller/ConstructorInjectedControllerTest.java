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
public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setUp() {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception{
		System.out.println("Hello");
		assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
	}

}

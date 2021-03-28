package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GreetingImplTest {
	
	private Greeting greeting;


	@BeforeEach
	public void setup()
	{
		greeting = new GreetingImpl();
		
	}

	@Test
	public void greetShouldReturnValidOutput() {
		String result = greeting.greet("Junit");
		Assertions.assertNotNull(result);
		Assertions.assertEquals("Hello Junit", result);
	}
	
	@Test()
	public void greetShouldThrowException()
	{
		greeting = new GreetingImpl();
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			greeting.greet(null);
		});
		
	}

	
	@Test()
	public void greetShouldThrowExceptionforBlank()
	{
		 greeting = new GreetingImpl();
		 Assertions.assertThrows(IllegalArgumentException.class, ()->{
				greeting.greet("");
			});
		
	}
}

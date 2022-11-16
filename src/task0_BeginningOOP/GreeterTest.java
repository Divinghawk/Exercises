package task0_BeginningOOP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	public void testThatGreeterReturnsTheCorrectGreeting() {
		String str1 = "Hello, World!";
	    assertEquals(str1, Greeter.getGreeting());
	}

}

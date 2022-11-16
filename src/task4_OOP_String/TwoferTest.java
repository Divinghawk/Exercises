package task4_OOP_String;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class TwoferTest {
//	@SuppressWarnings("unused")
	private Twofer twofer;
	
	
	@BeforeEach 
	public void setup() { // Resettet das Object wieder in den Werkzustand
		twofer = new Twofer();
		System.out.println(twofer);
	}
	
	@Test
	public void noNameGiven() {
		assertEquals("One for you, one for me.", twofer.twofer(null));
	}
	
	
	@Test
	@Disabled("Remove to run test")
	public void aNameGiven() {
		assertEquals("One for Alice, one for me.", twofer.twofer("Alice"));
	}
	
	@Disabled("Remove to run test")
	@Test
	public void anotherNameGiven() {
		assertEquals("One for Bob, one for me.", twofer.twofer("Bob"));
	}

}

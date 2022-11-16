package task1_OOP_INT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class lasagna2Test {
	
	@Test
	public void expectedMinutesInOven () {
		assertEquals(40, new lasagna2().expectedMinutesInOven());
	}
	@Test
	public void remainingMinutesInOven() {
		assertEquals(20, new lasagna2().remainingMinutesInOven(20));
	}
	@Test
	public void preparationTimeInMinutes() {
		assertEquals(4, new lasagna2().preparationTimeInMinutes(2));
	}
	@Test
	public void totalTimeInMinutes() {
		assertEquals(26, new lasagna2().totalTimeInMinutes(3, 20));
	}

}

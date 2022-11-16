package task6_OOP_INT_DOUBLE_CAST_Calculate;


import java.lang.Math;
import org.junit.Assert;
import org.junit.jupiter.api.Test;



class CarsAssembleTest {

	double Epsilon = 4.94065645841247E-324;
	
	CarsAssemble carsAssemble = new CarsAssemble();
	
	@Test
	public void workingItemsPerMinuteForSpeedFive() {
		Assert.assertEquals(16, carsAssemble.workingItemsPerMinute(5));
	}
	
	@Test
	public void workingItemsPerMinuteForSpeedNine() {
		Assert.assertEquals(26, carsAssemble.workingItemsPerMinute(9));
	}
	
	@Test
	public void workingItemsPerMinuteForSpeedZero() {
		Assert.assertEquals(0, carsAssemble.workingItemsPerMinute(0));
	}
	
	@Test
	public void workingItemsPerMinuteForSpeedEight() {
		Assert.assertEquals(26, carsAssemble.workingItemsPerMinute(8));
	}
	
	@Test
	public void productionRatePerHourForSpeedSeven() {
		Assert.assertTrue(Math.abs(carsAssemble.productionRatePerHour(7) - 1392.3) < Epsilon);
		// Double ist der Datentypoverflow check mit epsilon , doublegrenze = epsilon (E)
	}

	@Test
	public void workingItemsPerMinuteForSpeedOne() {
		Assert.assertEquals(3, carsAssemble.workingItemsPerMinute(1));
	}
	
	@Test
	public void workingItemsPerMinuteForSpeedTen() {
		Assert.assertEquals(28, carsAssemble.workingItemsPerMinute(10));
	}
	
	@Test
	public void productionRatePerHourForSpeedOne() {
		Assert.assertTrue(Math.abs(carsAssemble.productionRatePerHour(1) - 221.0) < Epsilon);
	}
	
	@Test
	public void productionRatePerHourForSpeedTen() {
		Assert.assertTrue(Math.abs(carsAssemble.productionRatePerHour(10) - 1701.7) < Epsilon);
	}
	
	@Test
	public void productionRatePerHourForSpeedFour() {
		Assert.assertTrue(Math.abs(carsAssemble.productionRatePerHour(4) - 884.0) < Epsilon);
	}
	
	@Test
	public void productionRatePerHourForSpeedNine() {
		Assert.assertTrue(Math.abs(carsAssemble.productionRatePerHour(9) - 1591.2) < Epsilon);
	}
	
	@Test
	public void productionRatePerHourForSpeedZero() {
		Assert.assertTrue((carsAssemble.productionRatePerHour(0) - 0.0) < Epsilon);
	}
}

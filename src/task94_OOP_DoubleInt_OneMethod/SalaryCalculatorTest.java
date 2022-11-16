package task94_OOP_DoubleInt_OneMethod;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

class SalaryCalculatorTest {

	SalaryCalculator salary = new SalaryCalculator();
	
	@Test
	public void soldAboveThreshold() {
		Assert.assertEquals(1325,00, salary.finalSalary(0, 25));
	}

}

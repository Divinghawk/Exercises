package task991_Calculator_Squares;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DifferenceOfSquaresCalculatorTest {

	DifferenceOfSquaresCalculator calculator = new DifferenceOfSquaresCalculator();
	
	@Test
	public void testsquaresum() {	
		int expected = 1;
		int actual = calculator.computeSquareOfSumTo(1);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSumOfSquaresUpToOne() {
	    int expected = 1;
	    int actual = calculator.computeSumOfSquaresTo(1);
	    Assert.assertEquals(expected, actual);
	}

	@Test
	public void testDifferenceOfSquaresUpToFive() {
	    int expected = 170;
	    int actual = calculator.computeDifferenceOfSquares(5);
	    Assert.assertEquals(expected, actual);
	}
}

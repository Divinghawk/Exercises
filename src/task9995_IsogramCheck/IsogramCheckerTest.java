package task9995_IsogramCheck;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class IsogramCheckerTest {
	
	IsogramChecker iso = new IsogramChecker();

	@Test
	public void testDuplicateEndAlphabet() {
		Assert.assertEquals( false , iso.isIsogram("zzyzx"));
	}
	
	@Test
	public void testIsogramWithDuplicatedHyphen() {
		Assert.assertEquals( true , iso.isIsogram("six-year-old"));
	}
	
}

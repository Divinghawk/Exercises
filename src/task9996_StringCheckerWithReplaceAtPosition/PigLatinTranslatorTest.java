package task9996_StringCheckerWithReplaceAtPosition;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PigLatinTranslatorTest {

	PigLatinTranslator pigLatinTranslator = new PigLatinTranslator();
	
	@Test
	public void testYAsSecondLetterInTwoLetterWord() {
	    Assert.assertEquals("ymay", pigLatinTranslator.translate("my"));
	}
	
	@Test
	public void testAWholePhrase() {
	    Assert.assertEquals("ickquay astfay unray", pigLatinTranslator.translate("quick fast run"));
	}
	
	@Test
	public void testWordBeginningWithQWithoutAFollowingU() {
	    Assert.assertEquals("atqay", pigLatinTranslator.translate("qat"));
	}
	
	@Test
	public void testWordBeginningWithA() {
	    Assert.assertEquals("appleay", pigLatinTranslator.translate("apple"));
	}
	
	@Test
	public void testWordBeginningWithE() {
	    Assert.assertEquals("earay", pigLatinTranslator.translate("ear"));
	}
}

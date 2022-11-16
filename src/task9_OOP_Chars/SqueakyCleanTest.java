package task9_OOP_Chars;


import org.junit.Assert;

import org.junit.jupiter.api.Test;

class SqueakyCleanTest {
	
	SqueakyClean squeakyClean = new SqueakyClean();
	
	@Test
	public void keep_only_letters() {
		Assert.assertEquals("ab", SqueakyClean.clean("a1\uD83D\uDE002\uD83D\uDE003\uD83D\uDE00b"));
	}
	
	@Test
	public void omit_lower_case_greek_letters() {
		Assert.assertEquals("MyΟFinder", SqueakyClean.clean("MyΟβιεγτFinder"));
	}
	
	@Test
	public void spaces() {
		Assert.assertEquals("my___Id", SqueakyClean.clean("my   Id"));
	}
	
	@Test
	public void string() {
		Assert.assertEquals("àḃç", SqueakyClean.clean("àḃç"));
	}
	
	@Test
	public void kebab_to_camel_case_no_letter() {
		Assert.assertEquals("aC", SqueakyClean.clean("a-1C"));
	}
	
	@Test
	public void string_with_no_letters() {
		Assert.assertEquals("",SqueakyClean.clean("\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00"));
	}
	
	@Test
	public void ctrl() {
		Assert.assertEquals("myCTRLCTRLCTRLId", SqueakyClean.clean("my\0\r\u007FId"));
	}
	
	@Test
	public void empty() {
		Assert.assertEquals("", SqueakyClean.clean(""));
	}
	
	@Test
	public void leading_and_trailing_spaces() {
		Assert.assertEquals("_myId_", SqueakyClean.clean(" myId "));
	}
	
	@Test
	public void combine_conversions() {
		Assert.assertEquals("_AbcĐCTRL", SqueakyClean.clean("9 -abcĐ\uD83D\uDE00ω\0"));
	}
	
	@Test
	public void kebab_to_camel_case() {
		Assert.assertEquals("àḂç", SqueakyClean.clean("à-ḃç"));
	}
	
	@Test
	public void single_letter() {
		Assert.assertEquals("A", SqueakyClean.clean("A"));
	}
	
}

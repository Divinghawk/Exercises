package task8_OOP_ArrayList_FunctionsWithInsides;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LanguageListTest {
	

	
	@Test
	public void addMultipleLanguages() {
		
		LanguageList languageList = new LanguageList();
		
		languageList.addLanguage("Java");
		languageList.addLanguage("Ruby");
	    languageList.addLanguage("C++");
	    
	    Assert.assertTrue(languageList.containsLanguage("Java"));
	    Assert.assertTrue(languageList.containsLanguage("Ruby"));
	    Assert.assertTrue(languageList.containsLanguage("C++"));
	    Assert.assertFalse(languageList.containsLanguage("Python"));
	}
	
	@Test
	public void countEmpty() {
		
		LanguageList languageList = new LanguageList();
		
		Assert.assertEquals(0, languageList.count());
	}
	
	@Test
	public void countThree() {
		LanguageList languageList = new LanguageList();
		
		languageList.addLanguage("Java");
		languageList.addLanguage("Ruby");
	    languageList.addLanguage("C++");
	    
	    Assert.assertEquals(3, languageList.count());
	}
	
	@Test
	public void excitingLanguageListWithKotlin() {
		LanguageList languageList = new LanguageList();
		
		languageList.addLanguage("Python");
		languageList.addLanguage("Kotlin");
		 
		Assert.assertTrue(languageList.isExciting());
	}
	
	@Test
	public void addOneLanguage() {
		
		LanguageList languageList = new LanguageList();
		
		languageList.addLanguage("Java");
		
		Assert.assertTrue(languageList.containsLanguage("Java"));
		Assert.assertFalse(languageList.containsLanguage("Python"));
	}

	@Test
	public void empty() {
		
		LanguageList languageList = new LanguageList();
		
		Assert.assertTrue(languageList.isEmpty());
	}
	
	@Test
	public void firstLangugage() {
		
		LanguageList languageList = new LanguageList();
		
	    languageList.addLanguage("Java");
	    languageList.addLanguage("Python");
	    languageList.addLanguage("Ruby");
	    
	    Assert.assertEquals("Java", languageList.firstLanguage());
	}
	
	@Test
	public void boringLanguageList() {
		
		LanguageList languageList = new LanguageList();
		
	    languageList.addLanguage("Python");
	    languageList.addLanguage("Ruby");
	    languageList.addLanguage("C++");
	    
	    Assert.assertFalse(languageList.isExciting());
	}
	
	@Test
	public void excitingLanguageListWithJava() {
		
		LanguageList languageList = new LanguageList();
		
		languageList.addLanguage("Java");
		Assert.assertTrue(languageList.isExciting());
	}
	
	@Test
	public void removeLanguage() {
		
		LanguageList languageList = new LanguageList();
		
	    languageList.addLanguage("Java");
	    languageList.addLanguage("Python");
	    languageList.addLanguage("Ruby");
	    languageList.removeLanguage("Python");
	    
	    Assert.assertTrue(languageList.containsLanguage("Java"));
	    Assert.assertFalse(languageList.containsLanguage("Python"));
	    Assert.assertTrue(languageList.containsLanguage("Ruby"));
	}
}

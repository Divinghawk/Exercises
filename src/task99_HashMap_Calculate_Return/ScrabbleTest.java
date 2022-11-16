package task99_HashMap_Calculate_Return;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ScrabbleTest {


	@Test
	public void scoreTest() {
		Scrabble scrabble = new Scrabble("zoo");
		Assert.assertEquals(12, scrabble.getScore());
	}
	
	@Test
	public void testEntireAlphabetAvailable() {
	    Scrabble scrabble = new Scrabble("abcdefghijklmnopqrstuvwxyz");
	    Assert.assertEquals(87, scrabble.getScore());
	}

}

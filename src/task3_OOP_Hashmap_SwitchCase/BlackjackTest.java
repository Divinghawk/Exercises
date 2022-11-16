package task3_OOP_Hashmap_SwitchCase;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

class BlackjackTest {
	
	Blackjack blackjack = new Blackjack();

	@Test
	public void parseCardcheckAce() {
		Assert.assertEquals(11, new Blackjack().parseCard("ace"));
	}	
	
	@Test
	public void blackjackWithKingAceSecond() {
		Assert.assertEquals(true, new Blackjack().isBlackjack("king", "ace"));
	}
	
//	@Test
//	public void blackjackWithKingAceSecond() {
//		Assert.assertTrue(new Blackjack().isBlackjack("king", "ace"));
//	}
	@Test
	public void firstTurnWithAceAndDealerAce() {
		Assert.assertEquals("P", new Blackjack().firstTurn("ace", "ace", "ace"));
	}

//	@Test
//	public void firstTurnWithAceAndDealerAce() {
//		assertEquals("H", new Blackjack().firstTurn("two", "nine", "queen"));
//	}
}
	

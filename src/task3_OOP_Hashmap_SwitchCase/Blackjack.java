package task3_OOP_Hashmap_SwitchCase;

public class Blackjack {
	
	private final int blackjack = 21;
	private final String stand = "S";
	private final String hit = "H";
	private final String split = "P";
	private final String win = "W";
	
	
    public int parseCard(String card) {
//        throw new UnsupportedOperationException("Please implement the Blackjack.parseCard method");
    	switch (card) {
		case "ace": 			
			return 11;
		case "two":
			return 2;
		case "three":
			return 3;
		case "four":
			return 4;
		case "five":
			return 5;
		case "six":
			return 6;
		case "seven":
			return 7;
		case "eight":
			return 8;
		case "nine":
			return 9;
		case "ten":
			return 10;
		case "jack":
			return 10;
		case "queen":
			return 10;
		case "king":
			return 10;
		default:
			return 0;
		}
    }

    public boolean isBlackjack(String card1, String card2) {
//        throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
    	return parseCard(card1) + parseCard(card2) == blackjack;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
//        throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
    	if(!isBlackjack) {
    		return split;
    	} else if (dealerScore <10) {
    		return win;
    	} else {
    		return stand;
    	}
    }

    public String smallHand(int handScore, int dealerScore) {
//        throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
    	if (handScore >= 17) {
    		return stand;
    	} if (handScore <= 11) {
    		return hit;
    	} else if (dealerScore >= 7){
    		return hit;
    	} else {return stand;}
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}

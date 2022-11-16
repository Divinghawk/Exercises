package task992_ArrayList_Enum;

import java.util.Collections;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class HandshakeCalculatorTest {

	HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
	
	@Test
	public void testReversingNoActionsYieldsNoActions() {
	    Assert.assertEquals(Collections.EMPTY_LIST, handshakeCalculator.calculateHandshake(16));
	}

//	@Test
//	public void testThatHandlesMoreThanFiveBinaryPlacesWithoutReversal() {
//	    Assert.assertEquals(handshakeCalculator.calculateHandshake(35)).containsExactly(Signal.WINK, Signal.DOUBLE_BLINK);
//	}
	
//	@Test
//	public void testThatHandlesMoreThanFiveBinaryPlacesWithoutReversal() {
//	    assertThat(handshakeCalculator.calculateHandshake(35)).containsExactly(Signal.WINK, Signal.DOUBLE_BLINK);
//	}
}

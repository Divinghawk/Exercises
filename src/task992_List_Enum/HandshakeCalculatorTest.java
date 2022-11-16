package task992_List_Enum;

import java.util.Collections;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class HandshakeCalculatorTest {

	HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
	
//	@Test
//	public void Wink() {
//		Assert.assertEquals("WINK", handshakeCalculator.calculateHandshake(1) );
//	}

	@Test
	public void testReversingNoActionsYieldsNoActions() {
	    Assert.assertEquals(Collections.EMPTY_LIST,handshakeCalculator.calculateHandshake(16));
	}
	
}

package task995_CasaerCipher;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

class RotationalCipherTest {

	@Test
	public void rotateCapitalLetters() {
	    RotationalCipher rotationalCipher = new RotationalCipher(5);
	    Assert.assertEquals("TRL", rotationalCipher.rotate("OMG"));
	}
	
	@Test
	public void rotateNumbers() {
		RotationalCipher rotationalCipher = new RotationalCipher(4);
	    Assert.assertEquals("Xiwxmrk 1 2 3 xiwxmrk", rotationalCipher.rotate("Testing 1 2 3 testing"));
	}
	
	@Test
	public void rotateSpaces() {
		RotationalCipher rotationalCipher = new RotationalCipher(5);
	    Assert.assertEquals("T R L", rotationalCipher.rotate("O M G"));
	}

}

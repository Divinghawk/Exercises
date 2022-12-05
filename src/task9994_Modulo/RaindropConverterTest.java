package task9994_Modulo;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RaindropConverterTest {

	RaindropConverter raindropConverter = new RaindropConverter();
	
	@Test
	public void soundFor27IsPlingAsItHasFactor3() {
	    Assert.assertEquals("Pling", raindropConverter.convert(27));
	}
	
	@Test
	public void soundFor14IsPlongAsItHasFactor7() {
	    Assert.assertEquals("Plong", raindropConverter.convert(14));
	}
	
	@Test
	public void soundFor7IsPlong() {
	    Assert.assertEquals("Plong", raindropConverter.convert(7));
	}
	
	@Test
	public void soundFor9IsPlingAsItHasFactor3() {
	    Assert.assertEquals("Pling", raindropConverter.convert(9));
	}
	
	@Test
	public void soundFor35IsPlangPlongAsItHasFactors5And7() {
	    Assert.assertEquals("PlangPlong", raindropConverter.convert(35));
	}
	
	@Test
	public void noSoundFor2Cubed() {
	    Assert.assertEquals("8", raindropConverter.convert(8));
	}
	
	@Test
	public void soundFor5IsPlang() {
	    Assert.assertEquals("Plang", raindropConverter.convert(5));
	}
	
	@Test
	public void soundFor21IsPlingPlongAsItHasFactors3And7() {
	    Assert.assertEquals("PlingPlong", raindropConverter.convert(21));
	}
	
	@Test
	public void soundFor25IsPlangAsItHasFactor5() {
	    Assert.assertEquals("Plang", raindropConverter.convert(25));
	}
	
	@Test
	public void soundFor105IsPlingPlangPlongAsItHasFactors3And5And7() {
	    Assert.assertEquals("PlingPlangPlong", raindropConverter.convert(105));
	}
	
	@Test
	public void soundFor1Is1() {
	    Assert.assertEquals("1", raindropConverter.convert(1));
	}
	
	@Test
	public void soundFor10IsPlangAsItHasFactor5() {
	    Assert.assertEquals("Plang", raindropConverter.convert(10));
	}
	
	@Test
	public void soundFor49IsPlongAsItHasFactor7() {
	    Assert.assertEquals("Plong", raindropConverter.convert(49));
	}
	
	@Test
	public void soundFor3IsPling() {
	    Assert.assertEquals("Pling", raindropConverter.convert(3));
	}
	
	@Test
	public void noSoundFor52() {
	    Assert.assertEquals("52", raindropConverter.convert(52));
	}
	
	@Test
	public void soundFor6IsPlingAsItHasFactor3() {
	    Assert.assertEquals("Pling", raindropConverter.convert(6));
	}
	
	@Test
	public void soundFor3125IsPlangAsItHasFactor5() {
	    Assert.assertEquals("Plang", raindropConverter.convert(3125));
	}
	
	@Test
	public void soundFor15IsPlingPlangAsItHasFactors3And5() {
	    Assert.assertEquals("PlingPlang", raindropConverter.convert(15));
	}
}

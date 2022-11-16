package task93_OOP_Interface_ArrayList;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Exp_Prod_Test {


	@Test
	public void race() {
	    ProductionRemoteControlCar productionCar = new ProductionRemoteControlCar();
	    ExperimentalRemoteControlCar experimentalCar = new ExperimentalRemoteControlCar();
	    TestTrack.race((RemoteControlCar) productionCar);
	    TestTrack.race((RemoteControlCar) productionCar);
	    TestTrack.race((RemoteControlCar) experimentalCar);
	    TestTrack.race((RemoteControlCar) experimentalCar);
	    
	    Assert.assertEquals(20, experimentalCar.getDistanceTravelled() - productionCar.getDistanceTravelled());
	}
	
	@Test 
	public void rankCars(){
		ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
	    ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
	    prc1.setNumberOfVictories(3);
	    prc2.setNumberOfVictories(2);
	    List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(prc1, prc2);
	    Assert.assertEquals(prc1, rankings.get(1));
	}
	
//	@Test
//	public void ensureCarsAreComparables() {
//		Assert.assertEquals(RemoteControlCar.class, ProductionRemoteControlCar.class);
//	}

}

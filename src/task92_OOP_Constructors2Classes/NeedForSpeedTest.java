package task92_OOP_Constructors2Classes;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NeedForSpeedTest {

	NeedForSpeed car = new NeedForSpeed(2, 1);
	RaceTrack race = new RaceTrack(16);
	
	@Test
	public void new_remote_control_car_has_not_driven_any_distance() {
		Assert.assertEquals(0, car.distanceDriven());
	}
	
	@Test
	public void drive_until_battery_is_drained() {
		
		for (var i = 0; i < 100; i++) {
			car.drive();
		}
		
		Assert.assertTrue(car.batteryDrained());
	}
	
	@Test
	public void nitro_car_has_battery_not_drained() {
		Assert.assertFalse(car.batteryDrained());
	}
	

	@Test
	public void car_can_finish_with_car_that_just_cannot_finish() {
		
		int speed = 3;
	    int batteryDrain = 20;
	    var car = new NeedForSpeed(speed, batteryDrain);
	    int distance = 16;
	    var race = new RaceTrack(distance);		
		
		Assert.assertFalse(race.tryFinishTrack(car));
		
	}
	
	@Test
	public void drive_increases_distance_driven_with_speed() {
		int speed = 5;
	    int batteryDrain = 1;
	    var car = new NeedForSpeed(speed, batteryDrain);
		car.drive();
		Assert.assertEquals(5, car.distanceDriven());
	}

}

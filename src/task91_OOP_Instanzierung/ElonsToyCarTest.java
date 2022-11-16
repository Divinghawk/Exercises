package task91_OOP_Instanzierung;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ElonsToyCarTest {

	ElonsToyCar car = new ElonsToyCar();
	
	@Test
	public void buy_new_car_returns_instance() {
		ElonsToyCar car = ElonsToyCar.buy();
		Assert.assertNotNull(car);		
	}
	
	@Test
	public void new_car_distance_display() {
		Assert.assertEquals("Driven 0 meters", car.distanceDisplay());
	}
	
	@Test
	public void distance_display_after_driving_once() {
		car.drive();
		Assert.assertEquals("Driven 20 meters", car.distanceDisplay());
	}
	
	@Test
	public void battery_display_after_driving_once() {
		car.drive();
		Assert.assertEquals("Battery at 99%", car.batteryDisplay());
	}
	
	@Test
	public void distance_display_when_battery_empty() {
		for(int i = 0; i < 100; i++) {
			car.drive();
		}
		
		car.drive();
		Assert.assertEquals("Driven 2000 meters", car.distanceDisplay());
	}
	
	@Test
	public void battery_display_after_driving_multiple_times() {
		for(int i = 0; i < 23; i++) {
			car.drive();
		}
		
		Assert.assertEquals("Battery at 77%", car.batteryDisplay());
	}

	@Test
	public void buy_new_car_return_new_car_each_time() {
		 ElonsToyCar car1 = ElonsToyCar.buy();
		 ElonsToyCar car2 = ElonsToyCar.buy();
		 
		 Assert.assertNotEquals(car2, car1);
	}
	
	@Test
	public void distance_display_after_driving_multiple_times() {
		for(int i = 0; i < 17; i++) {
			car.drive();
		}
		
		Assert.assertEquals("Driven 340 meters", car.distanceDisplay());
	}
	
	@Test
	public void new_car_battery_display() {
		Assert.assertEquals("Battery at 100%", car.batteryDisplay());
	}
	
}

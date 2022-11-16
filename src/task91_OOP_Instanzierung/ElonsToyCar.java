package task91_OOP_Instanzierung;

public class ElonsToyCar {


	private int meters;
	private int battery;
	
	ElonsToyCar(){
		this.meters = 0;
		this.battery = 100;
	}
	
	
    public static ElonsToyCar buy() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
    	ElonsToyCar car = new ElonsToyCar();
    	return car;
    }

    public String distanceDisplay() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
    	return "Driven " + meters + " meters";
//    	return String.format("Driven %d meters", meters);
    }

    public String batteryDisplay() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
    	if (battery == 0) {
    		return "Battery empty";
    	}
        return "Battery at " + battery + "%";
    }

    public void drive() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
    	if (meters < 2000) {
    		meters +=20;
    		--battery;
    	}
    }
}

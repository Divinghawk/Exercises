package task92_OOP_Constructors2Classes;

public class NeedForSpeed {

	
	private int speed = 5;
	private int batteryDrain = 0;
	private int distanceDriven = 0;
	private int remainingBattery = 100;
	
	NeedForSpeed(int speed, int batteryDrain){
		this.speed = speed;
		this.batteryDrain = batteryDrain;
	}
    // TODO: define the constructor for the 'NeedForSpeed' class

    public boolean batteryDrained() {
//        throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
    	
    	if (this.remainingBattery < this.batteryDrain) {
    		return true;
    	}
        return false;
    }

    public int distanceDriven() {
//        throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
        return this.distanceDriven;
    }

    public void drive() {
//        throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
    	if (!batteryDrained()) {
    		this.distanceDriven = this.distanceDriven + this.speed;
    		this.remainingBattery = this.remainingBattery - this.batteryDrain;
    	}
    }

    public static NeedForSpeed nitro() {
//        throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
    	NeedForSpeed car = new NeedForSpeed(50,4);
    	return car;
    }
    
}

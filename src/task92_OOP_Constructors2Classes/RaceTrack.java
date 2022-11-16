package task92_OOP_Constructors2Classes;

public class RaceTrack {

    // TODO: define the constructor for the 'RaceTrack' class

	private int distance = 800;
	
	RaceTrack(int distance){
		this.distance = distance;
	}
	
	
    public boolean tryFinishTrack(NeedForSpeed car) {
//        throw new UnsupportedOperationException("Please implement the RaceTrack.tryFinishTrack() method");
    	while (!car.batteryDrained()) {
    		car.drive();
    	}
    	if (car.distanceDriven() >= this.distance) {
    		return true;
    	}else {
    		return false;
    	}  	
    }
}

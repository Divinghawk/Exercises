package task93_OOP_Interface_ArrayList;

class ExperimentalRemoteControlCar implements RemoteControlCar {
	
	private final int Speed = 20;
	private int distanceTraveled;
	
	@Override
    public void drive() {
//        throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.drive() method");
    	distanceTraveled += Speed;
    	
    }

    public int getDistanceTravelled() {
//        throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.getDistanceTravelled() method");
    	return distanceTraveled;
    }
}

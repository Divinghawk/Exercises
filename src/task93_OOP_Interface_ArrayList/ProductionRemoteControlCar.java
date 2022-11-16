package task93_OOP_Interface_ArrayList;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
	
    private final int SPEED = 10;
    
    private int distanceTraveled;
    private int numberOfVictories;
    
    @Override
    public void drive() {
        distanceTraveled += SPEED;
    }
    @Override
    public int getDistanceTravelled() {
        return distanceTraveled;
    }
    public int getNumberOfVictories() {
        return numberOfVictories;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar that) {
        return this.numberOfVictories - that.getNumberOfVictories();
    }
}

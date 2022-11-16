package task6_OOP_INT_DOUBLE_CAST_Calculate;

public class CarsAssemble {
	
    private static final int rate = 221;
    
    private double successRate(int speed) {
        if (speed >= 0 && speed <= 4) return 1;
        else if (speed >= 5 && speed <= 8) return 0.9;
        else if (speed == 9) return 0.8;
        else if (speed == 10) return 0.77;
        else throw new IllegalArgumentException ("Given speed is lower than 0 or greater than 10");
    }
    
    public double productionRatePerHour(int speed) {
        return rate * speed * this.successRate(speed);
    }
    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }
	
	
}

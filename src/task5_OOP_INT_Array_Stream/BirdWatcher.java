package task5_OOP_INT_Array_Stream;

import java.util.Arrays;

public class BirdWatcher {

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {    	
		this.birdsPerDay = birdsPerDay.clone();

    }

    public int[] getLastWeek() {
//        throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
    	int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};
    	return birdsPerDay;
    }

    public int getToday() {
//        throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
    	if (birdsPerDay.length < 1) return 0;
    	return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
//        throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    	birdsPerDay[birdsPerDay.length -1]++;
    }

    public boolean hasDayWithoutBirds() {
//        throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    	return Arrays.stream(birdsPerDay).filter(value -> value > 0)
    			.count() !=7;
    }

    public int getCountForFirstDays(int numberOfDays) {
//        throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    	return Arrays.stream(birdsPerDay)
    			.limit(numberOfDays)
    			.sum();
    }

    public int getBusyDays() {
//        throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    	return (int) Arrays.stream(birdsPerDay)
    			.filter(value -> value >= 5)
    			.count();
    }
}

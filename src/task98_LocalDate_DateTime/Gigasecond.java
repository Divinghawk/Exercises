package task98_LocalDate_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {


	//2. Möglichkeit
//	static final long gigasecond = (long)Math.pow(10, 9);
	
	private LocalDateTime dateTime;
    
    public Gigasecond(LocalDate moment) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	this.dateTime = moment.atTime(0, 0);
    	
    	//2. Möglichkeit
//    	this.dateTime = moment.atTime(0,0).plusSeconds(gigasecond);
    }

    public Gigasecond(LocalDateTime moment) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	this.dateTime = moment;
    	
    	//2. Möglichkeit
//    	this.dateTime = moment.plusSeconds(gigasecond);
    }

    public LocalDateTime getDateTime() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	return this.dateTime.plusSeconds(1000000000);
    	
    	
    	//2. Möglichkeit
//    	return this.dateTime
    }
	
}

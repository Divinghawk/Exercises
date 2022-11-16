package task1_OOP2;

public class Lasagna {
    
		
	public static void main(String[] args) {
		Lasagna lasagna = new Lasagna();
		lasagna.expectedMinutesInOven();
		lasagna.remainingMinutesInOven(30);
		lasagna.preparationTimeInMinutes(2);
		lasagna.totalTimeInMinutes(3, 20);
	}

	
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int a = 40;
        return a;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int b){
//        int a = 40;
//        int b = 30;
		int c = expectedMinutesInOven() - b;    
        return c;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layer){
    	
    	int preparationTimeInMinutes = layer * 2; 

        return preparationTimeInMinutes;       
    }
    
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layer, int ovenTime) {
        
    	int sum = layer * 2 + ovenTime;
    	
    	return sum;
    }
}

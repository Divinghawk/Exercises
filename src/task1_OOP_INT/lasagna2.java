package task1_OOP_INT;

public class lasagna2 {
	
	public static void main(String[] args) {		
		
	}
	
	int eMO = 40;
	
	public int expectedMinutesInOven() {
		return eMO;
	}
	
	public int remainingMinutesInOven(int actualLasagna) {
		int remain = eMO - actualLasagna;
		
		return remain;		
	}
	
	public int preparationTimeInMinutes(int numberLayers) {
		int prep = numberLayers * 2;
		
		return prep;
	}
	
	public int totalTimeInMinutes(int numberLayers, int actualLasagna) {
		int totalTime = numberLayers * 2 + actualLasagna;
		return totalTime;
	}
}

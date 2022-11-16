package task94_OOP_DoubleInt_OneMethod;

public class SalaryCalculator {
	
	private int multi = 1;
	private double multipenalty = 0.85;
	
	private int multiProductSold = 10;
	private int multiProductSoldBonus = 13;
	
    public double multiplierPerDaysSkipped(int daysSkipped) {
//        throw new UnsupportedOperationException("Please implement the SalaryCalculator.multiplierPerDaysSkipped() method");
    	
    	if (daysSkipped >= 5) {
    		return multipenalty;
    	} else 
    		return multi;
    	
    }

    public int multiplierPerProductsSold(int productsSold) {
//        throw new UnsupportedOperationException("Please implement the SalaryCalculator.multiplierPerProductsSold() method");

    	if (productsSold >= 20) {
    		return multiProductSoldBonus;
    	} else return multiProductSold;
    	    	
    }

    public double bonusForProductSold(int productsSold) {
//        throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductSold() method");
    	
    	if (productsSold >= 20) {
    		return productsSold * multiProductSoldBonus;
    	} else return productsSold * multiProductSold;
    	
    }

    public double finalSalary(int daysSkipped, int productsSold) {
//        throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    	double salary = 1000 * multiplierPerDaysSkipped(daysSkipped) + (bonusForProductSold(productsSold));
    	
    	if (salary >= 2000) {
    		return 2000;
    	} else return salary;
    } 
    
}


package task994_Triangle_Recursion;



class Triangle {

    private double side1;
	private double side2;
	private double side3;

	Triangle(double side1, double side2, double side3) throws TriangleException {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        
	    if (side1 >= side2 + side3)
	        throw new TriangleException();
	    else if (side2 >= side1 + side3)
	        throw new TriangleException();
	    else if (side3 >= side2 + side1)
	        throw new TriangleException();
//	    else if (side1 == side2 && side2 == side3 && side1==side3)
//	        throw new TriangleException();
	    
	    else {
	    	
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	}

    boolean isEquilateral() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	if(side1==side2 && side2==side3) {
    		return true;
    	} else {
    		return false;
    	}
    }

    boolean isIsosceles() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	if((side1==side2 && side2!=side3 ) || (side1!=side2 && side3==side1) || (side3==side2 && side3!=side1) || (side1 == side2 && side2 == side3 && side1==side3)) {
    		return true;
    	} else {
    		return false;
    	}
    }

    boolean isScalene() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	
    	if(side1!=side2 && side2!=side3 && side3!=side1) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
	
}

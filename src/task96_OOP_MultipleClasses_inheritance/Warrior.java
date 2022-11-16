package task96_OOP_MultipleClasses_inheritance;

 class Warrior extends Fighter{

	    @Override
	    int damagePoints(Fighter wizard) {
//	        throw new UnsupportedOperationException("Please implement Warrior.damagePoints() method");
	    	return wizard.isVulnerable() ? 10 : 6;
	    }
	 
}

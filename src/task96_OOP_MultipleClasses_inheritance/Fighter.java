package task96_OOP_MultipleClasses_inheritance;

abstract class Fighter {

    boolean isVulnerable() {
//        throw new UnsupportedOperationException("Please provide implementation for this method");
    	return false;
    }

    abstract int damagePoints(Fighter fighter);
    
    @Override
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }
}

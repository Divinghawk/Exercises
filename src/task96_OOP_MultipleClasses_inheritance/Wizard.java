package task96_OOP_MultipleClasses_inheritance;

class Wizard extends Fighter{

	boolean spellPrepared = false;
	
    @Override
    boolean isVulnerable() {
//        throw new UnsupportedOperationException("Please implement Wizard.isVulnerable() method");
    	return !spellPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
//        throw new UnsupportedOperationException("Please implement Wizard.damagePoints() method");
        return isVulnerable() ? 12 : 3;
    }

    void prepareSpell() {
//        throw new UnsupportedOperationException("Please implement Wizard.prepareSpell() method");
    	spellPrepared = true;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Wizard";
    }
}

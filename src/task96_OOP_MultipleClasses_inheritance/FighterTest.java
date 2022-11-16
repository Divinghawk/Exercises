package task96_OOP_MultipleClasses_inheritance;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

class FighterTest {

//	Fighter peon = new Fighter();
	Warrior warrior = new Warrior();
	Wizard wizard = new Wizard();
	
	@Test
	public void warriorToString() {
		Assert.assertEquals("Fighter is a Warrior", warrior.toString());
	}
	
	@Test
	public void dmgTestWizardWarrior() {
		Warrior warrior = new Warrior();
		Wizard wizard = new Wizard();
		Assert.assertEquals(12, wizard.damagePoints(warrior));
		wizard.prepareSpell();
		Assert.assertEquals(3, wizard.damagePoints(warrior));
	}

}

package task999_HashSet_Random_StringBuilder;


import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RobotTest {

	Robot robot = new Robot();
	
	@Test
	public void robotNamesAreUnique() {
	    Set<String> robotNames = new HashSet<>();
	    int sampleSize = 5000;
	    for (int i = 0; i < sampleSize; i++) {
	        robotNames.add(new Robot().getName());
	    }
	    Assert.assertEquals(sampleSize, robotNames.size());
	}

	@Test
	public void differentRobotsHaveDifferentNames() {
	    Assert.assertNotEquals(robot.getName(), new Robot().getName());
	}
	
	@Test
	public void hasName() {
	    Assert.assertNotNull(robot.getName());
	}
	
	@Test
	public void resetName() {
	    final String name = robot.getName();
	    robot.reset();
	    final String name2 = robot.getName();
	    Assert.assertNotEquals(name, name2);
	    Assert.assertNotNull(name2);
	}
}

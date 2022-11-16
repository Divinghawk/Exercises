package task95_OOP_SwitchCase_IllegalArgumentException;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class IllegalArgumentException_FootballMatchReportsTest {

	FootballMatchReports number = new FootballMatchReports();
	
	@Test
	public void test_exception() {
		Assert.assertThrows(IllegalArgumentException.class, () -> FootballMatchReports.onField(13));
	}


}

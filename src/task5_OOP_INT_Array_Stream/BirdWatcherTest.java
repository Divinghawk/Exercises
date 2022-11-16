package task5_OOP_INT_Array_Stream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BirdWatcherTest {

	private static final int DAY2 = 0;
	private static final int DAY1 = 0;
	private static final int DAY3 = 0;
	private static final int DAY4 = 0;
	private static final int TODAY = 0;
	private static final int DAY5 = 0;
	private static final int DAY6 = 0;
	BirdWatcher birdWatcher = new BirdWatcher(new int[] {});
	
	@Test
	public void itShouldNotHaveBusyDays() {
		BirdWatcher birdWatcher = new BirdWatcher (new int[] { 1, 2, 3, 3, 2, 1, 4});
		Assert.assertEquals(0, birdWatcher.getBusyDays());		
	}
	
	@Test
	public void itShouldReturnZeroIfBirdWatcherLastWeekIsEmpty() {
		int[] lastWeekEmpty = new int[0];
		BirdWatcher birdWatcher = new BirdWatcher(lastWeekEmpty);
		Assert.assertEquals(0, birdWatcher.getToday());
	}
	
	@Test
	public void itShouldNotHaveDaysWithoutBirds() {
		BirdWatcher birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
		Assert.assertFalse(birdWatcher.hasDayWithoutBirds());
	}
	
//	@Test
//	public void itTestGetLastWeek() {
//		Assert.assertEquals(DAY1, birdWatcher.getLastWeek());
//	}
	
	@Test
	public void itHasDayWithoutBirds() {
		Assert.assertTrue(birdWatcher.hasDayWithoutBirds());
	}

//	@Test
//	public void itTestGetCountForBusyDays() {
//		Assert.assertEquals(3, birdWatcher.getBusyDays());
//	}
	
	@Test
	public void itTestGetCountForFirstDays() {
		Assert.assertEquals(DAY1 + DAY2 + DAY3 + DAY4, birdWatcher.getCountForFirstDays(4));
	}
	
	@Test
	public void itTestGedToday() {
		Assert.assertEquals(TODAY, birdWatcher.getToday());
	}
	
//	@Test
//	public void itIncrementTodaysCount() {
//		birdWatcher.incrementTodaysCount();
//		Assert.assertEquals(TODAY+1, birdWatcher.getToday());
//	}
	
	@Test
	public void itTestGetCountForMoreDaysThanTheArraySize() {
		Assert.assertEquals(DAY1 + DAY2 + DAY3 + DAY4 + DAY5 + DAY6 + TODAY, birdWatcher.getCountForFirstDays(10));
	}
	
}

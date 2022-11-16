package task1_OOP2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


class LasagnaTest {

	
	@Test
	public void expected_minutes_in_oven() {
//	    assertThat(new Lasagna().expectedMinutesInOven()).isEqualTo(40);
		assertEquals(40, new Lasagna().expectedMinutesInOven());
	}
	
	@Test
	public void remaining_minutes_in_oven() {
		assertEquals(20, new Lasagna().remainingMinutesInOven(20));
	}
	
	@Test
	public void preparation_time_in_minutes_for_one_layer() {
		assertEquals(2, new Lasagna().preparationTimeInMinutes(1));
	}
	@Test
	public void total_time_in_minutes_for_one_layer() {
		assertEquals(32, new Lasagna().totalTimeInMinutes(1, 30));
	}
	@Test
	public void total_time_in_minutes_multiple_layers() {
		assertEquals(16, new Lasagna().totalTimeInMinutes(4, 8));
	}

	
//	@Test
//	public void total_time_in_minutes_for_multiple_layers() {
////	    assertThat(new Lasagna().totalTimeInMinutes(4, 8)).isEqualTo(16);
//	}
//
//	@Test
//	public void total_time_in_minutes_for_one_layer() {
//	    assertThat(new Lasagna().totalTimeInMinutes(1, 30)).isEqualTo(32);
//	}
//	
//	@Test
//	public void remaining_minutes_in_oven() {
//	    assertThat(new Lasagna().remainingMinutesInOven(25)).isEqualTo(15);
//	}
//	
//	@Test
//	public void preparation_time_in_minutes_for_one_layer() {
//	    assertThat(new Lasagna().preparationTimeInMinutes(1)).isEqualTo(2);
//	}
	
//	@Test
//	public void implemented_total_time_in_minutes() {
//	    assertThat(new Lasagna().hasMethod("totalTimeInMinutes", int.class, int.class)).withFailMessage("Method totalTimeInMinutes must be created").isTrue();
//	    assertThat(new Lasagna().isMethodPublic("totalTimeInMinutes", int.class, int.class)).withFailMessage("Method totalTimeInMinutes must be public").isTrue();
//	    assertThat(new Lasagna().isMethodReturnType(int.class, "totalTimeInMinutes", int.class, int.class)).withFailMessage("Method totalTimeInMinutes must return an int").isTrue();
//	}
//	
//	@Test
//	public void implemented_remaining_minutes_in_oven() {
//	    assertThat(new Lasagna().hasMethod("remainingMinutesInOven", int.class)).withFailMessage("Method remainingMinutesInOven must be created").isTrue();
//	    assertThat(new Lasagna().isMethodPublic("remainingMinutesInOven", int.class)).withFailMessage("Method remainingMinutesInOven must be public").isTrue();
//	    assertThat(new Lasagna().isMethodReturnType(int.class, "remainingMinutesInOven", int.class)).withFailMessage("Method remainingMinutesInOven must return an int").isTrue();
//	}
//	
//	@Test
//	public void preparation_time_in_minutes_for_multiple_layers() {
//	    assertThat(new Lasagna().preparationTimeInMinutes(4)).isEqualTo(8);
//	}
//	
//	@Test
//	public void implemented_expected_minutes_in_oven() {
//	    assertThat(new Lasagna().hasMethod("expectedMinutesInOven")).withFailMessage("Method expectedMinutesInOven must be created").isTrue();
//	    assertThat(new Lasagna().isMethodPublic("expectedMinutesInOven")).withFailMessage("Method expectedMinutesInOven must be public").isTrue();
//	    assertThat(new Lasagna().isMethodReturnType(int.class, "expectedMinutesInOven")).withFailMessage("Method expectedMinutesInOven must return an int").isTrue();
//	}
//	
//	@Test
//	public void implemented_preparation_time_in_minutes() {
//	    assertThat(new Lasagna().hasMethod("preparationTimeInMinutes", int.class)).withFailMessage("Method preparationTimeInMinutes must be created").isTrue();
//	    assertThat(new Lasagna().isMethodPublic("preparationTimeInMinutes", int.class)).withFailMessage("Method preparationTimeInMinutes must be public").isTrue();
//	    assertThat(new Lasagna().isMethodReturnType(int.class, "preparationTimeInMinutes", int.class)).withFailMessage("Method preparationTimeInMinutes must return an int").isTrue();
//	}
	
}

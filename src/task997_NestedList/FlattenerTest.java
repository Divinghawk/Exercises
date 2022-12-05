package task997_NestedList;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FlattenerTest {
	

	
	@Test
	public void testSixLevelsOfNestingWithNulls() {
		
		List<Object> myListToTest = Arrays.asList("0", 2, Arrays.asList(Arrays.asList("two", '3'), "8", 
				singletonList(singletonList("one hundred")), null, singletonList(singletonList(null))), 
				"negative two");
		
		List<Object> resultList =  Flattener.flatten(myListToTest);
		resultList.forEach(e -> Assert.assertTrue(!(e instanceof List)));
		Arrays.asList("0", 2, Arrays.asList(Arrays.asList("two", '3'), "8", 
				singletonList(singletonList("one hundred")), null, singletonList(singletonList(null))), 
				"negative two");
	}
//	    Assert.assertEquals(asList("0", 2, "two", '3', "8", "one hundred", "negative two"), 
//	    		Flattener.flatten(asList("0", 2, asList(asList("two", '3'), "8", 
//	    				singletonList(singletonList("one hundred")), null, singletonList(singletonList(null))), 
//	    				"negative two")));
//	}
//	
//	@Test
//	public void testASingleLevelOfNestingWithNoNulls() {
//	    Assert.assertEquals(asList(1, '2', 3, 4, 5, "six", "7", 8), Flattener.flatten(asList(1, asList('2', 3, 4, 5, "six", "7"), 8)));
//	}
//
//	@Test
//	public void a() {
//		Assert.assertEquals(assertLinesMatch(null, null));
//	}

//	private List<Object> asList(String string) {
//		// TODO Auto-generated method stub
//		return List.of(string);
//	}
	
	private List<Object> singletonList(Object objectO) {
		// TODO Auto-generated method stub
		return Collections.singletonList(objectO);
	}

	
//	@Test
//	public void testFlatListIsPreserved() {
//		List<Object> expectedResult = Arrays.asList(List<Object> inputList);
//	}
}

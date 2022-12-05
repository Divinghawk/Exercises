package task9991_SortedList_BinarySearchAlgo;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

	@Test
	public void identifiesThatAValueIsNotFoundInTheArray() throws ValueNotFoundException {
	    List<Integer> sortedList = List.of(1, 3, 4, 6, 8, 9, 11);
	    BinarySearch search = new BinarySearch(sortedList);
	    Assert.assertThrows(ValueNotFoundException.class, () -> {
		    search.indexOf(7);
	    });
	}
	
	@Test
	public void nothingIsFoundWhenTheLeftAndRightBoundCross() throws ValueNotFoundException {
	    List<Integer> sortedList = List.of(1, 2);
	    BinarySearch search = new BinarySearch(sortedList);
	    Assert.assertThrows(ValueNotFoundException.class, () -> {
		    search.indexOf(0);
	    });
	}
	
	@Test
	public void findsAValueInAnArrayWithOneElement() throws ValueNotFoundException {
	    List<Integer> listOfUnitLength = Collections.singletonList(6);
	    BinarySearch search = new BinarySearch(listOfUnitLength);
	    search.indexOf(6);
	    Assert.assertEquals( 1, search.indexNum());
	}

	@Test
	public void findsAValueInAnArrayWithTwoElements() throws ValueNotFoundException {
	    List<Integer> listOfUnitLength = List.of(6, 8);
	    BinarySearch search = new BinarySearch(listOfUnitLength);
	    Assert.assertEquals( 2, search.indexNum());
	}
	
	@Test
	public void findsAValueInAnArrayOfOddLength() throws ValueNotFoundException {
	    List<Integer> sortedListOfOddLength = List.of(1, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 634);
	    BinarySearch search = new BinarySearch(sortedListOfOddLength);
	    Assert.assertEquals( 9, (int) search.indexOf(144));
	}
	
	@Test
	public void findsAValueInAnArrayOfEvenLength() throws ValueNotFoundException {
	    List<Integer> sortedListOfEvenLength = List.of(1, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377);
	    BinarySearch search = new BinarySearch(sortedListOfEvenLength);
	    Assert.assertEquals( 5, (int) search.indexOf(21));
	}
	
	@Test
	public void findsAValueAtTheBeginningOfAnArray() throws ValueNotFoundException {
	    List<Integer> sortedList = List.of(1, 3, 4, 6, 8, 9, 11);
	    BinarySearch search = new BinarySearch(sortedList);
	    Assert.assertEquals( 0, (int) search.indexOf(1));
	}
	
}

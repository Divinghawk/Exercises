package task9991_SortedList_BinarySearchAlgo;

import java.util.List;

// https://www.hackerearth.com/practice/algorithms/searching/binary-search/tutorial/

// Binary search is the most popular Search algorithm.It is efficient and also one of the most commonly used techniques that is used to solve problems.

// 1. Step is a sorted List
// 2. Step Algorithm implementation

class BinarySearch {

    private final static String message = "Value not in array";
    private final List<Integer> sorted;
    
    BinarySearch(List<Integer> sortedList) {
        sorted = sortedList;
    }
    
    Integer indexOf(Integer value) throws ValueNotFoundException {
    	
        if (sorted.isEmpty()) {
            throw new ValueNotFoundException(message);   
        }
        
        Integer high = sorted.size();
        Integer low = 0;
        Integer mid = (high + low) / 2;
        Integer current = sorted.get(mid);
        
        while (!current.equals(value)) {
            if (mid.equals(low)) {
                throw new ValueNotFoundException(message);
            } else if (current < value) {
                low = mid;
            } else if (current > value) {
                high = mid;
            }
            mid = (high + low) / 2;
            current = sorted.get(mid);
        }
        
        return mid;
    }
    
    public int indexNum () {
    	return sorted.size();
    }
	
}

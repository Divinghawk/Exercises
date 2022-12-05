package task9997_StringAnagramChecker;

import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

class Anagram {
	
    private final String testString; // Input String
    private final String sorted; // Output String
    
    public Anagram(String testString){
        this.testString = testString;
        this.sorted = sortString(testString); // InputString processed with sortString-method
    }
    
    private static String sortString(String input){
        List<Character> chars = input.toLowerCase().chars() // toLowerCase converts all chars into lower case letters
            .mapToObj(e -> (char) e) 						// Gibt einen objektwertigen Stream zurück, der aus den 
            												// Ergebnissen der Anwendung der angegebenen Funktion auf die Elemente dieses Streams besteht.
            .collect(Collectors.toList()); 					// accumulate strings into a List
        Collections.sort(chars); 							// List sorted through input
        
        return chars.stream() 				// Returns a sequential Stream with this collection as its source
                .map(String::valueOf) 		// Returns a stream consisting of the results of applying the given
                							// function to the elements of this stream.
                .collect(Collectors.joining()); 	// Returns a {@code Collector} that concatenates the input elements into a
        											// {@code String}, in encounter order.
    }
    
    public List<String> match(List<String> options){
        List<String> cleaned = options.stream()
            .filter(str -> !str.toLowerCase().equals(testString.toLowerCase()))
            .collect(Collectors.toList());
        
        return cleaned.stream()
            .filter(a -> sortString(a).equals(sorted))
            .collect(Collectors.toList());
    }
    
}

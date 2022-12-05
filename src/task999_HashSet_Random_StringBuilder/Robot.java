package task999_HashSet_Random_StringBuilder;

// https://www.geeksforgeeks.org/hashset-in-java/

// The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance. 
// No guarantee is made as to the iteration order of the set which means that the class does not guarantee the constant order of elements over time. 
// This class permits the null element.

// A few important features of HashSet are: 
//
// Implements Set Interface.
// The underlying data structure for HashSet is Hashtable.
// As it implements the Set Interface, duplicate values are not allowed.
// Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
// NULL elements are allowed in HashSet.
// HashSet also implements Serializable and Cloneable interfaces.

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

	class Robot {
		
		private final static HashSet<String> registry = new HashSet<>();
		private final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		private final Random rand = new Random();
		private String name = "";
		
		Robot() {
			name = generate();
			registry.add(name);
		}
		
		public String getName() {
			return name;
		}
		
		public void reset() {
			registry.remove(name);
			name = generate();
			registry.add(name);
		}
		
		private String generate() {
			StringBuilder sb = new StringBuilder(); 
			// Verwendet den gespeichert String wieder / Recyclt sonst würde 
			// immer neues String objekt erzeugt werden von letters
			// letters wird sonst automatisch von Java Compiler erkannt und wiederverwertet
			// jedoch der Prozess des Vergleichens zieht Leistung die durch Stringbuilder vermieden wird
				IntStream.range(0, 2).forEach(x -> 
					sb.append(letters.charAt(rand.nextInt(0, 26))));
				IntStream.range(0, 3).forEach(x -> 
					sb.append(rand.nextInt(0, 10)));
        
				String newName = sb.toString();
					while (registry.contains(newName)) {
							newName = generate();
					}
					return newName;
		}
		
}

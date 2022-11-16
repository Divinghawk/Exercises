package task99_HashMap_Calculate_Return;

import java.util.HashMap;

public class Scrabble_SecondVariant {

    static HashMap<Character, Integer> alphabet;

    public static void main(String[] args) {

        //initialize the alphabet and store all the values
        alphabet = new HashMap<Character, Integer>();
        alphabet.put('A', 1);
        alphabet.put('B', 3);
        alphabet.put('C', 3);
        //...
        alphabet.put('Z', 10);
    }

    public static int computeScore(String word) {
        int sum = 0;
        for(int i = 0; i <word.length();i++) {
            //look up the current char in the alphabet and add it's value to sum
            sum += alphabet.get(word.charAt(i));
        }
        return sum;

    }
}

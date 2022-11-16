package task97_IllegalArgumentException;

public class Hamming {

    String left ;
    String right;
    
    Hamming(String leftStrand, String rightStrand) {
        if (!leftStrand.isEmpty() && rightStrand.isEmpty()) throw new IllegalArgumentException("right strand must not be empty.");
        if (!rightStrand.isEmpty() && leftStrand.isEmpty()) throw new IllegalArgumentException("left strand must not be empty.");
        if (leftStrand.length() != rightStrand.length()) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        left = leftStrand;
        right = rightStrand;
    }
    int getHammingDistance() {
    	
        int ham = 0;
        for (int i = 0; i < right.length(); i++){
            if (right.charAt(i) != left.charAt(i)){
                ham++;
            }
        }
        return ham;
    }
}

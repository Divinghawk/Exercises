package task995_CasaerCipher;

class RotationalCipher {
		
	private final int key;
	
    RotationalCipher(int shiftKey) {
// 		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	this.key = shiftKey;
    	
    }

    String rotate(String data) {
//      throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	
        String result = new String();
        
        for (char c : data.toCharArray()) {
            char rot = c;
            
            if (Character.isAlphabetic(c)) {
                char ref = Character.isUpperCase(c) ? 'A' : 'a';
                rot = (char) (ref + (c - ref + this.key) % 26);
            }
            result += rot;
        }
        return result;
    	
    }

}

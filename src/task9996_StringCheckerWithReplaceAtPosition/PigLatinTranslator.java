package task9996_StringCheckerWithReplaceAtPosition;

// translates from English to Pig Latin.
// http://en.wikipedia.org/wiki/Pig_latin 

// Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of the word. 
// Please note that "xr" and "yt" at the beginning of a word make vowel sounds (e.g. "xray" -> "xrayay", "yttria" -> "yttriaay").
//
// Rule 2: If a word begins with a consonant sound, move it to the end of the word and then add an "ay" sound to the end of the word. 
// Consonant sounds can be made up of multiple consonants, a.k.a. a consonant cluster (e.g. "chair" -> "airchay").
//
// Rule 3: If a word starts with a consonant sound followed by "qu", move it to the end of the word,
// and then add an "ay" sound to the end of the word (e.g. "square" -> "aresquay").
//
// Rule 4: If a word contains a "y" after a consonant cluster or as the second letter in a two letter word it makes a vowel sound
// (e.g. "rhythm" -> "ythmrhay", "my" -> "ymay").

class PigLatinTranslator {
	
    // vowel at start xr yt
    // vowels a e i o u
    // consonants p k x q y ch qu th thr sch
	
    private boolean vowelAtIndex(int i, String word) {
        switch(word.charAt(i)) {
            case 'a', 'e', 'i', 'o':
                return true;
            case 'u':
                // test consonant qu scenario
                if (i > 0 && word.charAt(i - 1) == 'q') {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }
    
    // translate from english to pig latin
    String translateWord(String word) {
        // word starts with vowel
        // undefined case, no vowel after consonant, so since everything is a consonant just add "ay"
        String result = word.concat("ay");; // concat -> Adds ay at the End of String
        if (!(vowelAtIndex(0, word) || (word.length() > 1 && (word.substring(0, 2).equals("xr") || word.substring(0, 2).equals("yt"))))) {
            // means start with consonant, find next vowel
            for (int i = 1; i < word.length(); i++) {
                if (vowelAtIndex(i, word) || word.charAt(i) == 'y') {
                    // y after consonant sounds like vowel
                    result = word.substring(i).concat(word.substring(0, i)).concat("ay");
                    break;
                }
            }
        }
        return result;
    }
    
    String translate(String english) {
    	
        String[] words = english.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = translateWord(words[i]);
        }
        return String.join(" ", words);
    }
}

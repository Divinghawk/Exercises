package task9995_IsogramCheck;

// Given a word or phrase, check if it is an isogram or not. An Isogram is a word in which no letter occurs more than once

class IsogramChecker {

    public boolean isIsogram(String input) {
        return 
            input.toLowerCase().chars()
                .filter(c -> Character.isLetter(c))
                .distinct()
                .count() ==
            input.toLowerCase().chars()
                .filter(c -> Character.isLetter(c))
                .count();
    }

}

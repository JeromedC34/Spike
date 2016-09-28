package com.jerome.spike;

import java.util.Random;

/**
 * Created by Human Booster on 28/09/2016.
 */
public class Scramble {
    // get a string with each word (separated only by space) scrambled
    public String scrambleTextWords(String aString) {
        StringBuilder result = new StringBuilder("");
        // current word to be scrambled when complete
        StringBuilder aWord = new StringBuilder("");
        for (int i = 0; i < aString.length(); i++) {
            // if there is a space it means a new word may have ended (or heading space case)
            if (aString.charAt(i) == ' ') {
                // if a word had started it is now ended
                if (!(aWord.toString().equals(""))) {
                    // append the scrambled word to the result
                    result.append(scrambleString(aWord.toString())).append(" ");
                    // the current word is emptied
                    aWord.delete(0, aWord.length() - 1);
                } else {
                    // the space is added to the result (no current word)
                    result.append(' ');
                }
            } else {
                // the current word is appended with the current character
                aWord.append(aString.charAt(i));
            }
        }
        // if there is still a current word (string not finishing by space)
        if (!(aWord.toString().equals(""))) {
            // append the scrambled word to the result
            result.append(scrambleString(aWord.toString()));
        }
        return result.toString();
    }

    // change the order of characters in a string
    private String scrambleString(String aString) {
        StringBuilder result = new StringBuilder("");
        // this will be modified by removing each character already used
        StringBuilder result_tmp = new StringBuilder(aString);
        Random rand = new Random();
        int randomInt;
        for (int i = 0; i < aString.length(); i++) {
            // get a new random character index in the remaining ones
            randomInt = rand.nextInt(result_tmp.length());
            // add the character at the random index to the result
            result.append(result_tmp.charAt(randomInt));
            // remove the used character
            result_tmp.deleteCharAt(randomInt);
        }
        return result.toString();
    }
}

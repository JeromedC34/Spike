package com.jerome.spike;

/**
 * Created by Human Booster on 28/09/2016.
 */

public class Palindrome {
    public boolean isPalindrome(String aString) {
        boolean result = true;
        String stringLower = aString.toLowerCase();
        int aLength = stringLower.length();
        // for each character starting left check if is equal to the one at the end (same index)
        // till middle of string
        for (int i = aLength; i > aLength / 2; i--) {
            result = result && (stringLower.charAt(i - 1) == stringLower.charAt(aLength - i));
        }
        return result;
    }
    public String reverse(String aString) {
        StringBuilder result = new StringBuilder("");
        for (int i = aString.length(); i > 0; i--) {
            result.append(aString.charAt(i - 1));
        }
        return result.toString();
    }
}

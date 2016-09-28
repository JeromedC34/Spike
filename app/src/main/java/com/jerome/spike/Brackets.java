package com.jerome.spike;

/**
 * Created by Human Booster on 28/09/2016.
 */

public class Brackets {
    // check if the opening and closing brackets are well ordered
    public boolean check(String bracketsString) {
        boolean result = true;
        int nbOpenedBrackets = 0;
        for (int i = 0; i < bracketsString.length(); i++) {
            // only 2 interesting cases here, opening and closing brackets
            if (bracketsString.charAt(i) == '(') {
                // add 1 level of opened brackets
                nbOpenedBrackets++;
            } else if (bracketsString.charAt(i) == ')') {
                // check if at least 1 bracket has been opened
                if (nbOpenedBrackets > 0) {
                    nbOpenedBrackets--;
                    // else there has been a problem, exit the loop
                } else {
                    result = false;
                    break;
                }
            }
        }
        // there are nbOpenedBrackets closing bracket missing
        if (nbOpenedBrackets > 0) {
            result = false;
        }
        return result;
    }
}

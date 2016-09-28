package com.jerome.spike;

/**
 * Created by Human Booster on 28/09/2016.
 */
public class Fibonacci {
    public String get(int nbMax) {
        return getFibonacciSeriesIte(nbMax);
    }

    public String getFibonacciSeriesIte(int nbMax) {
        StringBuilder result = new StringBuilder("");
        int twoBefore = 1;
        int oneBefore = 1;
        int currentValue;
        if (nbMax > 0) {
            for (int i = 1; i <= nbMax; i++) {
                if (i == 1 || i == 2) {
                    result.append("1 ");
                } else {
                    currentValue = twoBefore + oneBefore;
                    result.append(currentValue).append(" ");
                    twoBefore = oneBefore;
                    oneBefore = currentValue;
                }
            }
        } else {
            return "n/a";
        }
        return result.toString();
    }

    public String getFibonacciSeriesRec(int nbMax) {
        if (nbMax == 1) {
            return "1 ";
        } else if (nbMax == 2) {
            return getFibonacciSeriesRec(1) + "1 ";
        } else if (nbMax > 2) {
            return getFibonacciSeriesRec(nbMax - 1) + (getFibonacci(nbMax - 1) + getFibonacci(nbMax - 2)) + " ";
        } else {
            return "0";
        }
    }

    public int getFibonacci(int nbMax) {
        if (nbMax == 1 || nbMax == 2) {
            return 1;
        } else if (nbMax > 2) {
            return (getFibonacci(nbMax - 1) + getFibonacci(nbMax - 2));
        } else {
            return 0;
        }
    }
}

package com.jerome.spike;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void checkPalindromeOK() throws Exception {
        Palindrome myPalindrome = new Palindrome();
        assertEquals(true, myPalindrome.isPalindrome("laval"));
    }
    @Test
    public void checkPalindromeOKWithDifferentCase() throws Exception {
        Palindrome myPalindrome = new Palindrome();
        assertEquals(true, myPalindrome.isPalindrome("Laval"));
    }
    @Test
    public void checkPalindromeOKWithEmptyString() throws Exception {
        Palindrome myPalindrome = new Palindrome();
        assertEquals(true, myPalindrome.isPalindrome(""));
    }
    @Test
    public void checkPalindromeKO() throws Exception {
        Palindrome myPalindrome = new Palindrome();
        assertEquals(false, myPalindrome.isPalindrome("lavale"));
    }
    @Test
    public void checkReverse() throws Exception {
        Palindrome myPalindrome = new Palindrome();
        assertEquals("lavale", myPalindrome.reverse("elaval"));
    }
    @Test
    public void checkBracketsKOMissingClosingBracket() throws Exception {
        Brackets myBrackets = new Brackets();
        assertEquals(false, myBrackets.check("(()()((()))"));
    }
    @Test
    public void checkBracketsKOClosingBracketBeforeOpeningOne() throws Exception {
        Brackets myBrackets = new Brackets();
        assertEquals(false, myBrackets.check(")("));
    }
    @Test
    public void checkBracketsOKMultipleBrackets() throws Exception {
        Brackets myBrackets = new Brackets();
        assertEquals(true, myBrackets.check("((()())())"));
    }
    @Test
    public void checkBracketsOKMultipleBracketsWithText() throws Exception {
        Brackets myBrackets = new Brackets();
        assertEquals(true, myBrackets.check("((toto)())"));
    }
    @Test
    public void checkFibonacciIndex1() throws Exception {
        Fibonacci myFibonacci = new Fibonacci();
        assertEquals("1", myFibonacci.get(11));
    }
    @Test
    public void checkFibonacciIndex2() throws Exception {
        Fibonacci myFibonacci = new Fibonacci();
        assertEquals("1 1", myFibonacci.get(2));
    }
    @Test
    public void checkFibonacciIndex3() throws Exception {
        Fibonacci myFibonacci = new Fibonacci();
        assertEquals("1 1 2", myFibonacci.get(3));
    }
    @Test
    public void checkFibonacciIndex10() throws Exception {
        Fibonacci myFibonacci = new Fibonacci();
        assertEquals("1 1 2 3 5 8 13 21 34 55", myFibonacci.get(10));
    }
}
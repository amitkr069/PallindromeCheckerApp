package com.main;


public class RecursionPallindrome implements PalindromeStrategy {


    public boolean isPalindrome(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s, start + 1, end - 1);
    }

    @Override
    public boolean checkPalindrome(String s) {

        int n = s.length();

        return isPalindrome(s, 0, n - 1);
    }
}
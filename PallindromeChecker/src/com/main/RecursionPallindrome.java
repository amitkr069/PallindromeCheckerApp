package com.main;


public class RecursionPallindrome implements PalindromeStrategy {

    public String formatString(String s) {

        String s2 = s;
        s2 = s2.replace(" ", "");
        s2 = s2.toLowerCase();

        System.out.println("String after removing spaces and uppercase alphabets: " + s2);

        return s2;
    }

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

        String s2 = formatString(s);
        int n = s2.length();

        return isPalindrome(s2, 0, n - 1);
    }
}

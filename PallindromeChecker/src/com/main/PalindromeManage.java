package com.main;

public class PalindromeManage {

    private PalindromeStrategy strategy;

    public PalindromeManage(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String s) {
        return strategy.checkPalindrome(s);
    }
}

package com.main;

import java.util.Scanner;

public class UseCaseTwelvePalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String input = sc.nextLine();

        System.out.println("Input String: " + input);

        PalindromeStrategy strategy = new RecursionPallindrome();

        PalindromeManage context = new PalindromeManage(strategy);

        boolean result = context.executeStrategy(input);

        System.out.println("Is Palindrome: " + result);
    }
}

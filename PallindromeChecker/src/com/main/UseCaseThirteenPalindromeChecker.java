/**
 * @author Amit
 * @version 12.0
 * Use Case 12 - comparing different strategy to check palindrome and calculating execution time
 */

package com.main;

import java.util.Scanner;

public class UseCaseThirteenPalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String input = sc.nextLine();

        System.out.println("Input String: " + input);

        PalindromeStrategy recursive = new RecursionPallindrome();
        PalindromeStrategy stack = new StackPallindrome();

        PalindromeManage recursivePall = new PalindromeManage(recursive);
        
        PalindromeManage stackPall = new PalindromeManage(stack);
        
        long startTime1 = System.nanoTime();
        boolean result1 = recursivePall.executeStrategy(input);
        long endTime1 = System.nanoTime();
        
        long executionTime1 = endTime1 - startTime1;
        
        
        long startTime2 = System.nanoTime();
        boolean result2 = stackPall.executeStrategy(input);
        long endTime2 = System.nanoTime();
        
        long executionTime2 = endTime2 - startTime2;
        
        System.out.println("Algorithm: Recursive");
        System.out.println("Is Palindrome: " + result1);
        System.out.println("Execution Time: " + executionTime1);
        
        
        System.out.println("Algorithm: Stack");
        System.out.println("Is Palindrome: " + result2);
        System.out.println("Execution Time: " + executionTime2);
    }
}
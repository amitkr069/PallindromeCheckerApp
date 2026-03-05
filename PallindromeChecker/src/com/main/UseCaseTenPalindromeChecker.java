package com.main;

import java.util.Scanner;


public class UseCaseTenPalindromeChecker {
	public static String formatString(String s) {
		
		String s2 = s;
		s2 = s2.replace(" ", "");
		
		
		
		s2 = s2.toLowerCase();
		
		System.out.println("String after removig spaces and upperCase alphabets: " + s2);
		
		return s2;
		
	}
	
	public static boolean isPalindrome(String s, int start, int end) {
		if(start >= end) {
			return true;
		}
		
		if(s.charAt(start) != s.charAt(end)) {
			return false;
		}
		
		return isPalindrome(s, start + 1, end - 1);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		
		
		
		System.out.println("Input String: " + input);
		
		
		String newText = formatString(input);
		
		int n = newText.length();
		
		boolean pall = isPalindrome(newText, 0, n-1);
        
        
        System.out.println("Is Pallindrome: " + pall);
	
	}
}
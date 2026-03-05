
package com.main;

import java.util.Scanner;

class Pallindrome{
	private String s;
	
	public Pallindrome(String s) {
		this.s = s;
	}
	
	public String formatString(String s) {
			
			String s2 = s;
			s2 = s2.replace(" ", "");
			
			
			
			s2 = s2.toLowerCase();
			
			System.out.println("String after removig spaces and upperCase alphabets: " + s2);
			
			return s2;
			
		}

	public  boolean isPalindrome(String s, int start, int end) {
		
		if(start >= end) {
			return true;
		}
		
		if(s.charAt(start) != s.charAt(end)) {
			return false;
		}
		
		return isPalindrome(s, start + 1, end - 1);
		
	}
	
	public boolean checkPalindrome(String s) {
		String s2 = formatString(s);
		int n = s2.length();
		
		return isPalindrome(s2, 0, n-1);
	}
	
}

public class UseCaseElevenPalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		
		
		System.out.println("Input String: " + input);
		
		Pallindrome pallindrome = new Pallindrome(input);
	
		boolean pall = pallindrome.checkPalindrome(input);
        
        System.out.println("Is Pallindrome: " + pall);
	
	}
}
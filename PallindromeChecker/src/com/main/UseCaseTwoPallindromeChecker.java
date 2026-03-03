/**
 @author Amit
 @Version 2.0
 */
package com.main;

public class UseCaseTwoPallindromeChecker {
	public static void main(String[] args) {
		String text = "naman";
		System.out.println("Input Text: " + text);
		
		int n = text.length();
		
		int r = n-1;
		int l = 0;
		boolean pall = true;
		while(l <= r) {
			char ch1 = text.charAt(l);
			char ch2 = text.charAt(r);
			
			if(ch1 != ch2) {
				pall = false;
				break;
			}
			r--;
			l++;
		}
		
		System.out.print("Is it pallindrome: " + pall);
	}
}



/**
@author Amit
@Version 7.0
Use Case 7 - Palindrome checker - Using Dequeue operations
*/
package  com.main;
import java.util.Scanner;

import java.util.ArrayDeque;
import java.util.Deque;
public class UseCaseSevenPallindromeChecker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String input = sc.next();
		
		int n = input.length();
		
		System.out.println("Input String: " + input);
		
		char[] chars = input.toCharArray();
		
		
		boolean pall = true;
		
		Deque<Character> dq = new ArrayDeque<>();
		 
		
		int i = 0;
		while(i < n) {
			dq.addLast(chars[i]);
			i++;
		}
		
		
		while(dq.size() > 1) {
			char char1 = dq.removeFirst();
		
			char char2 = dq.removeLast();
			
			if(char1 != char2){
				pall = false;
				break;
			}
			
		}
		
		
		System.out.println("Is Pallindrome: " + pall);
		sc.close();
	
	}
}

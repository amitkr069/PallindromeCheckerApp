/**
 @author Amit
 @Version 5.0
 Use Case 5 - Palindrome checker - Using stack
 */
package  com.main;
import java.util.Scanner;
import java.util.Stack;

public class UseCaseFivePallindromeChecker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String input = sc.next();
		
		int n = input.length();
		
		System.out.println("Input String: " + input);
		
		char[] chars = input.toCharArray();
		
		
		boolean pall = true;
		Stack<Character> st = new Stack<>();
		
		int len = n/2;
		
		
		int i = 0;
		while(i < len) {
			st.push(chars[i]);
			i++;
		}
		
		if(n%2 == 1) len = len + 1;
		
		for(int r = len; r < n; r++) {
			char ch = st.pop();
			if(ch != chars[r]) {
				pall = false;
				break;
			}
		}
		
		
		System.out.println("Is Pallindrome: " + pall);
		sc.close();
	
	}
}

package com.main;
import java.util.Stack;
public class StackPallindrome implements PalindromeStrategy {
	
	public boolean checkPalindrome(String input) {
		int n = input.length();
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
		
		return pall;
	}
	
}

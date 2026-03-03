/**
 @author Amit
 @Version 4.0
 Use Case 4 - Pallindrome checker - making char array and converting it to string
 */
package  com.main;
import java.util.Scanner;

public class UseCaseFourPallindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String original = sc.next();
		
		int n = original.length();
		
		System.out.println("Input String: " + original);
		
		char[] chars = original.toCharArray();
		
		int r = n-1;
		int l = 0;
		
		boolean pall = true;
		while(l <= r) {
			if(chars[l] != chars[r]) {
				pall = false;
				break;
			}
			r--;
			l++;
		}
		
		
		System.out.println("Is Pallindrome: " + pall);
	
	}
}

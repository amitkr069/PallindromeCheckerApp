/**
 @author Amit
 @Version 1.0
 Use Case 3 - Pallindrome checker using reversing the string
 */
package  com.main;
import java.util.Scanner;

public class UseCaseThreePallindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String original = sc.next();
		
		int n = original.length();
		
		System.out.println("Original String: " + original);
		
		String reversed = "";
		
		for(int i = n-1; i>= 0; i--) {
			reversed += original.charAt(i);
		}
		
		System.out.println("Reversed String: " + reversed);
		boolean pall = true;
		if(!original.equals(reversed)) {
			pall = false;
		}
		
		System.out.println("Is Pallindrome: " + pall);
		
	
	}
}

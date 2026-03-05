
/**
@author Amit
@Version 8.0
Use Case 8 - Palindrome checker - Using Linked List and reversing the second half
Then comparing the second half with first half
*/
package  com.main;
import java.util.Scanner;

import java.util.ArrayDeque;
import java.util.Deque;
public class UseCaseEightPallindromeChecker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String input = sc.next();
		
		int n = input.length();
		
		System.out.println("Input String: " + input);
		
		char[] chars = input.toCharArray();
		LinkedList list = new LinkedList();

        // Adding elements to the linked list
		for(int i = 0; i<n; i++) {
			list.add(chars[i]);
		}
		
		boolean pall = true;
        // Checking if the linked list is a palindrome
        if (!list.isPalindrome()) {
            pall = false;
        }
        System.out.println("Is Pallindrome: " + pall);
	
	}
}

class Node {
    char data;
    Node next;

    // Constructor to initialize the node
    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to add a new node at the end of the list
    public void add(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            //Traverse to the end of the list and add the new node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 3: Find the middle of the linked list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reversing the second half of the linked list
        Node secondHalf = reverseList(slow);

        // Comparing the first half and the reversed second half
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        

        return true;
    }

    // method to reverse a linked list
    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

}


package controlFlow;

/**
 * The objective of this coding exercise is to write a small program 
 * that checks if a number is a palindrome.
 * 
 * In summary, the while loop breaks down the original number into its digits, 
 * constructs the reverse of the number, and then compares the reversed number 
 * with the original number to determine if it's a palindrome. 
 * This process checks if the number reads the same forwards and backwards.
 * */

public class NumberPalindrome {
	
	public static void main(String[] args) {
		// For testing the method
		isPalindrome(-1221); //→ should return true
		isPalindrome(707); //→ should return true
		isPalindrome(11212); //→ should return false because reverse is 21211 and that is not equal to 11212.
	}
	
	public static boolean isPalindrome (int number) {
		int originalNumber = number;
        int reverseNumber = 0; // To store reversed digits
        
        while (originalNumber != 0) {
        	reverseNumber = reverseNumber * 10 + originalNumber % 10;
        	originalNumber = originalNumber / 10;
        }
        System.out.println("Original number: " + number + " and reverse number: " + reverseNumber);
        return reverseNumber == number;
	}
}

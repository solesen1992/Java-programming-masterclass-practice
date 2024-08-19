package controlFlow;

/**
 * The objective of this coding exercise is to write a small program 
 * that checks if there's a digit that appears in both numbers.
 * */

public class SharedDigit {
	
	public static void main(String[] args) {
		hasSharedDigit(12, 23); // should return true since the digit 2 appears in both numbers
		hasSharedDigit(9, 99); //should return false since 9 is not within the range of 10-99
		hasSharedDigit(15, 55); //should return true since the digit 5 appears in both numbers
	}
	
	public static boolean hasSharedDigit (int first, int second) {
		// Checks if the first number is a two-digit number
		boolean firstValid = first > 9 && first < 100;
		// Checks if the second number is a two-digit number
		boolean secondValid = second > 9 && second < 100;
		
		// If either of the numbers is not a two-digit number, return false
		if (!firstValid || !secondValid) {
			System.out.println("The numbers are below 10 or bigger than 99 - Return false");
			return false;
		}
		else {
			// First number
			// Extracts the left digit of the first number
			int firstLeftDigit = first / 10; // E.g., if first = 23, firstLeftDigit = 2
			// Extracts the right digit of the first number
	        int firstRightDigit = first % 10;  // E.g., if first = 23, firstRightDigit = 3
	        
	        // Extracts the left digit of the second number
	        int secondLeftDigit = second / 10;  // E.g., if second = 45, secondLeftDigit = 4
	        
	        // Extracts the right digit of the second number
	        int secondRightDigit = second % 10;  // E.g., if second = 45, secondRightDigit = 5

	        // Checks if the left digit of the first number matches either digit of the second number
	        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;

	        // Checks if the right digit of the first number matches either digit of the second number
	        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;
	        
	        // Prints results
	        System.out.println("Does the left digit of the first number match either digit of the decond number? " + firstShared);
	        System.out.println("Does the right digit of the first number match either digit of the decond number? " + secondShared);
	        // Returns true if there is a shared digit, otherwise false
	        return firstShared || secondShared;
		}
	}

}

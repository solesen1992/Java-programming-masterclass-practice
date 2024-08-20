package controlFlow;

/**
 * The objective of this coding exercise is to write a small program 
 * that checks if at least two of the numbers have the same rightmost digit.
 * 
 * The method should return true if at least two of the numbers share 
 * the same rightmost digit; otherwise, it should return false.
 * */

public class LastDigitChecker {
	
	public static void main(String[] args) {
		hasSameLastDigit (41, 22, 71); // should return true since 1 is the rightmost digit in numbers 41 and 71
		hasSameLastDigit (23, 32, 42); // should return true since 2 is the rightmost digit in numbers 32 and 42
		hasSameLastDigit (9, 99, 999); // should return false since 9 is not within the range of 10-1000
		hasSameLastDigit(777, 771, 77); // true
						
		isValid(10); // should return true since 10 is within the range of 10-1000
		isValid(468); // should return true since 468 is within the range of 10-1000
		isValid(1051); // should return false since 1051 is not within the range of 10-1000
		isValid(1000); // true
	}
	
	public static boolean hasSameLastDigit (int first, int second, int third) {
		// Checks if the numbers are valid
		if (!isValid(first) || !isValid(second) || !isValid(third)) {
			System.out.println("The numbers are below 10 or bigger than 1000 - Return false");
			return false;
		}
		else {
			// First number
			// Extracts the right digit of the first number
	        int firstRightDigit = first % 10;  // E.g., if first = 23, firstRightDigit = 3

	        // Extracts the right digit of the second number
	        int secondRightDigit = second % 10;  // E.g., if second = 45, secondRightDigit = 5

	        // Extracts the right digit of the third number
	        int thirdRightDigit = third % 10;  // E.g., if second = 45, secondRightDigit = 5

	        // Checks if the left digit of the first number matches either digit of the second number
	        boolean sameLastDigit = firstRightDigit == secondRightDigit || firstRightDigit == thirdRightDigit 
	        		|| secondRightDigit == thirdRightDigit;

	        // Prints results
	        System.out.println("Does at least two of the numbers have the same last digit? " + sameLastDigit);
	        // Returns true if there is a shared digit, otherwise false
	        return sameLastDigit;
		}
	}
	
	public static boolean isValid (int number) {
		if (number >= 10 && number <= 1000) {
			System.out.println("The number is valid - True");
			return true;
		}
		else {
			System.out.println("The number is invalid - False");
			return false;
		}
	}
}

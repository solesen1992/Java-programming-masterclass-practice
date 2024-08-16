package controlFlow;

/**
 * The objective of this coding exercise is to write a small program 
 * that calculates the sum of the first and last digits of a given number.
 * */

public class FirstLastDigitSum {
	
	public static void main(String[] args) {
		// To test methods
		sumFirstAndLastDigit(252); //should return 4, the first digit is 2 and the last is 2 
		//which gives us 2+2 and the sum is 4.
		sumFirstAndLastDigit(257); //should return 9, the first digit is 2 and the last is 7 
		//which gives us 2+7 and the sum is 9.
		sumFirstAndLastDigit(0); //should return 0, the first digit and the last digit is 0 
		//since we only have 1 digit, which gives us 0+0 and the sum is 0.
		sumFirstAndLastDigit(5); //should return 10, the first digit and the last digit is 5 
		//since we only have 1 digit, which gives us 5+5 and the sum is 10.
		sumFirstAndLastDigit(-10); //should return -1, since the parameter is negative 
		//and needs to be positive.
	}
	
	public static int sumFirstAndLastDigit (int number) {
		if (number < 0) {
			System.out.println("The number is negative - return -1");
			return -1;
		} else {
			// find the last digit
			int lastDigit = number % 10;
			// used to find the first digit
			int firstDigit = number;
			
			//find first digit
			while (firstDigit >= 10) {
				firstDigit = firstDigit / 10;
			}
			
		// Print first and last digit
		System.out.println("First digit: " + firstDigit + " and last digit: " + lastDigit);
		
		// Calculate the sum and print the sum
		int sum = firstDigit + lastDigit;
		System.out.println("Sum: " + sum);
		return sum;
		}
	}
}

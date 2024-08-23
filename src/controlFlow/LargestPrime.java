package controlFlow;

/**
 * The objective of this coding exercise is to write a small program 
 * that can determine the largest prime factor of a given number.
 * 
 * A prime number (or a prime) is a natural number greater than 1 
 * that is not a product of two smaller natural numbers.
 * 
 * HINT: Since the numbers 0 and 1 are not considered prime numbers, 
 * they cannot contain prime numbers.
 * */

public class LargestPrime {
	
	// To test method
	public static void main(String[] args) {
		getLargestPrime (21); //should return 7 since 7 is the largest prime (3 * 7 = 21)
		getLargestPrime (217); //should return 31 since 31 is the largest prime (7 * 31 = 217)
		getLargestPrime (0); //should return -1 since 0 does not have any prime numbers
		getLargestPrime (45); //should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
		getLargestPrime (-1); //should return -1 since the parameter is negative
	}
	
	// The method should calculate the largest prime factor of a given number and return it.
	public static int getLargestPrime (int number) {
		int factor = -1;
		//Check for validity of the input number
		if (number < 2) {
			System.out.println("Return -1. Invalid Value");
			return -1;
		}
		else {
			// Iterate through factors from 2 up to the square root of the number
			for (int i = 2; i * i <= number; i++) {
				//Check if i is a factor of the number
				if (number % i != 0) {
					// Move to the next iteration if i is not a factor
					continue;
				}
				factor = i; // Update the factor to the current value of i
				
				//Factorization - remove all instances of i from the number
				while (number % i == 0) {
					number = number / i; // Divide the number by i
				}
			}
			// If number is still greater than 1, it's a prime number
			if (number > 1) {
				factor = number;
			}
			System.out.println(factor);
			return factor;
		}
	}
}

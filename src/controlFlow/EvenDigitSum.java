package controlFlow;

/**
 * The objective of this coding exercise is to write a small program 
 * that calculates the sum of the even digits of a given number.
 * */

public class EvenDigitSum {
	
	public static void main(String[] args) {
		// To test the method
		getEvenDigitSum(123456789); //should return 20 since 2 + 4 + 6 + 8 = 20
		getEvenDigitSum(252); //should return 4 since 2 + 2 = 4
		getEvenDigitSum(-22); //should return -1 since the number is negative
	}
	
	public static int getEvenDigitSum (int number) {
		if (number < 0) {
			System.out.println("Number is negative - return -1");
			return -1;
		} 
		else {
		    // return the sum of the even digits within the number
		    int sum = 0; // sum of even digits
		    
		    for (int i = number; i > 0; i /= 10) {
		        int lastDigit = i % 10; // extract last digit
		        if (lastDigit % 2 == 0) { // checks if it's even
		        sum = sum + lastDigit;
		        }
		    } 
		    System.out.println("Sum of even digits: " + sum);
		    return sum;
		}
	}
}

/**
 * ALTERNATIVE SOLUTION
 * 
 * // == alternative using while loop ==
        // while (number > 0) {
        //     int lastDigit = number % 10;
        //     if (lastDigit % 2 == 0) {
        //         sum += lastDigit;
        //     }
        //     number /= 10;
        // }
 * */

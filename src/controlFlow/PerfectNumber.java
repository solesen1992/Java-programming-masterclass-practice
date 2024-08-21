package controlFlow;

/**
 * The objective of this coding exercise is to write a small program 
 * that determines if a number is a perfect number.
 * 
 * A perfect number is a positive integer which is equal to the sum of its proper positive divisors. 
 * Proper positive divisors are positive integers that fully divide the perfect number 
 * without leaving a remainder and exclude the perfect number itself.
 * For example, take the number 6: 
 * Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, 
 * it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6. 
 * 
 * Therefore, 6 is a perfect number (as well as the first perfect number).
 * */

public class PerfectNumber {
	
	// For testing
	public static void main(String[] args) {
		isPerfectNumber(6); //should return true since its proper divisors 
		//are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
		isPerfectNumber(28); //should return true since its proper divisors 
		//are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
		isPerfectNumber(5); //should return false since its only proper divisor is 1 and the sum is 1 not 5
		isPerfectNumber(-1); //should return false since the number is < 1
		isPerfectNumber(10); // false
	}
	
	public static boolean isPerfectNumber (int number) {
		if (number < 1) {
			System.out.println("Number is below 1");
			return false;
		} 
		
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				sum += i;
				
				if (sum == number) {
					System.out.println(number + " is a perfect number");
					return true;
				}
			}
		}
		System.out.println("Return false");
		return false;
	}
}

/**
 * ALTERNATIVE SOLUTION
 * 
 * public class PerfectNumber {
    
    public static boolean isPerfectNumber(int number) {
        
        if (number < 1) {
            return false;
        }
 
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}

 * */

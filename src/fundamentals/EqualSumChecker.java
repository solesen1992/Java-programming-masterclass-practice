package fundamentals;

/**
 * The objective of this coding exercise is to write a small program 
 * that checks if the sum of two numbers are equal to a third number.
 * */

public class EqualSumChecker {
	
	public static void main(String[] args) {
		hasEqualSum(1, 1, 1); // false
		hasEqualSum(1, 1, 2); // true
		hasEqualSum(1, -1, 0); // true
	}
	
	public static boolean hasEqualSum (int numberOne, int numberTwo, int numberThree) {
		if (numberOne + numberTwo == numberThree) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}
}

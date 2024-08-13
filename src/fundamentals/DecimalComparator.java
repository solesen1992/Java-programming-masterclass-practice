package fundamentals;

/**
 * The objective of this coding exercise is to write a small program 
 * that determines if two numbers are equal, up to three decimal places.
 * */

public class DecimalComparator {
	
	public static void main(String[] args) {
		// Testing method
		areEqualByThreeDecimalPlaces(-3.1756, -3.175); // true
		areEqualByThreeDecimalPlaces(3.175, 3.176); // false
		areEqualByThreeDecimalPlaces(3.0, 3.0); // true
		areEqualByThreeDecimalPlaces(-3.123, 3.123); // false
	}
	
	public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo) {
		long firstRounded = (long) (numberOne * 1000);
        long secondRounded = (long) (numberTwo * 1000);
        
        if (firstRounded == secondRounded) {
        	System.out.println("true");
            return true;
        } else {
        	System.out.println("false");
            return false;
        }
    }

}

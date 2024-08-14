package fundamentals;

/**
 * The objective of this coding exercise is to write a small program 
 * that checks if a number is a "teen" number, meaning if it's between 13 and 19.
 * */

public class TeenNumberChecker {
	
	public static void main(String[] args) {
		// For testing of the methods
		hasTeen(9, 99, 19); // true
		hasTeen(23, 15, 42); // true
		hasTeen(22, 23, 34); // false
		isTeen(9); // false
		isTeen(13); // true
	}
	
	public static boolean hasTeen (int numberOne, int numberTwo, int numberThree) {
        if (isTeen(numberOne) || isTeen(numberTwo) || isTeen(numberThree)) {
        	System.out.println("true - hasTeen");
        	return true;
        } else {
        	System.out.println("false - hasTeen");
        	return false;
        }
    }
	
	/**
	 * Method used to check the numbers from the hasTeen method
	 * */
	public static boolean isTeen (int numberTeen) {
		if (numberTeen > 12 && numberTeen < 20) {
			//System.out.println("true - isTeen");
			return true;
		} else {
			//System.out.println("false - isTeen");
			return false;
		}
	}
}

/**
 * ALTERNATIVE METHOD
 * 
 * public class TeenNumberChecker {
 
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
 
    public static boolean isTeen(int number) {
        return number > 12 && number < 20;
    }
}

 * */

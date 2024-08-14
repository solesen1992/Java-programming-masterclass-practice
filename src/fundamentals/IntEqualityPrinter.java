package fundamentals;

/**
 * The objective of this coding exercise is to develop a program 
 * capable of ascertaining whether three given numbers are equal, 
 * different from each other, or exhibit a combination of both.
 * */

public class IntEqualityPrinter {

	public static void main(String[] args) {
		// For testing the method
		printEqual(1, 1, 1); //should print text All numbers are equal
		printEqual(1, 1, 2); //should print text Neither all are equal or different
		printEqual(-1, -1, -1); //should print text Invalid Value
		printEqual(1, 2, 3); //should print text All numbers are different
		printEqual(1,2,1); //Neither all are equal or different
	}
	
	public static void printEqual (int numberOne, int numberTwo, int numberThree) {
        if (numberOne < 0 || numberTwo < 0 || numberThree < 0) {
            System.out.println("Invalid Value");
        }
        else if (numberOne == numberTwo && numberTwo == numberThree && numberOne == numberThree) {
            System.out.println("All numbers are equal");
        }
        else if (numberOne != numberTwo && numberTwo != numberThree && numberOne != numberThree) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}

/**
 * ALTERNATIVE SOLUTION:
 * 
 * public class IntEqualityPrinter {
 
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
    private static final String NEITHER_ALL_EQUAL_MESSAGE = "Neither all are equal or different";
    private static final String ALL_DIFF_MESSAGE = "All numbers are different";
     
    public static void printEqual(int a, int b, int c) {
        
        if (a < 0 || b < 0 || c < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if (a == b && b == c) {
            System.out.println(ALL_EQUAL_MESSAGE);
        } else if ((a == b) || (a == c) || (b == c)) {
            System.out.println(NEITHER_ALL_EQUAL_MESSAGE);
        } else {
            System.out.println(ALL_DIFF_MESSAGE);
        }
    }
}
 * */

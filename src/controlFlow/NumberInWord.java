package controlFlow;

/**
 * The objective of this coding exercise is to write a small program 
 * that prints out the word of the number.
 * 
 * Write a method called printNumberInWord. The method has one 
 * parameter number which is the whole number. The method needs 
 * to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int 
 * parameter number is 0, 1, 2, .... 9 or other for any other 
 * number including negative numbers. You can use if-else statement 
 * or switch statement whatever is easier for you.
 * */

public class NumberInWord {
	public static void main(String[] args) {
		// To test the method
		printNumberInWord(3);  // Output: THREE
        printNumberInWord(9);  // Output: NINE
        printNumberInWord(-1); // Output: OTHER
	}
	
	public static void printNumberInWord (int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
            	System.out.println("TWO");
                break;
            case 3:
            	System.out.println("THREE");
                break;
            case 4:
            	System.out.println("FOUR");
                break;
            case 5:
            	System.out.println("FIVE");
                break;
            case 6:
            	System.out.println("SIX");
                break;
            case 7:
            	System.out.println("SEVEN");
                break;
            case 8:
            	System.out.println("EIGHT");
                break;
            case 9:
            	System.out.println("NINE");
                break;
            default:
            	System.out.println("OTHER");
                break;
        }
    }
}

/**
 * ALTERNATIVE SOLUTION:
 * 
 * public class NumberInWord {
 
    public static void printNumberInWord(int number) {
        
        String numberInWord;
        switch (number) {
            case 0 -> numberInWord = "ZERO";
            case 1 -> numberInWord = "ONE";
            case 2 -> numberInWord = "TWO";
            case 3 -> numberInWord = "THREE";
            case 4 -> numberInWord = "FOUR";
            case 5 -> numberInWord = "FIVE";
            case 6 -> numberInWord = "SIX";
            case 7 -> numberInWord = "SEVEN";
            case 8 -> numberInWord = "EIGHT";
            case 9 -> numberInWord = "NINE";
            default -> numberInWord = "OTHER";
        }
        System.out.println(numberInWord);
    }
}
 * */

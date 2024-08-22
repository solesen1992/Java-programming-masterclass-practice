package controlFlow;

/**
 * The objective of this coding exercise is to write a small program 
 * that prints out the number in words.
 * */

public class NumberToWords {
	
	// To test method
	public static void main(String[] args) {
		//getDigitCount method
		getDigitCount(0); //should return 1 since there is only 1 digit
		getDigitCount(123); //should return 3
		getDigitCount(-12); //should return -1 since the parameter is negative
		getDigitCount(5200); //should return 4 since there are 4 digits in the number

		//reverse method
		reverse(-121); //should  return -121
		reverse(1212); //should return  2121
		reverse(1234); //should return 4321
		reverse(100); //should return 1

		//numberToWords method
		numberToWords(123); //should print "One Two Three".
		numberToWords(1010); //should print "One Zero One Zero".
		numberToWords(1000); //should print "One Zero Zero Zero".
		numberToWords(-12); //should print "Invalid Value" since the parameter is negative.
	}
	
	

}

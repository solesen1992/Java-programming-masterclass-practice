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
	
	// Method to convert a number to its word representation
    public static void numberToWords(int number) {
        // Check if the number is negative
        if (number < 0) {
            System.out.println("Invalid Value"); // Print "Invalid Value" for negative numbers
            return; // Exit the method
        } 
        // Check if the number is zero
        else if (number == 0) {
            System.out.println("Zero"); // Print "Zero" if the number is 0
            return; // Exit the method
        } 
        else {
            // Reverse the number to handle digit extraction in the correct order
            int reverse = reverse(number);
            // Get the digit count of the original number
            int originalDigitCount = getDigitCount(number);
            // Get the digit count of the reversed number
            int reversedDigitCount = getDigitCount(reverse);
            // Calculate the number of leading zeroes
            int leadingZeroes = originalDigitCount - reversedDigitCount;

            // Process each digit in the reversed number
            while (reverse > 0) {
                // Extract the last digit
                int lastDigit = reverse % 10;
                // Convert the last digit to its word representation
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                // Remove the last digit from the reversed number
                reverse = reverse / 10;
            }

            // Print any leading zeroes in word form, if present
            for (int i = 0; i < leadingZeroes; i++) {
                System.out.println("Zero");
            }
            // Move to the next line after printing all words
            System.out.println();
        }
    }

    // Method to reverse the digits of a number
    public static int reverse(int number) {
        int reverse = 0; // Initialize the reverse number to 0
        // Loop to extract digits and build the reversed number
        while (number != 0) {
            int lastDigit = number % 10; // Extract the last digit
            reverse = reverse * 10 + lastDigit; // Append it to the reversed number
            number = number / 10; // Remove the last digit from the original number
        }
        return reverse; // Return the reversed number
    }

    // Method to count the number of digits in a number
    public static int getDigitCount(int number) {
        // Handle special case for negative numbers
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        } 
        // Handle special case where the number is 0
        else if (number == 0) {
            return 1; // Return 1 since 0 has one digit
        } 
        else {
            int count = 0; // Initialize digit count to 0
            // Loop to count the number of digits
            while (number > 0) {
                count++; // Increment the count for each digit
                number = number / 10; // Remove the last digit
            }
            return count; // Return the total digit count
        }
    }
}


/**
 * ALTERNATIVE SOLUTION
 * 
 * public class NumberToWords {
 
    public static int reverse(int number) {
        
        int reverse = 0;
        while (number != 0) {
            // multiply by 10 then and add last digit (number % 10)
            reverse = reverse * 10 + number % 10;
            number /= 10; // discard last digit
        }
        return reverse;
    }
 
    public static int getDigitCount(int number) {
        
        if (number < 0) {
            return -1;
        }
 
        if (number == 0) {
            return 1;
        }
 
        int count = 0;
        // start from 1 and multiply by 10 each step so i goes 1, 10, 100, 1000
        // count how many times it was multiplied, and that's the digit count
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }
 
    public static void numberToWords(int number) {
        
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
 
        // get reversed number
        int reverse = reverse(number);
 
        // subtract numberDigits and reverseDigits to get leading zeroes
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);
 
        if (number == 0) {
            System.out.println("Zero");
            return;
        }
 
        // use loop to print words
        while (reverse != 0) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverse /= 10;
        }
 
        // print zeroes if there are any leading zeroes in reversed number
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
    }
}
 * */

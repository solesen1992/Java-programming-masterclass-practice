package fundamentals;

/**
 * The objective of this coding exercise is to write a small program 
 * that determines if a particular year is a leap year.
 * 
 * 
 * */

public class LeapYear {
	
	public static void main(String[] args) {
		isLeapYear(-1600); // false - not in range
		isLeapYear(1600); // true - 1600 is a leap year
		isLeapYear(2017); // false - 2017 is not a leap year
		isLeapYear(2000); // true - 2000 is a leap year
	}
    
    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
        	System.out.println("false - not in range (1-9999)");
            return false;
        }
        if (year % 4 == 0) {
        	//System.out.println("true -  is divisible by 4");
            if (year % 100 == 0) {
            	//System.out.println("true - not divisible by 100");
                if (year % 400 == 0) {
                    System.out.println("true - is divisible by 400 - it's a leap year");
                    // Leap year
                    return true;
                } else {
                	// Not a leap year
                	return false;
                }
            } else {
            	// Leap year
            	return true;
            }
        } else {
        	System.out.println("false - not a leap year");
            return false;
        }
    }
}


/**
 * ALTERNATIVE SOLUTION
 * 
	public static boolean isLeapYear(int year) {
        
        // if year is less than 1 or greater than 9_999, it's invalid,
        // so return false
        if (year < 1 || year > 9_999) {
            return false;
        }
 
        if (year % 4 == 0) { // if year is divisible by 4, go to next step.
            if (year % 100 != 0) { // if year is not divisible by 100, it's a leap year, so return true.
                return true;
            } else { // if year was divisible by 100, let's check if it's divisible by 400.
                if (year % 400 == 0) { // if it's divisible by 400, it's leap year.
                    return true;
                } else { // otherwise, it's not a leap year, so return false.
                    return false;
                }
            }
        } else { // year is not divisible by 4, so it's not a leap year.
            return false;
        }
    }
}
*/








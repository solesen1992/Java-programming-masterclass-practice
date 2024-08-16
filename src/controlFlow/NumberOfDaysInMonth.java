package controlFlow;

/**
 * The objective of this coding exercise is to write a small program 
 * that determines the number of days in a particular month.
 * */

public class NumberOfDaysInMonth {
	
	public static void main(String[] args) {
		// To test the methods
		isLeapYear(-1600); //should return false since the parameter is not in the range (1-9999)
		isLeapYear(1600); //should return true since 1600 is a leap year
		isLeapYear(2017); //should return false since 2017 is not a leap year
		isLeapYear(2000); //should return true because 2000 is a leap year
		
		getDaysInMonth(1, 2020); //should return 31 since January has 31 days.
		getDaysInMonth(2, 2020); //should return 29 since February has 29 days in a leap year and 2020 is a leap year.
		getDaysInMonth(2, 2018); //should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
		getDaysInMonth(-1, 2020); //should return -1 since the parameter month is invalid.
		getDaysInMonth(1, -2020); //should return -1 since the parameter year is outside the range of 1 to 9999.
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
	
	public static int getDaysInMonth (int month, int year) {
		if (year < 1 || year > 9999) {
			return -1;
		} else {
			switch (month) {
            case 1:
                System.out.println("January - 31 days");
                return 31;
			case 2:
				// If it's a leap year
				if (isLeapYear(year)) {
					System.out.println("February - 29 days");
					return 29;
				}
				else {
					System.out.println("February - 28 days");
					return 28;
				}
            case 3:
            	System.out.println("March - 31 days");
                return 31;
            case 4:
            	System.out.println("April - 30 days");
                return 30;
            case 5:
            	System.out.println("May - 31 days");
                return 31;
            case 6:
            	System.out.println("June - 30 days");
                return 30;
            case 7:
            	System.out.println("July - 31 days");
            	return 31;
            case 8:
            	System.out.println("August - 31 days");
            	return 31;
            case 9:
            	System.out.println("September - 30 days");
            	return 30;
            case 10:
            	System.out.println("October - 31 days");
            	return 31;
            case 11:
            	System.out.println("November - 30 days");
            	return 30;
            case 12:
            	System.out.println("December - 31 days");
            	return 31;
            default:
            	System.out.println("Didn't find a match");
                return -1;
			}
		}
	}
}


/**
 * ALTERNATIVE SOLUTION:
 * 
 * public class NumberOfDaysInMonth {
 
    public static int getDaysInMonth(int month, int year) {
        
        if (year < 1 || year > 9_999) {
            return -1;
        }
 
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;  // for any of the following months, return 31
            case 2 -> isLeapYear(year) ? 29 : 28; // if it's February, determine if it's a leap year first, then return either 28 or 29.
            case 4, 6, 9, 11 -> 30; // return 30 for the following months
            default -> -1; // return -1 if the month parameter is not between 1 and 12.
        };
    }
 
    public static boolean isLeapYear(int year) {
        
        if (year < 1 || year > 9_999) {
            return false;
        }
 
        if (year % 4 == 0) { 
            if (year % 100 != 0) { 
                return true;
            } else { 
                if (year % 400 == 0) { 
                    return true;
                } else { 
                    return false;
                }
            }
        } else { 
            return false;
        }
    }
}
 * */

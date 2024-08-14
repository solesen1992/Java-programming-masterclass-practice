package fundamentals;

/**
 * The goal of this coding exercise is to create a program 
 * that can determine the equivalent years and days based on a given input in minutes.
 * */

public class MinutesToYearsDaysCalculator {
	private static final int MIN_PER_HOUR = 60;
	private static final int HOURS_PER_DAY = 24;
	private static final int DAYS_PER_YEAR = 365;
	private static final int MIN_PER_DAY = HOURS_PER_DAY * MIN_PER_HOUR;
	private static final int MIN_PER_YEAR = HOURS_PER_DAY * MIN_PER_HOUR * DAYS_PER_YEAR;
	
	
	public static void main(String[] args) {
		// To test the methods
		printYearsAndDays(525600); // should print "525600 minutes = 1 y and 0 d"
		printYearsAndDays(1051200); // should print "1051200 minutes = 2 y and 0 d"
		printYearsAndDays(561600); // should print "561600 minutes = 1 y and 25 d"
	}
	
	public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
        	long years = minutes / MIN_PER_YEAR;
        	long remainingDays = (minutes / MIN_PER_DAY) % DAYS_PER_YEAR;
        	
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}

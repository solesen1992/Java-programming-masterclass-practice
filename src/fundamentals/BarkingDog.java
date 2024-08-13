package fundamentals;

/**
 * The objective of this coding exercise is to write a small program that 
 * can determine if you should wake up based on a few factors.
 * 
 * We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
 * Write a method shouldWakeUp that has 2 parameters.
 * 1st parameter should be of type boolean and be named barking it represents if our 
 * dog is currently barking.
 * 2nd parameter represents the hour of the day and is of type int with the name 
 * hourOfDay and has a valid range of 0-23.
 * 
 * We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
 * 
 * In all other cases return false.
 * 
 * If the hourOfDay parameter is less than 0 or greater than 23 return false.
 * */

public class BarkingDog {
	
	public static void main(String[] args) {
		shouldWakeUp (true, 1); //should be true
		shouldWakeUp (false, 2); //should be false
		shouldWakeUp (true, 8); //should be false
		shouldWakeUp (true, -1); //should be false
		shouldWakeUp (true, 44); //should be false
	}
    
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (barking == true && (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay <= 23)) {
        	System.out.println("true"); // for testing
            return true;
        } else {
        	System.out.println("false"); // for testing
            return false;
        }
    }
}

/**
 * Alternative solution
 * 
 * public class BarkingDog {
 
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        
        // if the hourOfDay is less than 0 or greater than 23, it's not
        // valid, so return false
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        // if the dog is barking, and it's before 8am or after 10pm,
        // then you should wake up.
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
 * */
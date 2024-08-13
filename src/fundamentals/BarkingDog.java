package fundamentals;

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
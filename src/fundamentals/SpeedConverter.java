package fundamentals;

/**
 * The objective of this coding exercise is to write a small program that can convert km/h to mi/h.
 * */

public class SpeedConverter {
    // write code here
    
    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    
    public static void printConversion (double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        } else {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
    
}
package fundamentals;

/**
 * The objective of this coding exercise is to write a small program 
 * that can convert kilobytes to megabytes.
 * */

public class MegaBytesConverter {
    // write code here
	
	public static void main(String[] args) {
		// Test the method
		printMegaBytesAndKiloBytes(2500);
	}
    
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        } else {
            int megabytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB");   
        }
    }
}
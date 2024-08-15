package fundamentals;

/**
 * The objective of this coding exercise is to write a small program 
 * that can determine whether the cat is engaged in playtime, based on the temperature.
 * 
 * The cats spend most of the day playing. In particular, they play 
 * if the temperature is between 25 and 35 (inclusive). Unless it is summer, 
 * then the upper limit is 45 (inclusive) instead of 35.
 * */

public class PlayingCat {

	public static void main(String[] args) {
		// Testing the methods
		isCatPlaying(true, 10); //should return false since temperature is not in range 25 - 45 
		isCatPlaying(false, 36); //should return false since temperature is not in range 25 - 35 (summer parameter is false)
		isCatPlaying(false, 35); //should return true since temperature is in range 25 - 35 
	}
	
	public static boolean isCatPlaying (boolean summer, int temperature) {
		// Summer temperature
        if (summer == true && temperature <= 45 && temperature >= 25) {
            System.out.println("True. The cat is playing in the summer");
            return true;
        }
        // Temperature the cat is playing the rest of the year
        else if (summer == false && temperature <= 35 && temperature >= 25) {
        	System.out.println("True. The cat is playing");
        	return true;
        }
        else {
            System.out.println("False. The cat is not playing");
            return false;
        }
    }
}

/**
 * ALTERNATIVE SOLUTION:
 * 
 * public class PlayingCat {
 
    public static boolean isCatPlaying(boolean summer, int temperature) {
        
        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}
 * */

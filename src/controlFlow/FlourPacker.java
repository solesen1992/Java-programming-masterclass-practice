package controlFlow;

/**
 * The objective of this coding exercise is to write a small program, 
 * that given a number of small and large flour bags and a target weight, 
 * it can determine if a package can be assembled.
 * 
 * The parameter bigCount represents the count of big flour bags (5 kilos each).
 * The parameter smallCount represents the count of small flour bags (1 kilo each).
 * The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
 * */

public class FlourPacker {
	// To test method
	public static void main(String[] args) {
		canPack (1, 0, 4); //should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
		canPack (1, 0, 5); //should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
		canPack (0, 5, 4); //should return true since smallCount is 5 (small bags of 1 kilo) 
		//and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
		canPack (2, 2, 11); //should return true since bigCount is 2 (big bags 5 kilos each) 
		//and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos. 
		canPack (-3, 2, 12); //should return false since bigCount is negative.
	}
	
	// Method to determine if it's possible to pack the exact goal amount using big and small bags
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean result = false; // Initialize the result to false

        // Define the weight of one big bag as a constant
        final int BIG_WEIGHT = 5;
        // Calculate the total weight contributed by all big bags
        int totalBigWeight = BIG_WEIGHT * bigCount;

        // If any of the input parameters are negative, return false
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            System.out.println("False. All parameters are negative"); // Output the reason
            return false; // Negative inputs are invalid, so return false
        }

        // Check if the total weight of the big bags alone can meet or exceed the goal
        if (totalBigWeight >= goal) {
            // Calculate the remainder when the goal is divided by the weight of one big bag
            int remaining = goal % BIG_WEIGHT;
            // If the small bags can cover the remaining weight, return true
            if (smallCount >= remaining) {
                System.out.println("True. You have enough flour bags."); // Output success message
                return true; // Return true since the exact goal can be met
            }
        } 
        else {
            // If the total big bag weight is less than the goal, check if small bags can cover the rest
            if (smallCount >= goal - totalBigWeight) {
                System.out.println("True."); // Output success message
                return true; // Return true since the exact goal can be met
            }    
        }

        // If no conditions are met, return the initial false result
        return result;
    }
}

package fundamentals;

/**
 * The objective of this coding exercise is to write a small program 
 * that can calculate the area of a circle and a rectangle.
 * */

public class AreaCalculator {
    
	public static void main(String[] args) {
		// Testing the methods
		area(5.0); // should return 78.53981633974483 or 78.53981
		area(-1); // should return -1 since the parameter is negative
		area(5.0, 4.0); // should return 20.0 (5 * 4 = 20)
		area(-1.0, 4.0); //should return -1 since first the parameter is negative		
	}
    
    // Area of a circle
    public static double area (double radius) {
        if (radius >=0 ) {
            double areaOfCircle = radius * radius * Math.PI;
            System.out.println("Area of circle: " + areaOfCircle);
            return areaOfCircle;
        } else {
            return -1.0;
        }
    }
    
    // Area of a rectangle
    public static double area (double x, double y) {
        if (x >= 0 && y >= 0) {
            double areaOfRectangle = x * y;
            System.out.println("Area of rectangle: " + areaOfRectangle);
            return areaOfRectangle;
        } else {
            return -1.0;
        }
    }
}
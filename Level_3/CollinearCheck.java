// Importing necessary libraries
import java.util.Scanner;

public class CollinearCheck {

    // Method to check collinearity using the slope formula
    public static boolean arePointsCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
       
        // Check for vertical lines to avoid division by zero
        if ((x2 - x1 == 0) || (x3 - x2 == 0) || (x3 - x1 == 0)) {
            return (x2 - x1 == 0) && (x3 - x2 == 0); 
        }
        
        // Calculate slopes of lines AB, BC, and AC
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Return true if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using the area formula
    public static boolean arePointsCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
      
        // Calculate the area of the triangle formed by the three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Return true if the area is zero (points are collinear)
        return area == 0;
    }

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input coordinates for the first point
        System.out.println("Enter coordinates of the first point (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // Input coordinates for the second point
        System.out.println("Enter coordinates of the second point (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Input coordinates for the third point
        System.out.println("Enter coordinates of the third point (x3, y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Checking collinearity using the slope formula
        boolean collinearSlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear using slope formula? " + collinearSlope);

        // Checking collinearity using the area formula
        boolean collinearArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear using area formula? " + collinearArea);

        // Close the scanner object 
        input.close();
    }
}


/* Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
 */

// Importing necessary library for user input
import java.util.*;

public class TrigonometricFunctions {

    // Method to calculate the sine, cosine, and tangent of a given angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Converting angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculating sine, cosine, and tangent using Java Math library
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Creating an array to store the results of sine, cosine, and tangent
        double ans[] = new double[3];
        
        // Storing the results in the array
        ans[0] = sine;
        ans[1] = cosine;
        ans[2] = tangent;
        
        // Returning the array with trigonometric values
        return ans;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the angle in degrees
        System.out.println("Enter the angle in degrees:");
        double angle = sc.nextDouble();

        // Calling the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Displaying the results for sine, cosine, and tangent
        System.out.println("Sine of angle is " + results[0]);
        System.out.println("Cosine of angle is " + results[1]);
        System.out.println("Tangent of angle is " + results[2]);
        
        // Closing the scanner object
        sc.close();
    }
}

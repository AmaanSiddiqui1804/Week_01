/* Write a program Quadratic to find the roots of the equation ax2+ bx + c. 
Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
Write a Method to find find the roots of a quadratic equation and return the roots
*/
// Importing necessary libraries
import java.util.Scanner;
// Class declaration
public class Quadratic {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate delta

        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2}; // Return the roots as an array
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root}; // Return the single root in an array
        } else {
            // No real roots (delta is negative)
            return new double[]{}; // Return an empty array
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for coefficients a, b, and c
        System.out.println("Enter 3 values to find roots of quadratic equaation");
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // Find the roots using the method
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 2) {
            System.out.println("Two distinct roots are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("There is one root: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        input.close(); // Close the Scanner
    }
}

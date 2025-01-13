/* Write a program Euclidean distance between two points as well as the equation of 
the line using those two points. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take inputs for 2 points x1, y1, and x2, y2 
Method to find the Euclidean distance between two points and return the distance
distance = (x2-x1)2 +(y2-y1)2 
Write a Method to find the equation of a line given two points and return the equation 
which includes the slope and the y-intercept
The equation of a line is given by the equation y = m*x + b Where m is the slope and 
b is the y-intercept. So firstly compute the slope using the formulae 
m = (y2 - y1)/(x2 - x1)
Post that compute the y-intercept b using the formulae 
b = y1 - m*x1  
Finally, return an array having slope m and y-intercept b
*/

import java.util.Scanner;

public class EuclideanDistance {
    //Method to find the Euclidean distance between two points and return the distance
            //distance = (x2-x1)2 +(y2-y1)2
    public static double euclideanDistance(int x1, int y1, int x2, int y2){
        double distance = Math.pow(Math.sqrt(x2-x1) , 2) + Math.pow(Math.sqrt(y2-y1) , 2);
        return distance;
    }

    // Method to find the equation of a line
    public static double[] equationOfLine(int x1, int y1, int x2, int y2){
        // m = slope 
        // equation:  y = mx + b

        double m =(y2 - y1)/(x2 - x1);
        double b = (double) y1 - m*(double) x1 ;

        return new double[] {m, b};
    }
    // Main method to test the findLineEquation function
    public static void main(String[] args) {
        
        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Asking the user to enter coordinates of two points
        System.out.println("Enter coordinates of two points to find Euclidean distance and Equation of Line:");

        System.out.print("Coordinate of x1 and y1: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        
        System.out.print("Coordinate of x2 and y2: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        // Calling the method to find the equation of the line
        double[] equation = equationOfLine(x1, y1, x2, y2);

        // Printing the equation of the line 
        System.out.printf("Equation of line is: %.1fx + %.1f%n", equation[0], equation[1]);

        // Close the scanner to prevent resource leak
        input.close();
    }
}

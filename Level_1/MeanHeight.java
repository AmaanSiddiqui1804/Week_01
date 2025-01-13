/*
Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
*/



// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class MeanHeight {
    // Main method declaration
    public static void main(String[] args) {

        // Creating Scanner class object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declaring an array to store the heights of 11 players
        double[] heights = new double[11];

        // Initializing a variable to store the sum of all heights
        double sum = 0;

        // Asking the user to enter the heights of 11 players
        System.out.println("Enter the heights of 11 players (in cm):");

        // Loop to take input and calculate the sum of all heights
        for (int i = 0; i < heights.length; i++) {
            // Storing the input value in the array
            heights[i] = input.nextDouble();

            // Adding the current height to the sum
            sum += heights[i];
        }

        // Calculating the mean height
        double mean = sum / heights.length;

        // Displaying the mean height of the football team
        System.out.printf("The mean height of the football team players is: %.2f cm\n", mean);

        // Closing the scanner object
        input.close();
    }
}
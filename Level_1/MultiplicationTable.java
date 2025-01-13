/*
Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 10
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___ 
*/

// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class MultiplicationTable {
    // Main method declaration
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Asking user to enter the number for the multiplication table
        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();

        // Integer array declaration to store the multiplication results
        int[] multiplicationTable = new int[10];

        // Loop iteration
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Displaying results
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Closing the scanner object
        input.close();
    }
}

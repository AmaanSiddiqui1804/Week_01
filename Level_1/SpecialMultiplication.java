
/*
Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
*/

// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class SpecialMultiplication {
    // Main method declaration
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number between 6 and 9 for the multiplication table
        System.out.print("Enter a number between 6 and 9 to print its multiplication table: ");
        int number = input.nextInt();

        // Integer array declaration to store the multiplication results
        int[] multiplicationResult = new int[10];

        // Check if the entered number is between 6 and 9
        if (number >= 6 && number <= 9) {
            // Loop to find the multiplication table of the entered number
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = number * i;
            }

            // Displaying the multiplication table
            for (int i = 0; i < multiplicationResult.length; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
            }
        } else {
            System.out.println("Invalid input! Please enter a number between 6 and 9.");
        }

        // Closing the scanner object
        input.close();
    }
}

/*
// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class SpecialMultiplication {
    // Main method declaration
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number for the multiplication table
        System.out.print("Enter a number to print its multiplication table (starting from 6 to 9): ");
        int number = input.nextInt();

        // Integer array declaration to store the multiplication results
        int[] multiplicationResult = new int[4]; // For results from 6 to 9

        // Loop to calculate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Displaying the multiplication table from 6 to 9
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        // Closing the scanner object
        input.close();
    }
}
*/
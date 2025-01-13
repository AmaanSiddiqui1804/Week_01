/*
Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. 
Show all the numbers as well as the sum of all numbers 
Hint => 
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double 
initializes to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop 
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array 
element and increment the index value
Take another for loop to get the values of each element and add it to the total 
Finally display the total value
*/ 

// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class SumArray {
    // Main method declaration
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Double array declaration to store numbers with a maximum size of 10
        double[] numbers = new double[10];
        
        // Variable to store the total sum, initialized to 0.0
        double total = 0.0;
        
        // Index variable initialized to 0 for the array
        int index = 0;

        // Infinite loop to take user input
        while (true) {
            // Asking user to enter a number
            System.out.print("Enter a number (Enter 0 or a negative number to stop): ");
            double number = input.nextDouble();
            
            // Check if the user entered 0 or a negative number to stop
            if (number <= 0) {
                break;
            }

            // Check if the index has reached the array size limit of 10
            if (index == 10) {
                System.out.println("Maximum limit reached (10 numbers).");
                break;
            }

            // Assign the valid number to the array and increment the index
            numbers[index] = number;
            index++;
        }

        // Loop to sum up all the values entered
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Displaying all the numbers entered by the user
        System.out.println("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Displaying the total sum
        System.out.println("Total sum of entered numbers: " + total);

        // Closing the scanner object
        input.close();
    }
}
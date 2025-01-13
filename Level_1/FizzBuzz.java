/*
Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position
*/



// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class FizzBuzz {
    // Main method declaration
    public static void main(String[] args) {

        // Creating Scanner class object to read input from the user
        Scanner input = new Scanner(System.in);

        // Asking the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking if the entered number is positive
        if (number > 0) {
            // Creating a String array to store the results
            String[] fizzBuzzArray = new String[number];

            // Loop from 0 to the entered number
            for (int i = 0; i < number; i++) {
                int currentNumber = i + 1; // Adjusting to 1-based numbering

                // Checking if the current number is divisible by both 3 and 5
                if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                    fizzBuzzArray[i] = "FizzBuzz";
                }
                // Checking if the current number is divisible by 3
                else if (currentNumber % 3 == 0) {
                    fizzBuzzArray[i] = "Fizz";
                }
                // Checking if the current number is divisible by 5
                else if (currentNumber % 5 == 0) {
                    fizzBuzzArray[i] = "Buzz";
                }
                // Storing the current number if not divisible by 3 or 5
                else {
                    fizzBuzzArray[i] = String.valueOf(currentNumber);
                }
            }

            // Loop to display the results
            for (int i = 0; i < fizzBuzzArray.length; i++) {
                System.out.println("Position " + (i + 1) + " = " + fizzBuzzArray[i]);
            }
        } else {
            // Displaying a message if the user enters a non-positive number
            System.out.println("Please enter a positive integer.");
        }

        // Closing the scanner object
        input.close();
    }
}
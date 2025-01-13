
// Importing Scanner class for user input
import java.util.Scanner;

// Class declaration
public class DigitFrequency {
    // Main method
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Asking the user for a number
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Frequency array to store frequency of digits (0-9)
        int[] frequency = new int[10];

        // Extract digits and calculate frequency
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            frequency[digit]++;      // Increment the frequency of the digit
            number = number / 10;    // Remove the last digit
        }

        // Display frequency of each digit
        System.out.println("Frequency of each digit ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        // Closing Scanner object
        input.close();
    }
}
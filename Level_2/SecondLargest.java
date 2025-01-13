// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class SecondLargest {
    // Main method declaration
    public static void main(String[] args) {

        // Creating Scanner class object to read input from the user
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Declaring an array to store digits of the number
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extracting digits and storing them in the array
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;

            // Breaking the loop if the index reaches the maximum digit size
            if (index == maxDigit) {
                break;
            }
        }

        // Variables to store the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Finding the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Closing the scanner object
        input.close();
    }
}
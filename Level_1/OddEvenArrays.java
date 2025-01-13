
/*
Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
*/

// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class OddEvenArrays {
    // Main method declaration
    public static void main(String[] args) {

        // Creating Scanner class object to read input from the user
        Scanner input = new Scanner(System.in);

        // Asking the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Checking if the entered number is a natural number
        if (number <= 0) {
            // Displaying an error message for invalid input
            System.out.println("Error: Please enter a natural number greater than 0.");
            System.exit(0);
        }

        // Creating integer arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Initializing index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop to iterate from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Checking if the current number is even
            if (i % 2 == 0) {
                // Storing the even number in the even array
                evenNumbers[evenIndex++] = i;
            } else {
                // Storing the odd number in the odd array
                oddNumbers[oddIndex++] = i;
            }
        }

        // Displaying the odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Displaying the even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Closing the scanner object
        input.close();
    }
}
/*
Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
Hint => 
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
*/

// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class NumberReverse {
    // Main method declaration
    public static void main(String[] args) {

        // Creating Scanner class object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Declaring array to store digits and initializing index
        int[] digits = new int[10];
        int index = 0;

        // Extracting digits from the number and storing them in reverse order
        while (number != 0 && index < 10) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Printing the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }

        // Closing the scanner object
        sc.close();
    }
}
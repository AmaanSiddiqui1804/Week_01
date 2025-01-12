/* Create a program to check if a number taken from the user is a Harshad Number.
Hint => 
A Harshad number is an integer which is divisible by the sum of its digits. 
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to sum.
Check if the number is perfectly divisible by the sum.
If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
*/

// Importing Scanner class for taking input
import java.util.Scanner;

// Class declaration
public class HarshadNumber {
    // Main method declaration
    public static void main(String[] args) {
        // Creating Scanner instance for user input
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter an integer to check if it is a Harshad Number: ");
        int number = input.nextInt();

        // Initializing variables
        int sum = 0;
        int originalNumber = number; 

        // Loop to calculate the sum of digits
        while(number != 0){
            int digit = number % 10; 
            sum += digit;          // Adding digit to sum
            number = number / 10; // Removing the last digit
        }

        // Checking if the original number is divisible by the sum of its digits
        if(originalNumber % sum == 0){
            System.out.println("The given number " + originalNumber + " is a Harshad Number.");
        }else{
            System.out.println("The given number " + originalNumber + " is not a Harshad Number.");
        }

        // Closing Scanner instance
        input.close();
    }
}


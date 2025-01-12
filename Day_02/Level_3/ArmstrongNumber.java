/* Create a program to check if a number is Armstrong or not. Use the hints to show the steps clearly in the code
Hint => 
Armstrong Number is a number whose Sum of cubes of each digit results in the original number e.g. 153 = 1^3 + 5^3 + 3^3
Get an integer input and store it in the number variable define sum variable, initialize it to zero and originalNumber variable, and assign it to the input number variable
Use the while loop till the originalNumber is not equal to zero
In the while loop find the reminder number by using the modulus operator as in  number % 10. Find the cube of the number and add it to the sum variable
Again in while loop find the quotient of the number and assign it to the original number using number / 10 expression. This romoves the last digit of the original number.
Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly     
*/
// Importing Scanner class for taking input
import java.util.Scanner;

// Class declaration
public class ArmstrongNumber{ 
    // Main Method Declaration
    public static void main(String[] args){

        // Creating Scanner instance for user input
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter a number to check if it is an Armstrong Number: ");
        int number = input.nextInt();

        // Initializing variables
        int sum = 0;
        int originalNumber = number;

        // Loop to calculate the sum of cubes of digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10; 
            sum += remainder * remainder * remainder; // Cube of the digit
            originalNumber = originalNumber / 10; // Updating originalNumber
        }

        // Checking if the sum is equal to the original number
        if (number == sum) {
            System.out.println("The given number " + number + " is an Armstrong number.");
        } else {
            System.out.println("The given number " + number + " is not an Armstrong number.");
        }

        // Closing Scanner instance
        input.close();
    }
}


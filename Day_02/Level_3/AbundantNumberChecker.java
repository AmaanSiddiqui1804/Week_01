/* Create a program to check if a number is an Abundant Number.
Hint => 
An abundant number is an integer in which the sum of all the divisors of the number 
is greater than the number itself. For example,
Divisor of 12: 1, 2, 3, 4, 6
Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Run a for loop from i = 1 to i < number.
Inside the loop, check if number is divisible by i.
If true, add i to sum.
Outside the loop Check if sum is greater than number.
If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number. 
*/
// Importing Scanner class for taking input
import java.util.Scanner;

// Class declaration
public class AbundantNumberChecker{
    // Main method declaration
    public static void main(String[] args){
        // Creating Scanner instance for user input
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter an integer to check if it is an Abundant Number: ");
        int number = input.nextInt();

        // Initializing sum variable
        int sum = 0;

        // Loop to find divisors and calculate their sum
        for (int i = 1; i < number; i++) {
		
		// Checking if i is a divisor of number
            if (number % i == 0){ 
                sum += i; // Adding the divisor to sum
            }
        }

        // Checking if the sum of divisors is greater than the number and printing the result
        if (sum > number) {
            System.out.println("The given number " + number + " is an Abundant Number.");
        } else {
            System.out.println("The given number " + number + " is not an Abundant Number.");
        }

        // Closing Scanner instance
        input.close();
    }
}



/*Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result 
*/

// Importing Scanner class for taking input
import java.util.Scanner;

// Class declaration
public class NaturalNumberSumComparison{
    // Main method declaration
    public static void main(String[] args){
        // Creating Scanner instance for user input
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter a natural number: ");
        int number = input.nextInt();

        // Checking if the number is greater than zero
        if (number > 0) {
            // Computing the sum using the formula n * (n + 1) / 2
            int sumFormula = number*(number + 1)/2;

            // Computing the sum using a while loop
            int sum = 0;
            int i = 1; // Initializing counter
            while (i <= number) {
                sum+= i; // Adding each natural number
                i++; // Incrementing counter
            }

            // Printing results from both computations
            System.out.println("The sum of " + number + " natural numbers using formula is: " + sumFormula);
            System.out.println("The sum of " + number + " natural numbers using while loop is: " + sum);

            // Comparing the two results
            if(sumFormula == sum){
                System.out.println("Both computations are correct.");
            } 
			else{
                System.out.println("There is a difference between the two computations.");
            }
        } 
		else{
            System.out.println(number + " is not a natural number.");
        }
        input.close();
    }
}


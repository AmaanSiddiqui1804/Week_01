/*Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result 
*/

// Importing Scanner class for taking input
import java.util.Scanner;

// Class declaration
public class SumOfNaturalNumbers{
    // Main method declaration
    public static void main(String[] args){
        // Creating Scanner instance for user input
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter a natural number: ");
        int number = input.nextInt();

        // Checking if the number is greater than zero
        if (number > 0){
            // Computing the sum using the formula n * (n + 1) / 2
            int sumFormula = number*(number + 1)/2;

            // Computing the sum using a while loop
            int sum = 0;
            
            for(int i=0 ; i<= number ; i++){
                sum+= i; // Adding each natural number
            }

            // Printing results from both computations
            System.out.println("The sum of " + number + " natural numbers using formula is: " + sumFormula);
            System.out.println("The sum of " + number + " natural numbers using while loop is: " + sum);
		}
		else{
            System.out.println(number + " is not a natural number.");
        }
        input.close();
    }
}



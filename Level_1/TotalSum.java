/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the 
sum of n natural numbers using loop */ 

// Importing necessary library for user input
import java.util.*;

public class TotalSum {
    
    // Method to calculate the sum of first 'n' natural numbers
    public static int sum(int n) {
        int sum = 0;
        
        // Loop to calculate sum of first 'n' natural numbers
        // The expression n-->0 decreases 'n' after using it in the sum calculation
        while (n-- > 0) {
            sum += n;  // Adding 'n' to sum after each iteration
        }
        
        // Returning the calculated sum
        return sum;
    }

    public static void main(String args[]) {
        // Creating Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input a number
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // Calling the method 'sum' to calculate the result
        int res = sum(n);
        
        // Printing the result (sum of first 'n' natural numbers)
        System.out.println("The sum of first " + n + " natural numbers = " + res);

        // Closing the scanner object
        sc.close();
    }
}

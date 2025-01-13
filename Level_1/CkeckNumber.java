/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
 */

// Importing necessary libraries for user input
import java.util.*;

public class CkeckNumber {

    // Method to check if the number is negative, zero, or positive
    public static int check(int a) {
        // If the number is negative, return -1
        if (a < 0) return -1;
        
        // If the number is zero, return 0
        if (a == 0) return 0;
        
        // If the number is positive, return 1
        return 1;
    }

    public static void main(String args[]) {
        // Creating Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input a number
        System.out.println("Enter a number to check: ");
        
        // Reading the integer input from the user
        int n = sc.nextInt();
        
        // Calling the method 'check' to display the result
        System.out.println("Entered number is: " + check(n));

        // Closing the scanner object
        sc.close();
    }
}

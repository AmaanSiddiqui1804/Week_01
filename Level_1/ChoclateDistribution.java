/* Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor)
 */ 

// Importing necessary library for user input
import java.util.*;

public class ChoclateDistribution {
    
    // Method to find quotient and remainder of chocolates divided among children
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int arr[] = new int[2];  // Array to store quotient and remainder
        
        // Dividing the number of chocolates by the number of children to get the quotient
        arr[0] = number / divisor;
        
        // Finding the remainder (chocolates left after equal distribution)
        arr[1] = number % divisor;
        
        // Returning the array containing quotient and remainder
        return arr;
    }

    public static void main(String args[]) {
        // Creating Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the number of chocolates
        System.out.println("Enter number of chocolates: ");
        int numberOfchocolates = sc.nextInt();

        // Asking the user to input the number of children
        System.out.println("Enter number of children: ");
        int numberOfChildren = sc.nextInt();
        
        // Calling the method to find the quotient and remainder
        int arr[] = findRemainderAndQuotient(numberOfchocolates, numberOfChildren);
        
        // Displaying the results (quotient and remainder)
        System.out.println("Equally distributed chocolates are: " + arr[0]);
        System.out.println("Remaining chocolates are: " + arr[1]);
        
        // Closing the scanner object
        sc.close();
    }
}



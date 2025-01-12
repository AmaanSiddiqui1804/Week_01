/* Create a program to count the number of digits in an integer.
Hint => 
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits  
*/

// Importing Scanner class for taking input
import java.util.Scanner;

// Class declaration
public class DigitCounter {
    // Main method declaration
    public static void main(String[] args) {
        // Creating Scanner class instance for user input
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter an integer to count the number of digits: ");
        int number = input.nextInt();

        // Initializing count variable
        int count = 0;

        // Checking if number is zero
        if(number >= 0 && number <= 9){
            count = 1;
        } 
        else{
            // Loop to count digits
            while (number != 0) {
                number = number / 10; // Removing the last digit
                count++; // Incrementing count
            }
        }

        // Displaying the number of digits
        System.out.println("The number of digits is: " + count);

        // Closing Scanner instance
        input.close();
    }
}




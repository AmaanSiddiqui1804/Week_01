/*Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break; 
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class SumOfNumbers2{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		double total = 0.0 ;
		double number ;
		
		// Loop until the user enters 0 or negative number
		System.out.println("Enter numbers to sum (Enter 0 to stop):");

        while (true){
            // Read the user input
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            // Check if the user entered 0
            if (number <=0){
                break; // Exit the loop
            }

            // Add the user input to the total
            total += number;
        }

        // Displaying the total sum
        System.out.println("The total sum is: " + total);
		
	//Closing scanner class
		input.close();
    }
}


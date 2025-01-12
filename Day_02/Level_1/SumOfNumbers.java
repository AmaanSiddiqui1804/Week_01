/*Write a program to find the sum of numbers until the user enters 0
Hint => 
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value  
*/
//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class SumOfNumbers{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		double total = 0.0 ;
		double number ;
		
		// Loop until the user enters 0
		System.out.println("Enter numbers to sum (Enter 0 to stop):");

        while (true){
            // Read the user input
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            // Check if the user entered 0
            if (number == 0){
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



/* Write a program to check whether a number is positive, negative, or zero.
Hint => 
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero
*/


//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class IntegerCheck{
	//Main method declaration
	public static void main (String [] args){
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		//Asking user for input 
		System.out.println("Enter a number to check if its positive, negative, or zero: "); 
		int number = input.nextInt();
		
		//Checking if the number is positive
		if (number > 0){
			System.out.println("The number is Positive.");
		}
		else if (number < 0){
            System.out.println("The number is Negative");
        } 
		else{
               System.out.println("The number is Zero");
		}
		//Closing scanner class
		input.close();
	}
}


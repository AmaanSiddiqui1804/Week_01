/*Create a program to swap two numbers 
Hint => 
Create a variable number1 and take user input.
Create a variable number2 and take user input.
Swap number1 and number2  and print the swapped output
I/P => number1, number2
O/P => The swapped numbers are  ___ and ___ 
*/

import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Asking user for two numbers as input for swapping
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
		
		System.out.print("Enter second number :");
        int number2 = input.nextInt();
		
		/*Swapping of two numbers by creating a third temporary variable 
		int temp = number1 ;
		number1 = number2 ;
		number2 = temp ; */
		
		//Printing results after swapping
		System.out.println("The swapped numbers are " + number2  + " and " + number1);
	}
}
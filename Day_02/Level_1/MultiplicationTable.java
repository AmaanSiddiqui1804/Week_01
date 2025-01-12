/* Create a program to find the multiplication table of a number 
entered by the user from 6 to 9.
Hint => 
Take integer input and store it in the variable number
Using a for loop, find the multiplication table of number 
from 6 to 9 and print it in the format number * i = ___
*/
//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class MultiplicationTable{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.println("Enter a number to find its multiplication: "); 
		int number = input.nextInt();
		            
		for(int i = 6; i <= 9; i++){
			System.out.println(number + " * " + i + " = " + (number * i));
            }
		//Closing scanner class
		input.close();
    }
}	


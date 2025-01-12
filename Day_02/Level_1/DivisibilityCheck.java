/* Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___ 
*/

import java.util.Scanner;
//class declaration
public class DivisibilityCheck{
	//Main method declaration
	public static void main (String [] args){
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		//Asking user for input 
		System.out.println("Enter a number to check its Divisibility :"); 
		int number = input.nextInt();
		
		boolean check = false ;
		
		if(number >=5 && number%5 ==0){
		    check = true ;
		}
		if(check){
			System.out.println("Is the number " + number + " divisible by 5?  YES") ;
		}
		else{ 
			System.out.println("Is the number " + number + " divisible by 5?  NO") ;
		}
		input.close();	
	}
}
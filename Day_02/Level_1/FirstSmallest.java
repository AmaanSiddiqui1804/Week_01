/* Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____ 
*/


import java.util.Scanner;
//class declaration
public class FirstSmallest{
	//Main method declaration
	public static void main (String [] args){
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		//Asking user for input 
		System.out.println("Enter first number: "); 
		int number1 = input.nextInt();
		
		System.out.println("Enter second number: "); 
		int number2 = input.nextInt();
		
		System.out.println("Enter third number: "); 
		int number3 = input.nextInt();
		
		if(number1 > number2 && number1>number3){
               System.out.println("Is the first number the smallest? Yes");
		} 
		else{
               System.out.println("Is the first number the smallest? No");
		}
		input.close();
    }
}

/* Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___ 
*/

import java.util.Scanner;
//class declaration
public class SmallestOfThree{
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
		
		//Checking which number is smallest
		if (number1>number2 && number1>number3) {
               System.out.println("Is the first number the largest? Yes");
           } else {
               System.out.println("Is the first number the largest? No");
           }

        if (number2 > number1 && number2 > number3) {
               System.out.println("Is the second number the largest? Yes");
           } else {
               System.out.println("Is the second number the largest? No");
           }
		   
		if (number3 > number1 && number2 < number3) {
               System.out.println("Is the third number the largest? Yes");
           } else {
               System.out.println("Is the third number the largest? No");
           }
		input.close();
	}
}

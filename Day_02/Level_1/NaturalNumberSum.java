/* Write a program to check for the natural number and write the sum of n natural numbers 
Hint => 
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2 
I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise 
The number ___ is not a natural number 
*/

import java.util.Scanner;
//class declaration
public class NaturalNumberSum{
	//Main method declaration
	public static void main (String [] args){
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		//Asking user for input 
		System.out.println("Enter a natural number: "); 
		int number = input.nextInt();
		
		//Checking if the number is greater than zero
		if (number > 0){
			
			//CAlculating the sum of natural numbers
            int sum = number * (number + 1) / 2;
               System.out.println("The sum of " + number + " natural numbers is " + sum);
        } 
		else{
            System.out.println(number + " is not a natural number");
        }
		input.close();
   }
}

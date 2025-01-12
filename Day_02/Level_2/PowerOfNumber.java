/* Create a program to find the power of a number.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power.
In each iteration of the loop, multiply the result with the number and assign the value to the result.
Finally, print the result  
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class PowerOfNumber{
	//Main Method Declaration
	public static void main(String[] args){
	
        // Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.println("Enter number: "); 
		int number = input.nextInt();
		
		System.out.println("Enter power: "); 
		int power = input.nextInt();
		
		int result = 1 ; 
		for(int i=1 ; i<=power ; i++){
			result = result*number ;
		}
		//Printing result
		System.out.println("Number raised to the power: " + result); 
		//Closing scanner class
		input.close();
   
	}
}


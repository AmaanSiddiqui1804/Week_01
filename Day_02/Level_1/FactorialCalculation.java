/* Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.     
*/
//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class FactorialCalculation{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.println("Enter a number for calculatiing its factorial: "); 
		int number = input.nextInt(); 
		
		//Logic to calculate factorial
		if(number > 0){
                int factorial = 1 ;
				int i=1 ;
                while(i<=number){
                    factorial *= i;
					i++;
                }
                System.out.println("The factorial of " + number + " is " + factorial);
		} 
		else{
			System.out.println(number + " is not a positive integer.");
        }
		//Closing scanner class
		input.close();
    }
}



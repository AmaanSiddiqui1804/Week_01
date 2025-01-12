/* Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result.      
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class FactorialCalculation2{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.print("Enter a number for calculatiing its factorial: "); 
		int number = input.nextInt(); 
		
		//Logic to calculate factorial
		if(number > 0){
                int factorial = 1;
                for (int i=1 ; i<=number; i++){
                    factorial *= i;
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



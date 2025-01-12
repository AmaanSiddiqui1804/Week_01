/* Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number.
Run a for loop from i = 1 to i < number.
In each iteration of the loop, check if number is perfectly divisible by i.
If true, print the value of i. 
*/ 

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class FactorOfNumber{
	//Main Method Declaration
	public static void main(String[] args){
	
        // Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.println("Enter number to find its factor: "); 
		int number = input.nextInt();
		
		
		for(int i=1 ; i<number ; i++){
			if(number%i==0){
				System.out.println("Factor(s) are: " + i); 
		    }
		}
		
		//Closing scanner class
		input.close();
   
	}
}


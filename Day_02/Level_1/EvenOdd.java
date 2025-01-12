/* Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number  
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class EvenOdd{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.println("Enter a number to find odd and even numbers upto the number: "); 
		int number = input.nextInt();
		
		for(int i = 1; i <= number; i++){
			if(i % 2 == 0){
				System.out.println(i + " is even");
			} 
			else{
				System.out.println(i + " is odd");
			}
		}
        //Closing scanner class
		input.close();
    }
}



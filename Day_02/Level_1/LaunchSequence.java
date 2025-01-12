/* Write a program to count down the number from the user input value to 1 using a 
while loop for a rocket launch
Hint => 
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter.
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class LaunchSequence{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.println("Enter a number for countdown: "); 
		int counter = input.nextInt();
		
		// Counter 
		while(counter>=1){
		System.out.print(counter);
		counter--;
		}
		input.close();
	}
}
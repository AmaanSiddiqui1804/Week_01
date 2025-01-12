/* Create a program to find all the multiple of a number taken as user input below 100.
Hint => 
Get input value for a variable named number.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number.
If true, print the number and continue the loop.
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class MultiplesOfNumber{
	//Main Method Declaration
	public static void main(String[] args){
	
        // Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.println("Enter number below 100 to find its multiple: "); 
		int number = input.nextInt();
		
		
		for(int i=100 ; i>=1 ; --i){
			if(i%number==0){
				System.out.println("Multiple are: " + i); 
		    }
		}
		
		//Closing scanner class
		input.close();
   
	}
}



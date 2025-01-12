//Rewrite program 8 to do the countdown using the for-loop  


//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class LaunchSequenceForLoop{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.println("Enter a number for countdown: "); 
		int counter = input.nextInt();
		
		// Counter 
		for(int i=counter ; i>=1 ; --i){
		System.out.println(i);
		}
		
	//Closing scanner class
		input.close();
	}
}



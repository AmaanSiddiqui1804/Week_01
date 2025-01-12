/* Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
Spring Season is from March 20 to June 20 
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class SpringSeasonCheck{
	//Main method declaration
	public static void main (String [] args){
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		
		System.out.print("Enter month : ");
		int month = input.nextInt();
		
		System.out.print("Enter day (1-31): ");
        int day = input.nextInt();
		
		//Checking for Spring Season
		if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
			System.out.println("It's a Spring Season");
		} 
		else{
			System.out.println("Not a Spring Season");
		}
		//Closing scanner class
		input.close();
	}
}

/* Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. 
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical  
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class LeapYear{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year to check if it is a leap Year");
		int year=input.nextInt();
	
		// Condition to check leap year
		if(year%100 == 0){
			if(year%400 == 0){
				System.out.println("It is a leap Year");
			}
			else{
				System.out.println("It is not a leap Year");
			}
		}
	    // Condition to check non century year
		else{
			if(year%4==0){
				System.out.println("It is a leap Year");
			}
			else{
				System.out.println("It is not a leap Year");
			}
		}
		input.close();
    }
}

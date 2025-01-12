//Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators 

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class LeapYear2{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year to check if it is a leap Year");
		int year=input.nextInt();
	
		// Condition to check leap year
	
		// Condition to check if its century year as well as non century year
		if((year%100 ==0  && year%400 ==0) || (year%100 !=0  && year%4==0)){
			System.out.println("It is a leap Year");
		}
	  
		else{
			System.out.println("It is not a leap Year");
		}
	    //Closing scanner class
		input.close();
    }
}





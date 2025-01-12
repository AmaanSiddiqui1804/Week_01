/* Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint => 
Write the program and use for loop   
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class FizzBuzz{
	//Main Method Declaration
	public static void main(String[] args){
	
        // Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.println("Enter a number: "); 
		int number = input.nextInt();
	    
		//Logic 
		for(int i=0;i<=number;i++){
			if(i%3 ==0 && i%5!=0)
				System.out.println(i + " Fizz");
			else if(i%3 !=0 && i%5==0) 
				System.out.println(i + " Buzz");
			else if(i%3 ==0 && i%5==0) 
				System.out.println(i + " FizzBuzz"); 
		}
		input.close();
	}
}



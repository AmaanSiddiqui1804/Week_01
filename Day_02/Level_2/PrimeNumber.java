/* Write a Program to check if the given number is a prime number or not
Hint => 
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
Use isPrime boolean variable to store the result   
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class PrimeNumber{
	public static void main(String[] args){
        
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
	    
		System.out.println("Enter a number to check if its prime or not : ");
		int number = input.nextInt();
		// Number is divisible by only 1 and itself then it is prime otherwise not prime
		boolean isprime=true;
	    for(int i=2;i<number;i++){
			if(number%i == 0){
				isprime=false;
				break;
			}
		}
		if(isprime)
		  System.out.println("Entered number is prime ");
		else
		  System.out.println("Entered number is not  prime ");
		
		  input.close();
	}
}



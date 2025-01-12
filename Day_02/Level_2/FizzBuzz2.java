//Rewrite the program 5 FizzBuzz using while loop  

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class FizzBuzz2{
	//Main Method Declaration
	public static void main(String[] args){
	
        // Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.println("Enter a number: "); 
		int number = input.nextInt();
	    
		//Logic using while loop 
		int i=0;
		while(i<=number){
			if(i%3 ==0 && i%5!=0)
				System.out.println(i + " Fizz");
			else if(i%3 !=0 && i%5==0) 
				System.out.println(i + " Buzz");
			else if(i%3 ==0 && i%5==0) 
				System.out.println(i + " FizzBuzz"); 
			i++;
		}
		input.close();
	}
}



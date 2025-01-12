/* write the DoubleOpt program by taking double values and doing the same operations. */


import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){
		//Declaring variables 
		double a, b, c;
		
		//Declaring scanner class for taking input 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		
		//Taking a from the user
		a = input.nextDouble();
		
		System.out.print("Enter the value of b : ");
		
		//Taking b from the user
		b = input.nextDouble();
		
		System.out.print("Enter the value of c : ");
		
		//Taking c from the user
		c = input.nextDouble();
	
		double operation1 = a + b * c ;
		double operation2 = a * b + c ; 
		double operation3 = c + a / b ;
		double operation4 = a % b + c ; 
		
		//Display the information
		System.out.println("The results of Int Operations are " + operation1 + ", " +  operation2 + ", " + operation3 + " and " + operation4);
		
		//close the scanner input
		input.close();
		
	}
	
}
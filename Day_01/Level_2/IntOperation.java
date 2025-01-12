/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —- */ 

import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		//Declaring variables which contains a,b,c
		int a, b, c;
		
		//Declaring scanner class for taking input 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		
		//Taking a from the user
		a = input.nextInt();
		
		System.out.print("Enter the value of b : ");
		
		//Taking b from the user
		b = input.nextInt();
		
		System.out.print("Enter the value of c : ");
		
		//Taking c from the user
		c = input.nextInt();
		
		//Performing operations
		int opeartion1 = a + b *c ;
		int opeartion2 = a * b + c ; 
		int opeartion3 = c + a / b ;
		int opeartion4 = a % b + c ; 
		
		//Display the information
		System.out.println("The results of Int Operations are " + opeartion1 + ", " +  opeartion2 + ", " + opeartion3 + " and " + opeartion4);
		
		//close the scanner input
		input.close();
		
	}
	
}

/* Create a program to divide N number of chocolates among M children.
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___
*/

import java.util.Scanner;
public class ChocolateDivision{
	public static void main(String[] args){
		//Variable Declaration
		int numberOfchocolates, numberOfChildren ;
		
		//Declaring scanner class instance for user input 
		Scanner input = new Scanner(System.in);
		
		//Taking user input for number of chocolates and number of children
		System.out.print("Enter the number of Chocolates: ");
		numberOfchocolates = input.nextInt();
		
		System.out.print("Enter the number of Childrens: ");
		numberOfChildren = input.nextInt();
		
		//Displaying the result
		System.out.print("The number of chocolates each child gets is " + numberOfchocolates/numberOfChildren + " and the number of remaining chocolates are " + numberOfchocolates%numberOfChildren);
		
		//close the scanner input
		input.close();
		
	}
}
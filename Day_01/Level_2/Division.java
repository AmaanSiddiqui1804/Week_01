/*Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___ */

import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Asking user for two numbers as input: dividend and divisor
        System.out.print("Enter dividend: ");
        int number1 = input.nextInt();
		
		System.out.print("Enter divisor :");
        int number2 = input.nextInt();
		
		//Calculation of quotient and remainder
		int quotient = number1/number2 ;
		int remainder = number1%number2 ;
		
		//Printing results
		System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " +number2);
	}
}
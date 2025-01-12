/*Write a Temperature Conversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
Hint => 
Create a fahrenheit variable and take the user's input
User the formula to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The ____ fahrenheit is _____ celsius 
*/

import java.util.Scanner;
public class FahrenheitToCelcius{
	public static void main(String[] args){
		//Variable Declaration
		float celsiusResult, fahrenheit ;
		
		//Declaring scanner class instance for user input 
		Scanner input = new Scanner(System.in);
		
		//Taking temperature in fahreheit from the user
		System.out.print("Enter the temperature in Fahrenheit: ");
		
		fahrenheit = input.nextFloat();
		
		//Converting the temperature into fahrenheit
		celsiusResult  = ((fahrenheit - 32) * 5/9 );
		
		//Display the information
		System.out.print("The "+ fahrenheit + " fahrenheit is "+ celsiusResult + " celsius.");
		
		//close the scanner input
		input.close();
		
	}
}
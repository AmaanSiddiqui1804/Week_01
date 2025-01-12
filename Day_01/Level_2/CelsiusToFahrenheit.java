/*Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
Hint => 
Create a celsius variable and take the temperature as user input
Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to fahreheitResult  and print the result
I/P => celcius
O/P =>  The ____ celsius is _____ fahrenheit */

import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String[] args){
		//Variable Declaration
		float celsius, fahreheitResult ;
		
		//Declaring scanner class instance for user input 
		Scanner input = new Scanner(System.in);
		
		//Taking temperature in celcius from the user
		System.out.println("Enter the temperature in Celsius: ");
		
		celsius = input.nextFloat();
		
		//Converting the temperature into fahrenheit
		fahreheitResult  = ((celsius * 9) / 5 ) + 32;
		
		//Display the information
		System.out.print("The "+ celsius + " celsius is "+ fahreheitResult + " fahrenheit");
		
		//close the scanner input
		input.close();
		
	}
}
/* Temperature Converter:
○ Write a program that converts temperatures between Fahrenheit and Celsius. ○
The program should have separate functions for converting from Fahrenheit to
Celsius and from Celsius to Fahrenheit.
*/ 

import java.util.Scanner;

public class TemperatureConverter { 

    //Method to convert temp farenheit to celcius
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    //Method to convert celcius to farenheit
    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.println("Enter 'C' to convert to Celsius or 'F' to convert to Fahrenheit:");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            System.out.println("Converted to Celsius: " + toCelsius(temp));
        } else if (choice == 'F' || choice == 'f') {
            System.out.println("Converted to Fahrenheit: " + toFahrenheit(temp));
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

/* Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172;    
*/

// importing necessary package 
import java.util.Scanner;
//Class Declaration
public class UnitConverter3 {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9; // Formula for Fahrenheit to Celsius
        return fahrenheit2celsius; // Return converted value in Celsius
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32; // Formula for Celsius to Fahrenheit
        return celsius2fahrenheit; // Return converted value in Fahrenheit
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592; // Conversion factor for pounds to kilograms
        return pounds * pounds2kilograms; // Return converted value in kilograms
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462; // Conversion factor for kilograms to pounds
        return kilograms * kilograms2pounds; // Return converted value in pounds
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541; // Conversion factor for gallons to liters
        return gallons * gallons2liters; // Return converted value in liters
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172; // Conversion factor for liters to gallons
        return liters * liters2gallons; // Return converted value in gallons
    }
    //Main method declaration
    public static void main(String[] args) {
        //Creating Scanner class instance
        Scanner input = new Scanner(System.in);
        
        //Asking user for input and calling appropriate method for performing operation
        System.out.print("Enter temperature in Fahrenheit to convert it into Celsius: ");
        double fahrenheit = input.nextDouble();
        System.out.println("Temperature in Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        System.out.print("Enter temperature in Celsius to convert it into Fahrenheit: ");
        double celsius = input.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        System.out.print("Enter weight in Pounds to convert it into Kilograms: ");
        double pounds = input.nextDouble();
        System.out.println("Weight in Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.print("Enter weight in Kilograms to convert it into Pounds: ");
        double kilograms = input.nextDouble();
        System.out.println("Weight in Pounds: " + convertKilogramsToPounds(kilograms)); 

        System.out.print("Enter quantity in Gallons to convert it into Liters: ");
        double gallons = input.nextDouble();
        System.out.println("Quantity in Liters: " + convertGallonsToLiters(gallons));

        System.out.print("Enter quantity in Liters to convert it into Gallons: ");
        double liters = input.nextDouble();
        System.out.println("Quantity in Gallons: " + convertLitersToGallons(liters));

        //Closing Scanner class instance
        input.close();
    }
}

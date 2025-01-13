
/*
 
 */
import java.util.Scanner;

public class UnitConverter {

    // Method to convert distance from kilometers to miles
    public static double convertKmToMiles(double dis) {
        double km2miles = 0.621371; // Conversion factor for kilometers to miles
        return dis * km2miles; // Return converted value in miles
    }

    // Method to convert distance from miles to kilometers
    public static double convertMilesToKm(double dis) {
        double miles2km = 1.60934;
        return dis * miles2km;
    }

    // Method to convert distance from meters to feet
    public static double convertMetersToFeet(double dis) {
        double meters2feet = 3.28084; 
        return dis *meters2feet;
    } 

    // Method to convert distance from feet to meters
    public static double convertFeetToMeters(double dis) {
        double feet2meters = 0.3048;
        return dis * feet2meters;
    }

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.print("Enter a distance ");
        double dis = input.nextDouble();
	
        System.out.println(" km to miles " + convertKmToMiles(dis));
        System.out.println(" miles to km " + convertMilesToKm(dis));
        System.out.println(" meters to feet " + convertMetersToFeet(dis));
        System.out.println(" feet to meters " + convertFeetToMeters(dis));
    }
}

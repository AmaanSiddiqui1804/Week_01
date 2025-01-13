/* Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) => 
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
 */

import java.util.Scanner;

public class UnitConverter2 {
 
     // Method to convert yards to feet
     public static double convertYardsToFeet(double dis) {
         double yards2feet = 3; 
         return dis * yards2feet; 
     }
 
     // Method to convert feet to yards
     public static double convertFeetToYards(double dis) {
         double feet2yards = 0.333333; 
         return dis * feet2yards; 
     }
 
     // Method to convert meters to inches
     public static double convertMetersToInches(double dis) {
         double meters2inches = 39.3701; 
         return dis * meters2inches; 
     }
 
     // Method to convert inches to meters
     public static double convertInchesToMeters(double dis) {
         double inches2meters = 0.0254; 
         return dis * inches2meters; 
     }
 
     // Method to convert inches to centimeters
     public static double convertInchesToCentimeters(double dis) {
         double inches2cm = 2.54; 
         return dis * inches2cm; 
     }
 
     public static void main(String[] args) {
         // Creating scanner object to get input from user
         Scanner input = new Scanner(System.in);
 
         // Asking for input
         System.out.print("Enter a length: ");
         double dis = input.nextDouble();
         
         // Displaying converted values
         System.out.println("Yards to feet: " + convertYardsToFeet(dis));
         System.out.println("Feet to yards: " + convertFeetToYards(dis));
         System.out.println("Meters to inches: " + convertMetersToInches(dis));
         System.out.println("Inches to meters: " + convertInchesToMeters(dis));
         System.out.println("Inches to centimeters: " + convertInchesToCentimeters(dis));
 
         // Closing the scanner object
         input.close();
     }
 }
 

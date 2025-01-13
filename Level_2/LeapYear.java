/* Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b 
*/

// Importing necessary libraries
import java.util.*;

class LeapYear {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {

        // A year is a leap year if:
        // - It is divisible by 4 and not divisible by 100
        // OR
        // - It is divisible by 400
        boolean ans = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return ans;
    }

    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Asking the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year < 0) {
            System.out.println("Error: Year cannot be negative. Please enter a valid positive year.");
        } else {
            // Checking if the year is a leap year and displaying the result
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        // Closing the Scanner object
        input.close();
    }
}

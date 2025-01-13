/*Write a program SpringSeason that takes two int values month and day 
from the command line and prints “Its a Spring Season” 
otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. 
Write a Method to check for Spring season and return a boolean true or false
*/

// Importing necessary library for user input
import java.util.*;

public class SpringSession {
    
    // Method to check if the given date falls within the spring season
    public static Boolean check(int month, int day) {
        // Variable to store the result ("Yes" for spring, "No" for not spring)
        String ans = "No";

        // Spring session starts on March 20 and ends on June 20 (inclusive)
        // Checking if the month is March and day is greater than or equal to 20
        if (month == 3 && day >= 20) ans = "Yes";
        
        // Checking if the month is between March and June (exclusive) to include all days of April and May
        else if (month > 3 && month < 6) ans = "Yes";
        
        // Checking if the month is June and day is less than or equal to 20
        else if (month == 6 && day <= 20) ans = "Yes";

        // Returning true if it's spring season, false otherwise
        if (ans == "Yes") return true;
        else return false;
    }

    public static void main(String args[]) {
        // Creating Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the day number
        System.out.println("Enter day number:");
        int day = sc.nextInt();

        // Asking the user to input the month number
        System.out.println("Enter month number:");
        int month = sc.nextInt();

        // Calling the method 'check' to determine if it's spring season
        Boolean ans = check(month, day);

        // Printing the result based on the check
        if (ans) 
            System.out.println("Spring Session");
        else 
            System.out.println("Not Spring Session");

        // Closing the scanner object
        sc.close();
    }
}

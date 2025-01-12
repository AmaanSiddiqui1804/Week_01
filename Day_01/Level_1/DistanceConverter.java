/*Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Converting feet to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Printing the result
        System.out.printf("The distance in feets is %.2f feet which is %.2f yards and %.2f miles.%n", distanceInFeet, distanceInYards, distanceInMiles);

        // Closing the Scanner object
        sc.close();
    }
}

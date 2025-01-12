import java.util.Scanner;

public class KilometersToMilesConversion {
    public static void main(String[] args) {

        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Asking user for input in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();

        // Distance conversion from kilometers to miles (1 kilometer = 1.6 miles)
        double distanceInMiles = km * 1.6;

        // Display the result
        System.out.println("The total miles is " + distanceInMiles + 
            " mile(s) for the given " + km + " km.");
    }
}

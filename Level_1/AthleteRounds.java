/*An athlete runs in a triangular park with sides provided as input by the user in meters.
If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/

// Importing necessary libraries
import java.util.Scanner;

public class AthleteRounds {

    // Method to calculate the number of rounds
    public static double numberOfRounds(int side1, int side2, int side3) {
        // Calculating the perimeter of the triangular park
        double perimeter = (double) side1 + (double) side2 + (double) side3;

        // Total distance the athlete has to cover (in meters)
        int totalDistance = 5000;

        // Calculating the number of rounds the athlete needs to complete
        double rounds = totalDistance / perimeter;

        // Returning the calculated number of rounds
        return rounds;
    }

    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the lengths of the three sides of the park
        System.out.println("Enter length of 3 sides of triangular park: ");
        System.out.print("Length of Side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Length of Side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Length of Side 3: ");
        int side3 = sc.nextInt();

        // Printing the number of rounds the athlete needs to complete
        System.out.println("Number of rounds: " + numberOfRounds(side1, side2, side3));

        // Closing the Scanner object
        sc.close();
    }
}

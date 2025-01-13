/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/

// Importing necessary libraries
import java.util.*;
public class MaximumHandshakes {

    // Method to calculate the total number of handshakes
    public static int handShakes(int students) {
        // Formula for calculating handshakes
        int totalShakes = (students * (students - 1)) / 2;
        return totalShakes; // Returning the calculated handshakes
    }

    // Main method
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the number of students
        System.out.println("Enter number of students to calculate number of handshakes");
        int students = sc.nextInt();

        // Printing the total number of handshakes
        System.out.println("Total handshakes: " + handShakes(students));

        // Closing the Scanner object
        sc.close();
    }
}



/*
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/
// Importing necessary libraries
import java.util.*;
public class MaxHandshakes {

    // Main method
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to input the number of students
        System.out.println("Enter number of students to calculate number of handshakes");
        int students = sc.nextInt();

        // Formula for calculating handshakes
        int totalShakes = (students * (students - 1)) / 2;

        // Printing the total number of handshakes
        System.out.println("Total handshakes: " + totalShakes);

        // Closing the Scanner object
        sc.close();
    }
}

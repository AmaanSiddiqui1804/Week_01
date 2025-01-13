// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class GradeCalculation {
    // Main method declaration
    public static void main(String[] args) {

        // Creating Scanner class object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declaring an array to store marks for 3 subjects
        int[] marks = new int[3];
        double percentage;
        char grade;

        // Asking the user to enter marks for the student
        System.out.println("Enter marks for the student");

        // Array to store subject names
        String[] subjects = {"Physics", "Chemistry", "Maths"};

        // Loop to take input for 3 subjects
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks in " + subjects[i] + ": ");
            marks[i] = input.nextInt();

            // Setting negative marks to 0
            if (marks[i] < 0) {
                marks[i] = 0;
            }
        }
        // Calculating the percentage
        percentage = (marks[0] + marks[1] + marks[2]) / 3.0;

        // Determining the grade based on percentage
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'R';
        }

        // Displaying the grade for the student
        System.out.println("The grade for the student is " + grade);

        // Closing the scanner object
        input.close();
    }
}
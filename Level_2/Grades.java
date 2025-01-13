// Importing Scanner class for user input
import java.util.Scanner;

// Class declaration
public class Grades {
    // Main method
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Asking user for the number of students
        System.out.print("Enter the number of students ");
        int numStudents = input.nextInt();

        // Arrays to store marks, percentages, and grades
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Loop to get details for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                // Determine the subject name based on index
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                System.out.print("Enter marks in " + subject + ": ");
                marks[i][j] = input.nextInt();

                // Set negative marks to 0
                if (marks[i][j] < 0) {
                    marks[i][j] = 0;
                }
            }

            // Calculate percentage for the student
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display grades for all students
        System.out.println("\nGrades of Students ");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Grade " + grades[i]);
        }

        // Closing Scanner object
        input.close();
    }
}
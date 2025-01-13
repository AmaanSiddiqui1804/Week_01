
import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for PCM for students
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 columns for Physics, Chemistry, and Math
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics score (40-100)
            scores[i][1] = 40 + random.nextInt(61); // Chemistry score (40-100)
            scores[i][2] = 40 + random.nextInt(61); // Math score (40-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Columns for Total, Average, Percentage
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total; // Store total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Store average (rounded)
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Store percentage (rounded)
        }
        return results;
    }

    // Method to get the grade based on the percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print((int) results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.print(results[i][2] + "%\t\t");
            System.out.println(getGrade(results[i][2]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for the students
        int[][] scores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScoreCard(scores, results);

        scanner.close();
    }
}

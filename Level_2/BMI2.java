
// Importing Scanner class for user input
import java.util.Scanner;

// Class declaration
public class BMI2 {
    // Main method
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Asking user for number of persons
        System.out.print("Enter the number of persons ");
        int numPersons = input.nextInt();

        // Arrays to store weight, height, BMI, and weight status
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        // Loop to get details of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Get weight input
            System.out.print("Enter weight (kg): ");
            weight[i] = input.nextDouble();

            // Get height input
            System.out.print("Enter height (m): ");
            height[i] = input.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Printing results
        System.out.println("\nBMI and Weight Status of Persons ");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        // Closing scanner
        input.close();
    }
}
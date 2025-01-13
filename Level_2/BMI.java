// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class BMI {
    // Main method declaration
    public static void main(String[] args) {

        // Creating Scanner class object to read input from the user
        Scanner input = new Scanner(System.in);

        // Asking user to enter the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        // Declaring arrays to store weight, height, BMI, and weight status for each person
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        // Taking input for weight and height of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Asking user to enter weight in kilograms
            System.out.print("Enter weight (kg): ");
            weight[i] = input.nextDouble();

            // Asking user to enter height in meters
            System.out.print("Enter height (m): ");
            height[i] = input.nextDouble();

            // Calculating BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determining weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying BMI and weight status of each person
        System.out.println("\nBMI and Weight Status of Persons:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        // Closing the scanner object
        input.close();
    }
}
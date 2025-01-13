/* */

import java.util.*;
// Class Declaration
public class BMI {

    // Method to calculate BMI and store it in the data array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // Extract weight
            double heightInMeters = data[i][1] / 100; // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters); // Calculate BMI
            data[i][2] = bmi; // Store BMI in the array
        }
    }

    // Method to determine BMI status based on calculated BMI
    public static String[] BMIStatus(double[][] data) {
        String[] status = new String[data.length]; // Array to store BMI status
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2]; // Retrieve BMI value
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status; // Return the BMI status array
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Initialize Scanner for user input

        // Array to store weight, height, and BMI for 10 persons
        double[][] data = new double[10][3];

        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height for person " + (i + 1) + " in cm: ");
            data[i][1] = input.nextDouble();
        }

        calculateBMI(data); // Calculate BMI for each person

        String[] bmiStatus = BMIStatus(data); // Determine BMI status for each person

        // Print BMI and status for each person
        System.out.println("\nPerson\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + data[i][2] + "\t\t" + bmiStatus[i]);
        }

        input.close(); // Close the Scanner
    }
}


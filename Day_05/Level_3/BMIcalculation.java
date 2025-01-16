/* An organization took up the exercise to find the Body Mass Index (BMI) of all 
the persons in a team of 10 members. For this create a program to find the BMI and 
display the height, weight, BMI, and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) 
for the person and store it in the corresponding 2D array of 10 rows. The First Column 
stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person height and 
weight and return the 2D String array. Use the formula BMI = weight / (height * height). 
Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameter. Calls the  
user defined method to compute the BMI and the BMI Status and store in 2D String array 
of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person Height, 
Weight, BMI and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and 
displays the result.
*/

import java.util.Scanner;

public class BMIcalculation{
    //Method to find BMI and status
    public static String[][] statusAndBMI(double[][] weightAndHeight){
        String[][] bmiAndStatus = new String[10][2];
        for (int i = 0; i < weightAndHeight.length; i++) {
            double weight = weightAndHeight[i][0];
            double height = weightAndHeight[i][1];
            double bmi = weight / (height * height) * 10000; // 10000 is multiplied to convert cm^2 to m^2

            bmi = Math.round(bmi * 100.0) / 100.0;   // Rounding off to 2 decimal places 

            bmiAndStatus[i][0] = String.valueOf(bmi);
            if (bmi <= 18.4) {
                bmiAndStatus[i][1] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                bmiAndStatus[i][1] = "Normal";
            } else if (bmi >=25.0 && bmi <= 39.9) {
                bmiAndStatus[i][1] = "Overweight";
            } else {
                bmiAndStatus[i][1] = "Obese";
            }
        }
        System.out.println("BMI\tStatus");
        for (int i = 0; i < bmiAndStatus.length; i++) {
            System.out.println(bmiAndStatus[i][0] + "\t" + bmiAndStatus[i][1]);
        }
        return bmiAndStatus;
    }

    // Method to compute BMI details and prepare the complete table
    public static String[][] computeBMIdetails(double[][] weightAndHeight) {
        String[][] bmiDetails = new String[10][4];
        String[][] bmiAndStatus = statusAndBMI(weightAndHeight);

        for (int i = 0; i < weightAndHeight.length; i++) {
            double weight = weightAndHeight[i][0];
            double height = weightAndHeight[i][1];

            // Populate the table with weight, height, BMI, and status
            bmiDetails[i][0] = String.format("%.2f", weight);
            bmiDetails[i][1] = String.format("%.2f", height);
            bmiDetails[i][2] = bmiAndStatus[i][0]; // BMI
            bmiDetails[i][3] = bmiAndStatus[i][1]; // Status
        }
        return bmiDetails;
    }

    // Method to display the BMI details in a tabular format
    public static void displayTable(String[][] bmiDetails) {
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < bmiDetails.length; i++) {
            System.out.println(bmiDetails[i][0] + "\t\t" + bmiDetails[i][1] + 
                            "\t\t" + bmiDetails[i][2] + "\t\t" + bmiDetails[i][3]);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter weight in kilograms and height in centimeters
        double[][] weightAndHeight = new double[10][2];
        System.out.println("Enter weight in kilograms and height in centimeters for 10 people:");
        System.out.println("Wt.(kg) Ht.(cm)");
        for (int i = 0; i < weightAndHeight.length; i++) {
            weightAndHeight[i][0] = input.nextDouble();
            weightAndHeight[i][1] = input.nextDouble();
        }

        // Compute BMI details
        String[][] bmiDetails = computeBMIdetails(weightAndHeight);

        // Display the results in a tabular format
        System.out.println("\nBMI Details of the Team:");
        displayTable(bmiDetails);

        input.close();
    }
}
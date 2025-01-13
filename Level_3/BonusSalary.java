/* Create a program to find the bonus of 10 employees based on their years of service 
as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, 
along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 
5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. 
Use the Math.random() method to determine the 5-digit salary for each employee and 
also use the random method to determine the years of service. Define 2D Array to 
save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined 
above and return the new 2D Array of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, 
and the Total Bonus Amount and display it in a Tabular Format
 */

 // Importing necessary libraries
import java.util.Random;

public class BonusSalary {

    // Method to generate employee data (salary and years of service)
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; // 2D array: [][0] for salary, [][1] for years of service
        Random random = new Random(); // Random object for generating data

        for (int i = 0; i < numEmployees; i++) {
            // Generating a random salary between 10,000 and 99,999
            data[i][0] = 10000 + random.nextInt(90000);

            // Generating random years of service between 1 and 10
            data[i][1] = 1 + random.nextInt(10);
        }
        return data; // Returning the generated employee data
    }

    // Method to calculate bonus and new salary based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] result = new double[employeeData.length][3]; // 2D array: [][0] old salary, [][1] bonus, [][2] new salary

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0]; // Extracting old salary
            int yearsOfService = employeeData[i][1]; // Extracting years of service

            // Bonus percentage: 5% for >5 years of service, 2% otherwise
            double bonusPercentage = (yearsOfService > 5) ? 5.0 : 2.0;

            // Calculating bonus and new salary
            double bonus = oldSalary * (bonusPercentage / 100.0);
            double newSalary = oldSalary + bonus;

            // Storing calculated values
            result[i][0] = oldSalary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result; // Returning calculated bonus and new salary
    }

    // Method to display the summary of employee data, bonus, and salary details
    public static void displaySummary(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0; // Variable to accumulate old salaries
        double totalNewSalary = 0; // Variable to accumulate new salaries
        double totalBonus = 0; // Variable to accumulate bonuses

        // Printing header row
        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0]; // Retrieving old salary
            int yearsOfService = employeeData[i][1]; // Retrieving years of service
            double bonus = bonusData[i][1]; // Retrieving calculated bonus
            double newSalary = bonusData[i][2]; // Retrieving new salary

            // Accumulating totals
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            // Printing employee details
            System.out.printf("%-10d %-15.2f %-15d %-15.2f %-15.2f%n",
                    i + 1, (double) oldSalary, yearsOfService, bonus, newSalary);
        }

        // Printing footer row with totals
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f%n",
                "TOTAL", totalOldSalary, "-", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10; // Number of employees to process

        // Step 1: Generate random employee data
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Step 2: Calculate bonus and new salary for each employee
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display a detailed summary of the results
        displaySummary(employeeData, bonusData);
    }
}

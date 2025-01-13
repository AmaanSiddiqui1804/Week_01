/*
Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
*/

// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class EmployeeBonus {
    // Main method declaration
    public static void main(String[] args) {

        // Creating Scanner class object to read input from the user
        Scanner input = new Scanner(System.in);

        // Defining arrays to store data for 10 employees
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmount = new double[10];
        double[] newSalary = new double[10];

        // Variables to calculate totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to take input for salaries of all 10 employees
        System.out.println("Enter salaries of 10 employees:");
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Salary of Employee " + (i + 1) + ": ");
                salary[i] = input.nextDouble();
                if (salary[i] > 0) break; // Validate salary
                System.out.println("Invalid salary. Please enter again.");
            }
        }

        // Loop to take input for years of service of all 10 employees
        System.out.println("\nEnter years of service for 10 employees:");
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Years of Service for Employee " + (i + 1) + ": ");
                yearsOfService[i] = input.nextDouble();
                if (yearsOfService[i] >= 0) break; // Validate years of service
                System.out.println("Invalid years of service. Please enter again.");
            }
        }

        // Loop to calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            // Calculate bonus percentage based on years of service
            double bonusPercentage = (yearsOfService[i] > 5) ? 5.0 : 2.0;
            bonusAmount[i] = (salary[i] * bonusPercentage) / 100;

            // Calculate new salary
            newSalary[i] = salary[i] + bonusAmount[i];

            // Update totals
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Displaying results
        System.out.println("\nSummary of Employee Bonuses and Salaries:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    (i + 1), salary[i], bonusAmount[i], newSalary[i]);
        }

        // Displaying totals
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        // Closing the scanner object
        input.close();
    }
}
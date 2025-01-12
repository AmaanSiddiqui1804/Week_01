/*Create a program to find the total income of a person by taking salary and bonus from user
Hint => 
Create a variable named salary and take user input.
Create another variable bonus and take user input.
Compute income by adding salary and bonus and print the result
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___
*/ 

import java.util.Scanner;
public class TotalIncome {
    public static void main(String[] args) {
	
	    // Creating Scanner class Instance
        Scanner input = new Scanner(System.in);
		
		//Asking user for Salary and Bonus
        System.out.print("Enter Salary: ");
        int salary = input.nextInt();
		
		System.out.print("Enter Bonus :");
        int bonus = input.nextInt();
		
		//Calculation of Total Income
		int totalIncome = salary+bonus ;
		
		//Printing results
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
	}
}
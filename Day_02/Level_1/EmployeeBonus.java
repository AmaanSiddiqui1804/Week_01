/* Create a program to find the bonus of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.     
*/

//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class EmployeeBonus {
	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in); 
		
		//Asking user for Salary 
		System.out.print("Enter salary: "); 
		double salary = input.nextDouble(); 
		//Asking user to input years of Service
		System.out.print("Enter years of service: ");
		int yearsOfService = input.nextInt(); 
		
		double bonus = salary*5/100 ; 
		if(yearsOfService>5){
			System.out.println("The bonus amount employee will get is: " + bonus);
		}
		else{
			System.out.println("The bonus amount employee will get is: " + 0); 
		} 
		//Closing scanner class
		input.close();
	}
}



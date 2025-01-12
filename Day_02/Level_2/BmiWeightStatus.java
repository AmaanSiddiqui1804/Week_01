/* Create a program to find the BMI of a person
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
*/   


//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class BmiWeightStatus{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in); 
		//Asking user for input
		
		System.out.println("Enter weight of the person :");
        double weight = input.nextDouble();
		System.out.println("Enter weight of the person :");
        double heightCm = input.nextDouble();
		
		//Conversion oh height from cm to meter
        double heightM = heightCm/100; 
		
        double bmi = weight / (heightM * heightM); 
        if(bmi <= 18.4){
			System.out.println("Underweight");
        } 
		else if(bmi >= 18.5 && bmi <= 24.9){
			System.out.println("StatNormal");
        }
		else if (bmi >= 25.0 && bmi <= 39.9){
			System.out.println("Overweight");
        } 
		else{
			System.out.println(" Obese");
        }
        //Closing scanner class
		input.close();
    }
}


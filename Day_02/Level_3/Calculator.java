/* Write a program to create a calculator using switch...case.
Hint => 
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.    
*/

// Importing Scanner class for taking input
import java.util.Scanner;

// Class declaration
public class Calculator{
    // Main method declaration
    public static void main(String[] args){
        // Creating Scanner class instance for user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter first number:");
        double a = input.nextDouble();

        System.out.println("Enter second number:");
        double b = input.nextDouble();

        System.out.println("Choose operation ( + , - , * , / ):");
        String op = input.next();

        // Performing calculation based on the operator
        switch (op){
            case "+":
                // Addition operation
                System.out.println("Result: " + (a + b));
                break;

            case "-":
                // Subtraction operation
                System.out.println("Result: " + (a - b));
                break;

            case "*":
                // Multiplication operation
                System.out.println("Result: " + (a * b));
                break;

            case "/":
                // Division operation (checking for division by zero)
                if(b != 0){
                    System.out.println("Result: " + (a / b));
                } 
				else{
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
			// Default case for invalid operator
            default:
                System.out.println("Invalid Operator. Please choose from +, -, *, /.");
        }
		
        // Closing Scanner instance
        input.close();
    }
}


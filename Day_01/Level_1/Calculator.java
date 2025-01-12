import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        // Creatigng a Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Asking user to enter the first number
        System.out.print("Enter first number: ");
        float number1 = sc.nextFloat();

        // Asking user to enter the second number
        System.out.print("Enter second number: ");
        float number2 = sc.nextFloat();

        // Arithmetic operation Calculation
        
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        // Printing the output
        System.out.println("The addition, subtraction, multiplication and division of 2 numbers " + number1 + " and " + number2 + " is: " + addition + ", " + subtraction +", " + multiplication + ", " + division);
        

        // Closing Scanner 
        sc.close();
    }
}



import java.util.Scanner;

public class BasicCalculator {

    //Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }
    //Method to add subtract numbers
    public static double subtract(double a, double b) {
        return a - b;
    }
    //Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }
    //Method to divide two numbers
    public static double divide(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking user input
        System.out.println("Enter two numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation: +, -, *, /");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+': System.out.println("Result: " + add(num1, num2)); break;
            case '-': System.out.println("Result: " + subtract(num1, num2)); break;
            case '*': System.out.println("Result: " + multiply(num1, num2)); break;
            case '/': 
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default: System.out.println("Invalid operation.");
        }
        sc.close();
    }
}


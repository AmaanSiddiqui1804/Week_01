/* Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint => 
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
If the number is negative, print negative. 
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
*/

import java.util.Scanner;
//Main class declaration
public class NumberAnalysis {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1; // num1 is greater than num2
        } else if (num1 < num2) {
            return -1; // num1 is less than num2
        } else {
            return 0; // num1 is equal to num2
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking user input for the 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Loop through the array and check each number
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println(num + " is Negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparison == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparison == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

        input.close(); // Close the Scanner
    }
}


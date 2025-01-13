/*
Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/

// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class Numbercheck {
    // Main method declaration
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Define an integer array of 5 elements
        int [] numbers = new int[5];

        // Asking user to enter 5 numbers
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Loop through the array to check if the number is positive, negative, or zero
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                
                // Check if the positive number is even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println("The number " + numbers[i] + " is positive and even.");
                } 
                else {
                    System.out.println("The number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } 
            else {
                System.out.println("The number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last element of the array
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Closing the scanner object
        input.close();
    }
}
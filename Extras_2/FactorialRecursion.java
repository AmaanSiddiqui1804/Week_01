/* Factorial Using Recursion:
○ Write a program that calculates the factorial of a number using a recursive
function.
○ Include modular code to separate input, calculation, and output processes.*/

import java.util.Scanner;

public class FactorialRecursion { 

        //Method to find factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.println("Enter a number to calculate its factorial:");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is: " + factorial(num));

        sc.close();
    }
}


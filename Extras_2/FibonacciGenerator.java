/* Fibonacci Sequence Generator:
○ Write a program that generates the Fibonacci sequence up to a specified number
of terms entered by the user.
○ Organize the code by creating a function that calculates and prints the Fibonacci
sequence.*/

import java.util.Scanner;

public class FibonacciGenerator { 
    
    //Method to find febonacci sequence
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int terms = sc.nextInt();

        System.out.println("Fibonacci Sequence:");
        generateFibonacci(terms);

        sc.close();
    }

}

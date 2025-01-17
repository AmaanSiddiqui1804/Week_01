/* Maximum of Three Numbers:
○ Write a program that takes three integer inputs from the user and finds the
maximum of the three numbers.
○ Ensure your program follows best practices for organizing code into modular
functions, such as separate functions for taking input and calculating the
maximum value.*/ 

import java.util.Scanner;

public class MaxOfThreeNumbers {

    //Method to find maximum of three
    public static int findMax(int a, int b, int c) {
        if (a > b && a > c) return a;
        if (b > a && b > c) return b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
    
        sc.close();
    } 
}

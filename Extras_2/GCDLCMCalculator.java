/* GCD and LCM Calculator:
○ Create a program that calculates the Greatest Common Divisor (GCD) and Least
Common Multiple (LCM) of two numbers using functions.
○ Use separate functions for GCD and LCM calculations, showcasing how modular
code works.
*/

import java.util.Scanner;

public class GCDLCMCalculator {

    //Method to find GCD
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = calculateGCD(a, b);
        
        // Calculation of LCM
        int lcm = (a * b) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        sc.close();
    }
}

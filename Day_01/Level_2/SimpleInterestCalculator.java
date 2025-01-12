/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___ 
*/

import java.util.Scanner;

class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Creating Scanner instance for user input
        Scanner input = new Scanner(System.in);

        // Asking user for Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();
		
        System.out.print("Enter the Rate of Interest without percent sign: ");
        double rate = input.nextDouble();
		
        System.out.print("Enter the Time period (in years): ");
        double time = input.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f% %, and Time %.2f years.\n", simpleInterest, principal, rate, time);
    }
}

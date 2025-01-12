/*Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___
*/


import java.util.Scanner;

class PoundsToKilograms {

    public static void main(String[] args) {
        // Creating Scanner instance for user input
        Scanner input = new Scanner(System.in);

        // Asking user for weight in pounds
        System.out.print("Enter the weight of the person in pounds: ");
        double weightInPounds = input.nextDouble();

        // Conversion of weight from pounds to kilograms
        double weightInKilograms = weightInPounds / 2.2;

        // Displaying the result
        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f.", weightInPounds, weightInKilograms);
    }
}

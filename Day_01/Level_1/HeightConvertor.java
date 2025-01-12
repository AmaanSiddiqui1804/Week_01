/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.Scanner;
public class HeightConvertor {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

             System.out.print("Enter your height in centimeters ");
        int heightInCm = sc.nextInt();

        // Convert height from centimeters to inches
        double heightInInch = (heightInCm / 2.54);

        // Convert height from inches to feet
        double heightInFoot = (heightInInch / 12);

        // Display the height in centimeters, feet, and inches
        System.out.printf("Your height in cm is %d while in feet is %.1f and inches is %.1f", heightInCm, heightInFoot, heightInInch);
    }
}
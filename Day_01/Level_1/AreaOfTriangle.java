/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => The area of triangle in cm is ___ while in inches is ___ 
*/

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Creating a Scanner object for taking input from the user
        Scanner input = new Scanner(System.in);

        // Asking the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle in centimeters: ");
        double base = input.nextDouble();

        // Asking the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle in centimeters: ");
        double height = input.nextDouble();

        // Calculating the area of the triangle in square centimeters
        double areaOfTriangle = 0.5 * base * height;

        // Converting the area from square centimeters to square inches
        double areaOfTriangleInInches = areaOfTriangle * 0.155;

        // Printing the output
        System.out.printf("The area of the triangle is %.2f cm² (%.2f in²).%n", areaOfTriangle, areaOfTriangleInInches);

        // Closing the Scanner
        input.close();
    }
}



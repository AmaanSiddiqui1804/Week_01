/*Write a program to find the side of the square whose perimeter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____  */




import java.util.Scanner;

public class SquareSideCalculation {
    public static void main(String[] args) {
        // Creating a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Asking the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculating the side length of the square
        double side = perimeter / 4;

        // Displaying the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f.%n", side, perimeter);

        // Closing the Scanner
        input.close();
    }
}

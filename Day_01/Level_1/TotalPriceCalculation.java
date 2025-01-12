/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___ 
*/
import java.util.Scanner;

public class TotalPriceCalculation {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Asking the user to enter the unit Price in INR:
        System.out.print("Enter the unit price in INR: ");
        double unitPrice = input.nextDouble();
        
        // Asking the user to enter the quantity (no. of items) to be bought:
        System.out.print("Enter the quantity to be bought: ");
        double quantity = input.nextDouble();

        // Calculation of Total Price
        double totalPrice = unitPrice * quantity;

        // Printing the result using println
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice + ".");

        // Closing the Scanner object
        input.close();
    }
}

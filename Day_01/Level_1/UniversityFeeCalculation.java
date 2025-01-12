import java.util.Scanner;

public class UniversityFeeCalculation {
    public static void main(String[] args) {
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);

        // Asking user to enter the student fee
        System.out.print("Enter the student fee (INR): ");
        int fee = input.nextInt();

        // Asking user to enter the university discount percentage
        System.out.print("Enter the discount percentage: ");
        int discountPercent = input.nextInt();

        // Calculation of the discount amount
        int discount = (fee * discountPercent) / 100;

        // Calculation of the discounted fee
        int discountedFees = fee - discount;

        // Print the discount amount and final discounted fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFees);

    }
}
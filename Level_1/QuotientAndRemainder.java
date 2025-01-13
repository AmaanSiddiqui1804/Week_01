/*Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor)  */

// Importing necessary libraries
import java.util.Scanner;
public class QuotientAndRemainder {

    public static int[] findRemainderAndQuotient(int dividend, int divisor){
        int quotient = dividend/divisor ;
        int remainder = dividend%divisor ;
        int [] arr = new int [2];
        arr[0] = quotient;
        arr[1] = remainder;
        return arr ;
    }
    
    public static void main(String[] args) {
 
        // Creating Scanner object to get input from the user
        Scanner sc = new Scanner(System.in);

        // Asking the user to input two numbers
        System.out.println("Enter two numbers dividend and divisor: ");
         int dividend = sc.nextInt();
         int divisor = sc.nextInt(); 
        
         int [] arr = findRemainderAndQuotient(dividend, divisor);
         System.out.println("The quotient is: " + arr[0] + " and the remainder is: " + arr[1]);

         sc.close();
    }    
}

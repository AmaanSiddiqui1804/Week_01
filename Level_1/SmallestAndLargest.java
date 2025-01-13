/*Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
 */

import java.util.Scanner;

public class SmallestAndLargest {
 
    // Method to find the smallest and largest numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
 
         int smallest, largest;
 
         // Finding smallest number
         if (number1 <= number2 && number1 <= number3) {
             smallest = number1;
         } else if (number2 <= number1 && number2 <= number3) {
             smallest = number2;
         } else {
             smallest = number3;
         }
 
         // Finding largest number
         if (number1 >= number2 && number1 >= number3) {
             largest = number1;
         } else if (number2 >= number1 && number2 >= number3) {
             largest = number2;
         } else {
             largest = number3;
         }
 
         // Storing smallest and largest numbers in an array and returning it
         int[] ans = new int[2];
         ans[0] = smallest;
         ans[1] = largest;
         return ans;
    }
 
    public static void main(String[] args) {
 
         // Creating Scanner object to get input from the user
         Scanner sc = new Scanner(System.in);
 
         // Asking the user to input three numbers
         System.out.println("Enter three numbers: ");
         int number1 = sc.nextInt();
         int number2 = sc.nextInt();
         int number3 = sc.nextInt();
 
         // Calling method to get smallest and largest numbers and storing the result
         int[] ans = findSmallestAndLargest(number1, number2, number3);
 
         // Displaying the smallest and largest numbers
         System.out.println("The smallest number is: " + ans[0] + " and largest number is: " + ans[1]);
 
         // Closing the scanner object to prevent resource leakage
         sc.close();
    }
}
 

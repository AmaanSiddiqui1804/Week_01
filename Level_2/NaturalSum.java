/* Write a program to find the sum of n natural numbers 
using recursive method and compare the result with the 
formulae n*(n+1)/2 and show the result from both computations
 is correct. 
Hint => 
Take the user input number and check 
whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
 */

 import java.util.Scanner;

 public class NaturalSum{
 
         public static int naturalNumbSum(int number) {
             if(number==1)
             return 1;
             return number + naturalNumbSum(number-1) ;
         }
 
         public static int sumOfNaturalNumbers(int number) {
             return number * (number + 1) / 2;
         }
 
     public static void main(String[] args) {
         // Creating Scanner object to read user input
         Scanner input = new Scanner(System.in);
 
         // Asking the user to enter a number
         System.out.println("Enter a natural number: ");
         
         int number = input.nextInt();
         if (number < 0) {
             System.out.println("Error: Negative number entered. Exiting program...");
             System.exit(0); // Program termination using System.exit method
         }
 
         int recursiveSum = naturalNumbSum(number) ;
         int formulaSum = sumOfNaturalNumbers(number) ;
 
         System.out.println("The sum of N natural numbers using recursion is: " + recursiveSum + 
                             "\nand with formula: " + formulaSum);
         
         input.close();
     }
 }
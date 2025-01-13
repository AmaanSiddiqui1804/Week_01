/*Create a program to find the factors of a number taken as user input, 
store the factors in an array and display the factors. 
Also find the sum, sum of square of factors and product of the factors 
and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them 
in an array and return the array. 
To find factors and save to array will have two loops. The first loop 
to find the count and initialize the array with the count. 
And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method 
*/ 


// Importing necessary libraries
import java.util.*;

public class Factors {

    // Method to calculate factors of a number
    public static int[] findFactors(int number) {
        // Counting the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Creating an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Adding factors to the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        // Returning the array of factors
        return factors;
    }

    // Method to calculate the sum of factors
    public static int factorSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of factors
    public static int factorProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of squares of factors
    public static int factorSumSquare(int[] factors) {
        int total = 0;
        for (int factor : factors) {
            total += Math.pow(factor, 2);
        }
        return total;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Asking the user to enter a number
        System.out.println("Enter a number to calculate its factors: ");
        int number = input.nextInt();

        // Finding the factors of the number
        int[] factors = findFactors(number);

        // Calculating sum, product, and sum of squares of factors
        int factSum = factorSum(factors);
        int factProduct = factorProduct(factors);
        int squareSum = factorSumSquare(factors);

        // Displaying results
        System.out.println("Factors are: " + Arrays.toString(factors));
        System.out.println("Sum of factors: " + factSum);
        System.out.println("Product of factors: " + factProduct);
        System.out.println("Sum of squares of factors: " + squareSum);

        // Closing the scanner
        input.close();
    }
}

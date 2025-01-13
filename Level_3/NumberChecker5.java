import java.util.*;
//Class Declaration
public class NumberChecker5 {

    // Method to find factors of a number
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int num) {
        return findFactors(num)[findFactors(num).length - 2];
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static int productOfFactors(int num) {
        int[] factors = findFactors(num);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of factors
    public static double productOfCubesOfFactors(int num) {
        int[] factors = findFactors(num);
        double product = 1.0;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        return sumOfFactors(num) - num == num;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int num) {
        return sumOfFactors(num) - num > num;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int num) {
        return sumOfFactors(num) - num < num;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int[] digits = storeDigits(num);
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == num;
    }

    // Helper method to find factorial
    public static int factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }
    // Method to store digits of a number in an array
    public static int[] storeDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }
    public static void main(String[] args) {
        int num = (int) (Math.random() *500) +100 ;
        System.out.println("Number: " + num);
        System.out.println("Factors: " + Arrays.toString(findFactors(num)));
        System.out.println("Greatest Factor: " + findGreatestFactor(num));
        System.out.println("Sum of Factors: " + sumOfFactors(num));
        System.out.println("Product of Factors: " + productOfFactors(num));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(num));
        System.out.println("Is Perfect Number: " + isPerfectNumber(num));
        System.out.println("Is Abundant Number: " + isAbundantNumber(num));
        System.out.println("Is Deficient Number: " + isDeficientNumber(num));
        System.out.println("Is Strong Number: " + isStrongNumber(num));
    }
}

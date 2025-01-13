/* Extend or Create a NumberChecker utility class and 
perform following task. Call from main() method the 
different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and 
a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number 
using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. 
A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store 
the frequency with digit in the first column and frequency in the second column.
*/
public class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits in an array
    public static int[] storeDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to find the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int num) {
        int[] digits = storeDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to find the frequency of each digit
    public static int[][] digitFrequency(int num) {
        int[] digits = storeDigits(num);
        int[][] frequency = new int[10][2]; // First column: digit, Second column: frequency
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Initialize digit
        }
        for (int digit : digits) {
            frequency[digit][1]++; // Increment frequency
        }
        return frequency;
    }

    public static void main(String[] args) {
        int num = 21; // Example number
        System.out.println("Number: " + num);
        System.out.println("Sum of Digits: " + sumOfDigits(storeDigits(num)));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(storeDigits(num)));
        System.out.println("Is Harshad Number: " + isHarshadNumber(num));

        int[][] freq = digitFrequency(num);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1] + " times");
            }
        }
    }
}

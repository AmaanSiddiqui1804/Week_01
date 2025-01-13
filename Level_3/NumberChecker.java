/*Extend or Create a NumberChecker utility class and perform following task. 
Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. 
A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​
​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the 
number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. 
Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. 
Use Integer.MAX_VALUE to initialize the variable.
*/
// Class Declaration
public class NumberChecker {

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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int num) {
        int[] digits = storeDigits(num);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int num) {
        int[] digits = storeDigits(num);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    // Method to find the largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
  
    public static void main(String[] args) {

        int num = (int) (Math.random() *9000) +1000 ;
        
        System.out.println("Number: " + num);
        System.out.println("Count of Digits: " + countDigits(num));
        System.out.println("Is Duck Number: " + isDuckNumber(num));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(num));

        int[] digits = storeDigits(num);
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largest[0]);
        System.out.println("Second Largest Digit: " + largest[1]);

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallest[0]);
        System.out.println("Second Smallest Digit: " + smallest[1]);
    }
}

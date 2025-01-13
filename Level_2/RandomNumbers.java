/* */

// Importing required libraries
import java.util.*;

// Class Declaration
public class RandomNumbers {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size]; // Array to store random numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; 
        }
        return numbers; // Returning the generated array
    }

    // Method to calculate average, minimum, and maximum of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0]; 
        int max = numbers[0]; 
        int sum = 0; 

        // Loop through the array to find min, max, and sum
        for (int num : numbers) {
            min = Math.min(min, num); 
            max = Math.max(max, num); 
            sum += num; 
        }
        //Average Calculation
        double average = (double) sum / numbers.length; 
        return new double[]{average, min, max}; 
    }

    public static void main(String[] args) {
        
        int size = 5;

        // Generating an array of random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Print the generated numbers
        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));

        // Find and store average, min, and max
        double[] result = findAverageMinMax(randomNumbers);

        // Print the calculated average, minimum, and maximum
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]); 


    }
}


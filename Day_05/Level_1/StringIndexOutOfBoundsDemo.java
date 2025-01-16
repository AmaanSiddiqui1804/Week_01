
import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String inputString) {
        // Attempting to access an index beyond the length of the input string
        System.out.println("Accessing character at index 100 (out of bounds)...");
        System.out.println(inputString.charAt(100));  // This will cause StringIndexOutOfBoundsException
    }

    
    public static void handleStringIndexOutOfBoundsException(String inputString) {
        // Using try-catch block to handle StringIndexOutOfBoundsException
        try {
            // Attempting to access an index beyond the length of the input string
            System.out.println("Accessing character at index 100 (out of bounds)...");
            System.out.println(inputString.charAt(100));  // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception and print a message
            System.out.println("StringIndexOutOfBoundsException caught: Index is out of range for the string.");
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Calling the method to generate the exception
        System.out.println("\nCalling method to generate StringIndexOutOfBoundsException...");
        generateStringIndexOutOfBoundsException(userInput);  // This will cause the exception

        // Calling the method to handle the exception
        System.out.println("Calling method to handle StringIndexOutOfBoundsException...");
        handleStringIndexOutOfBoundsException(userInput);  
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}


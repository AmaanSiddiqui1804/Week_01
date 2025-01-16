/* Write a program to demonstrate IllegalArgumentExceptionDemo
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. 
This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater 
than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException 
and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String s1) {
        
        System.out.println("Substring: " + s1.substring(5, 3));
    }

    
    public static void handleException(String s1) {
        try {
            
            System.out.println("Substring: " + s1.substring(5, 3));
        } catch (IllegalArgumentException e) {
            
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
           
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(s1); 
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }   

        System.out.println("\nHandling IllegalArgumentException:");
        handleException(s1); 

        input.close();
    }
}
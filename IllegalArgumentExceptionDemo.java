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

    // Method to generate IllegalArgumentException
    public static void exceptionDemo(String s1){
        System.out.println("Accessing substring with start index greater than end index: ");
        System.out.println(s1.substring(5, 3)) ;
    }

    // Method to show handling of IllegalArgumentException
    public static void exceptionHandling(String s1){
        try{
            System.out.println("Accessing substring with start index greater than end index: ");
            System.out.println(s1.substring(10)) ;
        }
        catch(IllegalArgumentException e){
            //Catch the exception and print a message
            System.out.println("IllegalArgumentException Handled. " + e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking the user to input a string
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        // Calling the method to generate the exception
        System.out.println("\nCalling method to generate IllegalArgumentException...");

        //Comment out below line to see try and catch block in action
        exceptionDemo(s1);  // This will cause the exception

        // Calling the method to handle the exception
        System.out.println("Calling method to handle IllegalArgumentException...");
        exceptionHandling(s1);  
        // Close the scanner to avoid resource leak
        input.close();
    }
}
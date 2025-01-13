/* Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. 
This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond 
the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/ 

import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionDemo { 

    // Method to generate StringIndexOutOfBoundsException
    public static void exceptionDemo(String s1){
        System.out.println(s1.charAt(50)) ;
    }

    // Method to show handling of StringIndexOutOfBoundsException
    public static void exceptionHandling(String s1){
        try{
            System.out.println("Accessing character at index 50 (out of bounds)...");
            System.out.println(s1.charAt(50)) ;
        }
        catch(StringIndexOutOfBoundsException e){
            //Catch the exception and print a message
            System.out.println("StringIndexOutOfBoundsException Handled. "+ e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking the user to input a string
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        // Calling the method to generate the exception
        System.out.println("\nCalling method to generate StringIndexOutOfBoundsException...");

        //Comment out below line to see try and catch block in action
        exceptionDemo(s1);  // This will cause the exception

        // Calling the method to handle the exception
        System.out.println("Calling method to handle StringIndexOutOfBoundsException...");
        exceptionHandling(s1);  
        // Close the scanner to avoid resource leak
        input.close();
    }
}
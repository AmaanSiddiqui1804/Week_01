/* Write a program to demonstrate NumberFormatExceptionDemo
Hint => 
Define a variable to take user input as a String 
Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class 
to extract the number from text. In case the text does not contain numbers the method will throw NumberFormatException 
which is a runtime exception
Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate 
a runtime exception and abruptly stop the program. 
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. 
This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the 
generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/ 

import java.util.Scanner;
public class NumberFormatExceptionDemo { 

    // Method to generate NumberFormatException
    public static void exceptionDemo(String s1){
        System.out.println("Extracting number from a string that does not have any number to demonstrate NumberFormatException");
        System.out.println(Integer.parseInt(s1)) ;
    }

    // Method to show handling of NumberFormatException
    public static void exceptionHandling(String s1){
        try{
            System.out.println("Extracting number from a string that does not have any number to demonstrate NumberFormatException");
            System.out.println(Integer.parseInt(s1)) ;
        }
        catch(NumberFormatException e){
            //Catch the exception and print a message
            System.out.println("NumberFormatException Handled. " + e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking the user to input a string
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        // Calling the method to generate the exception
        System.out.println("\nCalling method to generate NumberFormatException..."); 

        //Comment out below line to see try and catch block in action
        exceptionDemo(s1);  // This will cause the exception

        // Calling the method to handle the exception
        System.out.println("Calling method to handle NumberFormatException...");
        exceptionHandling(s1);  

        // Closeing the scanner 
        input.close();
    }
}
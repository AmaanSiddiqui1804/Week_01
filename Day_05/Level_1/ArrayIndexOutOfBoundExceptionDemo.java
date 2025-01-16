/* Write a program to demonstrate ArrayIndexOutOfBoundsException ArrayIndexOoBoundExceptionDemo
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. 
This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the 
length of the array. This will generate a runtime exception. Use the try-catch block to handle 
the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;
public class ArrayIndexOutOfBoundExceptionDemo { 

    // Method to generate ArrayIndexOutOfBoundException
    public static void exceptionDemo(String [] s1){
        System.out.println("Accessing index larger than length of Array(5): ");
        System.out.println("The eighth name is " + s1[7]) ;
    }

    // Method to show handling of IllegalArgumentException
    public static void exceptionHandling(String [] s1){
        try{
            System.out.println("Accessing index larger than length of Array(5): ");
        System.out.println("The eighth name is " + s1[7]) ;
        }
        catch(ArrayIndexOutOfBoundsException e){
            //Catch the exception and print a message
            System.out.println("ArrayIndexOutOfBoundException Handled "+ e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking the user to input a string
        System.out.print("Enter 5 names : \n");
        String [] s1 = new String[5];
        for (int i=0 ; i<s1.length ; i++){
            s1[i] = input.nextLine();
        }

        // Calling the method to generate the exception
        System.out.println("\nCalling method to generate ArrayIndexOutOfBoundException...");

        //Comment out below line to see try and catch block in action
        exceptionDemo(s1);  // This will cause the exception

        // Calling the method to handle the exception
        System.out.println("Calling method to handle ArrayIndexOutOfBoundExceptionD...");
        exceptionHandling(s1);  
        // Close the scanner to avoid resource leak
        input.close();
    }
}
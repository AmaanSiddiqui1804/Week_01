/* Write a program to demonstrate NullPointerException. 
Hint => 
Write a Method to generate the Exception. Here define the variable text and initialize it to null. 
Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. 
Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
*/


public class NullPointerExceptionDemo {
	
	
	public static void nullPointerExceptionDemonstration() {
	String text = null ;
	
	System.out.println(text.length());
	}
	
	// Method to handle NullPointerException using try-catch block
    public static void handleNullPointerException() {
       
        String text = null;

        // Using try-catch block to handle NullPointerException
        try {
            System.out.println(text.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Catch the exception and print a message
            System.out.println("NullPointerException caught: Cannot call method on a null object. "+ e.getMessage());
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Calling method to generate NullPointerException ");
        //Comment out below line to see try and catch block in action
        nullPointerExceptionDemonstration();  // This will cause the exception

        // Code to call the method that handles the exception
        System.out.println("Calling method to handle NullPointerException...");
        handleNullPointerException();  // This will handle the exception 
    }
}

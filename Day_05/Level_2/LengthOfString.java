/* Write a program to find and return the length of a string without using the length() 
method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length()
 method. The logic for this is to use the infinite loop to count each character till the charAt() 
 method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and 
displays the result
*/ 

import java.util.Scanner ;
public class LengthOfString{

    public static int findStringLength(String str) {

            int count = 0;   // Variable to keep track of the character count
            //Try and catch block to handle exception
            try {
                while (true) {
    
                    str.charAt(count);
                    count++; // Increment the count if no exception is thrown
                }
            } catch (IndexOutOfBoundsException e) {
                // When IndexOutOfBoundsException is thrown, we know we've reached the end of the string
            }
            return count; 
    }
    
    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);

    System.out.println("Enter a String to find its length: ");
    String s1 = input.next();

    System.out.println("The length of given string by user defined method is: " + findStringLength(s1));
    System.out.println("The length of given string bu .length() method: " + s1.length());
    input.close();
    }
}

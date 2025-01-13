/* Write a program to Compairing two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to Compairing two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
*/

import java.util.*;

public class StringComparision {

    // Method to Compairing two strings character by character using .charAt()
    public static boolean charComparision(String s1, String s2) {
        if (s1.length() != s2.length()) { // Check if lengths are different
            System.out.println("Length of the given inputs are not same.");
            return false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) { // Compairing each character
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to input the first string
        System.out.println("Enter the first string (s1):");
        String s1 = input.next();

        // Asking user to input the second string
        System.out.println("Enter the second string (s2):");
        String s2 = input.next();

        // Compairing strings using charAt method
        boolean ans1 = charComparision(s1, s2);

        // Compairing strings using .equals() method
        boolean ans2 = s1.equals(s2);

        // Check if both methods give the same result
        if (ans1 && ans2) {
            System.out.println("Output from .charAt() method " + "(" + ans1 + ")" + " and .equals() method is " + "(" + ans2 + ")" + " same.");
        } else {
            System.out.println("Output from .charAt() method " + "(" + ans1 + ")" + " and .equals() method is " + "(" + ans2 + ")" + " not same.");
        }
        input.close();
    }
}

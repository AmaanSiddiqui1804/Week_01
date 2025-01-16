/* Write a program to return all the characters in a string using the user-defined method,  
compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, 
compare the 2 arrays, and finally display the result
*/

import java.util.*;

public class StringCharacters {

    // Method to return characters of a string without using toCharArray()
    public static char[] getCharacters(String str) {
        int length = str.length();
        char[] characters = new char[length];
        for (int i = 0; i < length; i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to input the first string
        System.out.println("Enter a string :");
        String s1 = input.next();
        char[] userDefinedResult = getCharacters(s1);

        // Using the built-in toCharArray() method
        char[] builtInResult = s1.toCharArray();

        // Comparing the results
        boolean areArraysEqual = compareCharArrays(userDefinedResult, builtInResult);

        // Displaying the results
        System.out.println("\nCharacters using user-defined method:");
        for (char ch : userDefinedResult) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nCharacters using toCharArray() method:");
        for (char ch : builtInResult) {
            System.out.print(ch + " ");
        }

        // Displaying the comparison result
        System.out.println("\n\nAre both arrays equal? " + (areArraysEqual ? "Yes" : "No"));

    input.close();
    }
}

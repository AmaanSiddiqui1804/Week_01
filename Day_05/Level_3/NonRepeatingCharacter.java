/* Write a program to find the first non-repeating character in a string and 
show the result
Hint => 
Non-repeating character is a character that occurs only once in the string
Create a Method to find the first non-repeating character in a string using 
charAt() method and return the character. The logic used here is as follows:
Create an array to store the frequency of characters in the text. 
ASCII values of characters are used as indexes in the array to store the 
frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Loop through the text to find the first non-repeating character in the text 
by checking the frequency of each character
In the main function take user inputs, call user-defined methods, 
and displays result.
*/ 

import java.util.Scanner;
public class NonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findingNonRepeatingCharacter(String st1){

        //Trimming the string to remove leading and trailing spaces
        st1 = st1.trim();

        int len = st1.length();
        // Array to store the frequency of characters in the text
        int[] frequency = new int[256]; // 256 is used because of 256 unique ASCII characters

        // Loop through the text to find the frequency of characters in the text
        for (int i = 0; i < len; i++) {
            frequency[st1.charAt(i)]++;
        }
        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < len; i++) {
            if (frequency[st1.charAt(i)] == 1) {
                return st1.charAt(i);
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asking user for input
        System.out.println("Enter the text: ");
        String text = input.nextLine();

        //Stroring the result in a variable
        char result = findingNonRepeatingCharacter(text);
        if (result == ' ') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }
        input.close();
    }
}
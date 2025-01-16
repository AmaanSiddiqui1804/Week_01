/* Write a program to find the frequency of characters in a string using 
unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using charAt() method 
and return them as 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return 
the characters and their frequencies in a 2D array. 
The logic used here is as follows:
Create an array to store the frequency of characters in the text. 
ASCII values of characters are used as indexes in the array to store the 
frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.
*/

import java.util.Scanner;
public class FrequencyUniqueCharacters {

    // Method to Find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String st1){
        st1 = st1.trim();
        int len = st1.length();

        // Array to store the unique characters in the text
        char[] uniqueCharacters = new char[len];
        int index = 0;

        // duel for loops to find the unique characters in the text
        for (int i = 0; i < len; i++) {
            char ch = st1.charAt(i);
            int j;
            for (j = 0; j < i; j++) {
                if (ch == st1.charAt(j)) {
                    break;
                }
            }
            if (i == j) {
                uniqueCharacters[index++] = ch;
            }
        }
        return uniqueCharacters;
    }

    // Method to find the frequency of characters in a string
    public static int[][] findFrequencyOfCharacters(String st1){
        st1 = st1.trim();
        int len = st1.length();

        // Array to store the frequency of characters in the text
        int[] frequency = new int[256]; // 256 is used because of 256 unique ASCII characters

        // Loop through the text to find the frequency of characters in the text
        for (int i = 0; i < len; i++) {
            frequency[st1.charAt(i)]++;
        }
        // Call the uniqueCharacters() method to find the unique characters in the text
        char[] uniqueChars = uniqueCharacters(st1);
        int[][] frequencyArray = new int[uniqueChars.length][2];
        int index = 0;

        // Loop through the unique characters and store the characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            frequencyArray[index][0] = uniqueChars[i];
            frequencyArray[index][1] = frequency[uniqueChars[i]];
            index++;
        }
        return frequencyArray;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter the text: ");
        String s1 = input.nextLine();

        // Storing the result in a variable
        int[][] result = findFrequencyOfCharacters(s1);

        // Displaying the result
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            if (result[i][0] == 0) {
                break;
            }
            System.out.println((char)result[i][0] + "\t\t" + result[i][1]);
        }
        input.close();
    }
}
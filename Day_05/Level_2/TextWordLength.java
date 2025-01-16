/* Write a program to split the text into words and return the words along with their 
lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the 
String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its 
corresponding length. 
Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. 
During display make sure to convert the length value from String to Integer and then display
*/

import java.util.*;

public class TextWordLength {

    // Method to split the text into words using charAt()
    public static String[] splittingString(String s1) {
        String currentWord = "";
        int wordCount = 0;
        int n = s1.length();

        // First pass: Count the number of words
        for (int i = 0; i < n; i++) {
            char ch = s1.charAt(i);
            if (ch == ' ' || i == n - 1) {
                if (i == n - 1 && ch != ' ') {
                    currentWord += ch; // Append last character to the word
                }
                if (!currentWord.isEmpty()) {
                    wordCount++;
                    currentWord = ""; // Reset the word
                }
            } else {
                currentWord += ch; // Append character to the word
            }
        }

        // Create the array to store words
        String[] resultant = new String[wordCount];
        currentWord = "";
        int index = 0;

        // Second pass: Populate the words into the array
        for (int i = 0; i < n; i++) {
            char ch = s1.charAt(i);
            if (ch == ' ' || i == n - 1) {
                if (i == n - 1 && ch != ' ') {
                    currentWord += ch; // Append last character to the word
                }
                if (!currentWord.isEmpty()) {
                    resultant[index++] = currentWord;
                    currentWord = ""; // Reset the word
                }
            } else {
                currentWord += ch; // Append character to the word
            }
        }

        return resultant;
    }

    // Method to find the length of a string without using length()
    public static int findStringLength(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }

    // Method to get a 2D array of words and their lengths
    public static String[][] getWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to input the string
        System.out.println("Enter a sentence to calculate its word length:");
        String s1 = input.nextLine();

        // Split the string into words and calculate lengths
        String[] words = splittingString(s1);
        String[][] wordLengthArray = getWordLengthArray(words);

        // Display the result in a tabular format
        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t" + Integer.parseInt(wordLengthArray[i][1]));
        }

        input.close();
    }
}
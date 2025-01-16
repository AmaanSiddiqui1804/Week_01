/* Write a program to find the frequency of characters in a string using nested loops and display the result
Hint => 
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
Loops to Find the frequency of each character in the text and store the result in an frequency array. For this use Nested Loop with Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
Create an 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/

import java.util.Scanner;
public class FrequencyOfCharacters2 {

    // Method to find the frequency of characters in a string
    public static int[] findFrequencyOfCharacters(String st1){
        st1 = st1.trim();
        int len = st1.length();
        // Array to store the frequency of characters in the text
        int[] frequency = new int[len];
        char[] characters = st1.toCharArray();
        // Loop through the text to find the frequency of characters in the text
        for (int i = 0; i < len; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter the text: ");
        String text = input.nextLine();

        // Storing the result in a variable
        int[] result = findFrequencyOfCharacters(text);
        
        // Displaying the result
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            if (text.charAt(i) != ' ' && text.charAt(i) != '0') {
                System.out.println(text.charAt(i) + "\t\t" + result[i]);
            }
        }
        input.close();
    }
}
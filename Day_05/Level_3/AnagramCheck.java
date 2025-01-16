/* Write a program to check if two texts are anagrams and display the result
Hint => 
Anagram is a word or phrase formed by rearranging the same letters to form 
different words or phrase,
Write a method to check if two texts are anagrams. 
The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result.
*/

import java.util.Scanner;
public class AnagramCheck {
    
    // Method to check if two texts are anagrams
    public static boolean checkAnagram(String st1, String st2){
        st1 = st1.trim();
        st2 = st2.trim();
        int len1 = st1.length();
        int len2 = st2.length();

        // Check if the lengths of the two texts are equal
        if (len1 != len2) {
            return false;
        }
        // Array to store the frequency of characters in the strings for the two text
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Find the frequency of characters in the two texts
        for (int i = 0; i < len1; i++) {
            frequency1[st1.charAt(i)]++;
            frequency2[st2.charAt(i)]++;
        }
        // Compare the frequency of characters in the two texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter the first text: ");
        String st1 = input.nextLine();

        System.out.println("Enter the second text: ");
        String st2 = input.nextLine();

        // Storing the result in a variable
        boolean result = checkAnagram(st1, st2);

        // Displaying the result
        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }
        input.close();
    }
}
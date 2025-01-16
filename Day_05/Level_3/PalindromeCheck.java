/* Write a program to to check if a text is palindrome and display the result
Hint => 
Palindrome is a word, phrase, number, or other sequence of characters that reads
 the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the 
string to determine the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of 
the string. If the characters are not equal, return false

Logic 2: Write a recursive method to compare the characters from the start and 
end of the text passed as parameters using recursion. 
The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, 
then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index 
incremented by 1 and the end index

Logic 3: Write a Method to compare the characters from the start and end of the text using  character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using charAt() method and return the reversal array.
Create a character array using String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do Palindrome check 
Finally in the main method do palindrome check using the three logic and display result
*/

import java.util.Scanner;
public class PalindromeCheck {
    
                            //Logic 1

    // Method to compare the characters from the start and end of the string (2 pointer approach)
    public static boolean isPalindrome(String st1){
        st1 = st1.trim();
        int start = 0;
        int end = st1.length() - 1;

        // Loop through the text and compare the characters from the start and the end of the string
        while (start < end) {
            if (st1.charAt(start) != st1.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

                            //Logic 2

    // Recursive method to compare the characters from the start and end of the text
    public static boolean isPalindromeRecursive(String st1, int start, int end){
        if (start >= end) {
            return true;
        }
        if (st1.charAt(start) != st1.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(st1, start + 1, end - 1);
    }
    
                            //Logic 3       

    // Method to reverse a string
    public static char[] reverseString(String st1){
        char[] characters = st1.toCharArray();
        char[] reverse = new char[characters.length];
        for (int i = 0; i < characters.length; i++) {
            reverse[i] = characters[characters.length - 1 - i];
        }
        return reverse;
    }

    // Method to compare the characters from the start and end of the text using character arrays
    public static boolean isPalindromeUsingArrays(String st1){
        st1 = st1.trim();
        char[] characters = st1.toCharArray();
        char[] reverse = reverseString(st1);

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter a word to check if its a palindrome: ");
        String word = input.next();

        // Storing the result in a variables
        boolean result = isPalindrome(word); //2 pointer approach result

        boolean resultRecursive = isPalindromeRecursive(word, 0, word.length() - 1); //Recursive approach result

        boolean resultUsingArrays = isPalindromeUsingArrays(word); // Result using character arrays

        // Displaying the result of the 3 logics
        System.out.println("Word: " + word + " palindrome: " + result);

        if (result) {
            System.out.println("The word is a palindrome using Logic 1 (2 pointer approach).");
        }
        else {
            System.out.println("The word is not a palindrome using Logic 1 (2 pointer approach).");
        }

        if (resultRecursive) {
            System.out.println("The word is a palindrome using Logic 2 (Recursive approach).");
        }
        else {
            System.out.println("The word is not a palindrome using Logic 2 (Recursive approach).");
        }

        if (resultUsingArrays) {
            System.out.println("The word is a palindrome using Logic 3 (Character arrays).");
        }
        else {
            System.out.println("The word is not a palindrome using Logic 3 (Character arrays).");
        }
        input.close();
    }
}
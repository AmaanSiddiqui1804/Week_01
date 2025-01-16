/* Write a program to split the text into words, compare the result with the split() 
method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String 
built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces 
for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined 
method to compare the two string arrays and display the result
*/

import java.util.Scanner ;
public class TextToWords{

    public static int findStringLength (String str) {
        int count = 0;  
        
        // Using a for-each loop to iterate over each character of the string
        for (char ch : str.toCharArray()) {
            count++;  
        }
        
        return count;  
    }

    public static String [] splitText(String s1){
		
		//Calling method to find the length of String
		
		int length = findStringLength(s1);
		int wordCount = 0 ; //to count the number of words
		boolean inWord = false;
		
		for (int i = 0; i < length; i++) {
            char ch = s1.charAt(i);
            if (ch != ' ' && !inWord) {
                wordCount++; // New word starts
                inWord = true;
            } else if (ch == ' ') {
                inWord = false; // Word ends
            }
        }
		
		// Creating an array to store words
        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        // Extract words using spaces
        for (int i = 0; i < length; i++) {
            char ch = s1.charAt(i);
            if (ch != ' ') {
                word += ch; // Append character to the current word
            } else if (!word.isEmpty()) {
                words[index++] = word; // Add the word to the array
                word = ""; // Reset for the next word
            }
        }

        // Add the last word (if any)
        if (!word.isEmpty()) {
            words[index] = word;
        }

        return words;
    }
	// Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // Lengths are different
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false; // Mismatch in words
            }
        }
        return true; // Arrays match
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a sentence:");
        String s1 = input.nextLine();

        // Using user-defined method to split the text
        String[] wordsByCustomMethod = splitText(s1);

        // Using built-in split() method
        String[] wordsBySplitMethod = s1.split(" ");

        // Comparing the results
        boolean areResultsEqual = compareArrays(wordsByCustomMethod, wordsBySplitMethod);

        // Displaying the results
        System.out.println("\nWords by custom method:");
        for (String word : wordsByCustomMethod) {
            System.out.println(word);
        }

        System.out.println("\nWords by built-in split() method:");
        for (String word : wordsBySplitMethod) {
            System.out.println(word);
        }

        // Displaying result
        System.out.println("\nAre the results equal? " + areResultsEqual);

        input.close();
    }
}
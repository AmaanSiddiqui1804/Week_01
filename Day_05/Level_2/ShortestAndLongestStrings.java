/* Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in 
split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. 
Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and 
longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/

import java.util.Scanner ;
public class ShortestAndLongestStrings{

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
    //Method to find word length and return 2D string

    public static String[][] getWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengthArray;
    }
    // Method to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            if (currentLength < shortestLength) {
                shortestWord = wordLengthArray[i][0];
                shortestLength = currentLength;
            }
            if (currentLength > longestLength) {
                longestWord = wordLengthArray[i][0];
                longestLength = currentLength;
            }
        }

        return new String[]{shortestWord, longestWord};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a sentence:");
        String s1 = input.nextLine();

        // Calling mrthod to split the text into words
        String[] words = splitText(s1);

        // Method to map words to their lengths
        String[][] wordLengthArray = getWordLengthArray(words);

        // Method to find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordLengthArray);

        // Displaying the results
        System.out.println("\nWord\tLength");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }

        System.out.println("\nShortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);

        input.close();
    }
}
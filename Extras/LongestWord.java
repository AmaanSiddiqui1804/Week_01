/* Find the Longest Word in a Sentence
Problem:
Write a Java program that takes a sentence as input and returns the longest word in the
sentence.*/ 

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st1 = sc.nextLine();
        System.out.println("Longest Word: " + findLongestWord(st1));
        sc.close();
    }

    //method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        sentence = sentence.trim();
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }
}

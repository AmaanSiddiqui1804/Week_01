/* 4. Remove Duplicates from a String
Problem:
Write a Java program to remove all duplicate characters from a given string and return
the modified string*/

import java.util.Scanner;
public class DuplicateRemove {


    // Method to remove duplicate characters in a string
    public static String removeDuplicate(String st1){
        st1 = st1.trim();
        int len = st1.length();

        String str = "";
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
                str += ch;
            }
        }
        return str;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //Taking user input
        System.out.println("Enter a string to to remove duplicate characters: ");
        String st1 = input.nextLine();

        //Calling the method to find unique characters
        String str = removeDuplicate(st1);
        
        //Displaying the unique characters
        System.out.println("Unique String: "+ str);

        //Closing the scanner
        input.close();
    }
}
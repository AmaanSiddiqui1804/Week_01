/* Write a Java program that accepts two strings from the user and checks if the two
strings are anagrams of each other (i.e., whether they contain the same characters in any
order).*/

import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheck {

    public static boolean checkAnagram(String str1, String str2) {
        //Removing spaces from the strings
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        //Checking if the strings are of equal length
        if (str1.length() != str2.length()) {
            return false;
        } else {
            //Converting the strings to lowercase
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            //Converting the strings to character arrays
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            //Sorting the character arrays
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            //Checking if the sorted arrays are equal
            //Arrays.equals() method compares the two arrays and returns true if they are equal
            return Arrays.equals(str1Array, str2Array);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        //Checking if the strings are anagrams
        if (checkAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        //
        sc.close();
    }
    
}

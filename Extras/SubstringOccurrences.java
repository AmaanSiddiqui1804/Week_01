/* Find Substring Occurrences
Problem:
Write a Java program to count how many times a given 
substring occurs in a string.*/

import java.util.Scanner;
public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();
        System.out.println("Enter the substring:");
        String substring = sc.nextLine();
        System.out.println("Occurrences: " + countOccurrences(mainString, substring));
        sc.close();
    }

    public static int countOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }
}

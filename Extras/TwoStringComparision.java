/* Compare Two Strings
Problem:
Write a Java program to compare two strings lexicographically (dictionary order) without
using built-in compare methods.
Example Input:
String 1: "apple"
String 2: "banana"
Expected Output:
"apple" comes before "banana" in lexicographical order*/

import java.util.Scanner;

public class TwoStringComparision {

    public static String compareStrings(String string1, String string2) {

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        
        int len = Math.min(string1.length(), string2.length());
        for (int i = 0; i < len; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return string1.charAt(i) < string2.charAt(i)
                        ? string1 + " comes before " + string2
                        : string2 + " comes before " + string1;
            }
        }
        return string1.length() < string2.length()
                ? string1 + " comes before " + string2
                : string2 + " comes before " + string1;
    }
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String string1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String string2 = sc.nextLine();
        System.out.println(compareStrings(string1, string2));

        sc.close();
    }
}

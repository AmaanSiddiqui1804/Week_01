/* Find the Most Frequent Character
Problem:
Write a Java program to find the most frequent character in a string.
Example Input:
String: "success"
Expected Output:
Most Frequent Character: 's'*/

import java.util.Scanner;

public class MostFrequenCharacter {

    // Method to find the most frequent character in a string
    public static void frequentCharacter(String str) {
        int[] freq = new int[str.length()];
        char[] string = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        int max = 0;
        char ch = ' ';
        for (int i = 0; i < freq.length; i++) {
            if (string[i] != '0' && freq[i] > max) {
                max = freq[i];
                ch = string[i];
            }
        }
        System.out.println("Most Frequent Character: " + ch);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        //Calling the method to find the most frequent character
        frequentCharacter(str);

        sc.close();
    }
    
}

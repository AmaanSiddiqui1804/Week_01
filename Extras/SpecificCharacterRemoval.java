/* Remove a Specific Character from a String
Problem:
Write a Java program to remove all occurrences of a specific character 
from a string.
*/

import java.util.Scanner;

public class SpecificCharacterRemoval {

    // Method to remove a specific character from a string
    public static String removeCharacter(String str, char ch) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                newString += str.charAt(i);
            }
        }
        System.out.println("New String: " + newString);
        return newString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.println("Enter a string:");  
        String str = sc.nextLine();
        System.out.println("Enter the character to remove:");
        char ch = sc.next().charAt(0); //Using .charAt to take only the first character 
    
        //Calling the method to remove the character
        removeCharacter(str, ch);

        sc.close();
    }
    
}

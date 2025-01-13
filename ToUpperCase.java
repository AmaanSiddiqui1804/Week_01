/* Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. 
Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 
so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the Uppercase Text and compare the two strings using the 
user-defined method. And finally display the result
*/

import java.util.Scanner;
public class ToUpperCase{ 

    public static String toUpper(String s1) {
        String result = "";

        // Going through each character in the string
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            // Checking and converting lowercase to UPPERCASE
            if (ch >= 'a' && ch <= 'z') {
                
                ch = (char) (ch - 32);
            }

            // Adding the character to the result string
            result = result + ch;
        }
        return result;
    }

    public static boolean stringComparision(String str1 , String str2){
        
        for (int i = 0; i < str1.length(); i++) {
            
        if(str1.charAt(i)!= str2.charAt(i)){
            return false;
        }
        } return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to input the string
        System.out.println("Enter a lowercase string to convert it to UPPERCASE: \n");
        String s1 = input.nextLine();

        String str1 = toUpper(s1);
        String str2 = s1.toUpperCase() ;

        boolean isEqual = stringComparision(str1, str2);
        System.out.println("String in UPPERCASE by user defined method: " + str1 + 
                            "\nString in UPPERCASE by built in method: " + str2);
        System.out.println("Are both results equal? " + (isEqual ? "Yes" : "No"));
        input.close();
    }
}
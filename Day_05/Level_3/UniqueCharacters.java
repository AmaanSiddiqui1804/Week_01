/* Find unique characters in a string using charAt() method and 
display the result
Hint => 
Create a Method to find the length of the text without using the 
String method length()
Create a method to Find unique characters in a string using charAt() 
method and return them as 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. 
The size is the length of the text
Loops to Find the unique characters in the text. 
Find the unique characters in the text using a nested loop. An outer loop 
iterates through each character and an inner loop checks if the character 
is unique by comparing it with the previous characters. 
If the character is unique, it is stored in the result array
Create a new array to store the unique characters 
Finally, the main function takes user inputs, calls the user-defined methods, 
and displays the result.
*/

import java.util.Scanner;
public class UniqueCharacters {

    // Method to find the length of the text without using the String method length()
    public static int findLength(String st1){
        st1 = st1.trim();
        int len = 0; 

        // Using try and catch block to find the length of the string
        // here whenever the string index out of bound exception occurs, 
        // the length of the string is returned
        try {
            while (true) {
                st1.charAt(len);
                len++;  
            }
        }
        catch(StringIndexOutOfBoundsException e) {
            return len;
        }
    }

    // Method to Find unique characters in a string using charAt() method 
    public static char[] findUniqueCharacters(String st1){
        st1 = st1.trim();
        int len = findLength(st1);
        //Array to store the unique characters in the text
        char[] uniqueCharacters = new char[len];
        int index = 0;

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
                uniqueCharacters[index++] = ch;
            }
        }
        return uniqueCharacters;
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //Taking user input
        System.out.println("Enter a string to find unique characters: ");
        String st1 = input.nextLine();

        //Calling the method to find unique characters
        char[] uniqueCharacters = findUniqueCharacters(st1);
        
        //Displaying the unique characters
        System.out.println("Unique Characters in the string are: ");
        for (int i = 0; i < uniqueCharacters.length; i++) {
            if (uniqueCharacters[i] == '\u0000') {
                break;
            }
            System.out.print(uniqueCharacters[i] + " ");
        }

        //Closing the scanner
        input.close();
    }
}
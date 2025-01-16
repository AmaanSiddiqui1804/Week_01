/* Write a program to find vowels and consonants in a string and display the count of  
Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. 
The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally 
return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

import java.util.Scanner;
public class VowelsAndConsonants {
    public static int [] checkVowelConsonant(String s1){

        //Declaring variables to store vowel and consonat count
        int vowelCount = 0 , consonantCount = 0;

        /*This for loop will first convert the uppercase letters to lowercase one by one and 
         at the same time will check if its a vowel or consonant and increment the variables value */
        
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i) ;

            if(ch>= 'A' && ch<='Z'){
                ch = (char) (ch+32);
            }
            if(ch>='a' && ch<='z'){

                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowelCount++;
                }
                else {
                    consonantCount++;
                }
            } 
        }
        //Returning the vowel and consonant ocunt
        return new int []{vowelCount , consonantCount};
    }

    public static void main(String[] args) {
        
        //Creating scanner class object
        Scanner input = new Scanner(System.in) ;

        //Taking input from the user
        System.out.println("Enter a string to find vowel and consonant count in it ");
        String st1 = input.nextLine();

        //Calling method to find the count of vowels and consonants and storing it in array.
        int [] count = checkVowelConsonant(st1);

        //Printing the results
        System.out.println("Number of Vowels in given string: " + count[0]);
        System.out.println("Number of Consonants in given string: " + count[1]);

        input.close();
    }   
}

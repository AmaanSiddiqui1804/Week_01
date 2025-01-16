/* Write a program to find the frequency of characters in a string using charAt() 
method and display the result
Hint => 
Create a method to find the frequency of characters in a string using charAt() 
method and return the characters and their frequencies in a 2D array. The logic 
used here is as follows:
Create an array to store the frequency of characters in the text. 
ASCII values of characters are used as indexes in the array to store the 
frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result. 
*/

import java.util.Scanner;
public class FrequencyOfCharacters {

    // Method to find the frequency of characters in a string
    public static int[][] findFrequencyOfCharacters(String st1){
        st1 = st1.trim();
        int len = st1.length();
        // Array to store the frequency of characters in the text
        int[] frequency = new int[256]; // 256 is used because of 256 unique ASCII characters

        // Loop through the text to find the frequency of characters in the text
        for (int i = 0; i < len; i++) {
            frequency[st1.charAt(i)]++;
        }
        // Array to store the characters and their frequencies
        int[][] frequencyArray = new int[len][2];
        int index = 0;

        // Loop through the characters in the text and store the characters and their frequencies
        for (int i = 0; i < len; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (st1.charAt(i) == st1.charAt(j)) {
                    break;
                }
            }
            if (i == j) {
                frequencyArray[index][0] = st1.charAt(i);
                frequencyArray[index][1] = frequency[st1.charAt(i)];
                index++;
            }
        }
        return frequencyArray;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter the text: ");
        String text = input.nextLine();

        // Storing the result in a variable
        int[][] result = findFrequencyOfCharacters(text);

        // Displaying the result
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            if (result[i][0] == 0) {
                break;
            }
            System.out.println((char)result[i][0] + "\t\t" + result[i][1]);
        }
        input.close();
    }
}
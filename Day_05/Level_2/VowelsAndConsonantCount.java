import java.util.Scanner;

public class VowelsAndConsonantCount {

    // Method to classify characters as Vowel, Consonant, or Not a Letter and return the result in a 2D array
    public static String[][] classifyCharacters(String s1) {
        // Calculate the number of letters to determine the size of the array
        int letterCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                letterCount++;
            }
        }

        // Initialize the 2D array
        String[][] result = new String[letterCount][2];
        int index = 0;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            }

            if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
                result[index][0] = String.valueOf(ch); // Store the character
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    result[index][1] = "Vowel"; // Classify as vowel
                } else {
                    result[index][1] = "Consonant"; // Classify as consonant
                }
                index++;
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void display2DArray(String[][] array) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + "\t\t" + array[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string to find and classify vowels and consonants:");
        String s1 = input.nextLine();

        // Get the classification result in a 2D array
        String[][] result = classifyCharacters(s1);

        // Display the result in a tabular format
        display2DArray(result);

        input.close();
    }
}

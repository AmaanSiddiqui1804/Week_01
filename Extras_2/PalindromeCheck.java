import java.util.Scanner;
public class PalindromeCheck {

    // Method to compare the characters from the start and end of the string (2 pointer approach)
    public static boolean isPalindrome(String st1){
        st1 = st1.trim();
        int start = 0;
        int end = st1.length() - 1;

        // Loop through the text and compare the characters from the start and the end of the string
        while (start < end) {
            if (st1.charAt(start) != st1.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter a word to check if its a palindrome: ");
        String word = input.next();

        // Storing the result in a variables
        boolean result = isPalindrome(word); //2 pointer approach result

        // Displaying the result 
        System.out.println("Word: " + word + " palindrome: " + result);

        if (result) {
            System.out.println("The word is a palindrome using Logic 1 (2 pointer approach).");
        }
        else {
            System.out.println("The word is not a palindrome using Logic 1 (2 pointer approach).");
        }
        input.close();
    }
}
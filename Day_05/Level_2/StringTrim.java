import java.util.Scanner;

public class StringTrim {

    // Method to trim leading and trailing spaces from a string using charAt()
    public static int[] findTrimIndexes(String str) {
        int start = 0, end = str.length() - 1;

        // Trim leading spaces
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring from a string using charAt()
    public static String substringCreation(String s1, int start, int end) {

        String result = "";
        //StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++) {
            result += s1.charAt(i);
        }

        return result ;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string with leading and trailing spaces:");
        String s1 = input.nextLine();

        // Use the custom trim method
        int[] trimIndexes = findTrimIndexes(s1);
        String trimmedByCustomMethod;
        if (trimIndexes[0] <= trimIndexes[1]) {
            trimmedByCustomMethod = substringCreation(s1, trimIndexes[0], trimIndexes[1]);
        } 
        else {
            trimmedByCustomMethod = ""; // All spaces, return empty string
        }

        // Use the built-in trim method
        String trimmedByBuiltInMethod = s1.trim();

        // Comparing the two results
        boolean isEqual = compareStrings(trimmedByCustomMethod, trimmedByBuiltInMethod);

        // Displaying results
        System.out.println("\nString after trimming using custom method:");
        System.out.println("[" + trimmedByCustomMethod + "]");

        System.out.println("\nString after trimming using built-in trim():");
        System.out.println("[" + trimmedByBuiltInMethod + "]");

        System.out.println("\nAre both results the same? " + (isEqual ? "Yes" : "No"));

        input.close();
    }
}


/*Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
*/

import java.util.Scanner;
//class declaration
public class FriendComparison {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return names[youngestIndex];
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return names[tallestIndex];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store names, ages, and heights of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input for age and height of the friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Find and display the youngest friend
        String youngest = findYoungest(names, ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = findTallest(names, heights);
        System.out.println("The tallest friend is: " + tallest);

        input.close(); // Close the Scanner
    }
}

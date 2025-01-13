/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
*/
// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Class declaration
public class YoungestFriend{
    // Main method declaration
    public static void main(String[] args) {

        // Creating Scanner class object to read input from the user
        Scanner input = new Scanner(System.in);

		int [] ages = new int [3];
        System.out.println("Enter age of Amar, Akbar, Anthony: ");
		for(int i=0 ; i<ages.length ; i++){
			ages[i] = input.nextInt();
		}
		

        double [] heights = new double[3];
		
		System.out.println("Enter height of Amar, Akbar, Anthony: ");
		for(int i=0 ; i<heights.length ; i++){
			heights[i] = input.nextInt();
		}
		
		int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        String youngest = "";
        String tallest = "";

        if (youngestIndex == 0) {
            youngest = "Amar";
        } else if (youngestIndex == 1) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        if (tallestIndex == 0) {
            tallest = "Amar";
        } else if (tallestIndex == 1) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);
            

        // Closing the scanner object
        input.close();
    }
} 

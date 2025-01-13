/* Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team 
Write the method to find the tallest height of the players on the football team
Finally display the results
*/ 


import java.util.Random;

public class FootballTeam {
    // Method to calculate the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        // Display results
        System.out.println("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\nShortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}
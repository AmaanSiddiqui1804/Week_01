import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaring low and high
        int low = 1, high = 100;
        System.out.println("Think of a number between 1 and 100, and I will guess it.");
        
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'low', 'high', or 'correct')");
            String feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hurray! The computer guessed your number: " + guess);
                break;
            } else {
                System.out.println("Invalid feedback. Please enter 'low', 'high', or 'correct'.");
            }
        }
        sc.close();
    }

    //Method to generate a random number
    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }
}


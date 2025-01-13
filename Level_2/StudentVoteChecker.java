/* Write a program to take user input for the age of all 10 students in a class and 
check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) 
which takes in age as a parameter and returns true or false
Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. 
For valid age check for age is 18 or above return true; else return false;
In the main function define an array of 10 integer elements, loop through the array by take user input 
for the student's age, call canStudentVote() and display the result
*/

// importing necessary package 
import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            // Negative age is invalid
            return false;
        } else if (age >= 18) {
            // Age 18 or above is eligible to vote
            return true;
        } else {
            // Age below 18 is not eligible to vote
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentAges = new int[10]; // Array to store ages of 10 students
        StudentVoteChecker voteChecker = new StudentVoteChecker(); // Create an object of StudentVoteChecker

        for (int i = 0; i < studentAges.length; i++) {
            // Take input for each student's age
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();

            // Call the canStudentVote method and display the result
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                if (studentAges[i] < 0) {
                    System.out.println("Student " + (i + 1) + " has entered an invalid age (negative number).");
                } else {
                    System.out.println("Student " + (i + 1) + " is not eligible to vote.");
                }
            }
        }

        sc.close(); // Close the Scanner
    }
}

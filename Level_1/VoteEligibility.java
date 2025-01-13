/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote.
*/

// Import the Scanner class from the java.util package
import java.util.Scanner;

//Class declaration
public class VoteEligibility{
    //Main method declaration
	public static void main(String[] args){
	    // Create a Scanner object to read input from the user
	    Scanner input = new Scanner(System.in);
	    
	    int [] age = new int[10];
	    //Asking user for input 
	    System.out.println("Enter the age of 10 students in a single line: ");
	    for(int i=0 ; i<age.length ; i++){
	        age[i] = input.nextInt();
	        
	        //Error handling of age less than zero
	        if (age[i] < 0) {
            System.err.println("Invalid Age Entered.");
            System.exit(0);
            }
	    }
	    
		for(int i=0 ; i<age.length ; i++){
		    if(age[i] >= 18){
		        System.out.print("The student with the age " + age[i] + " can vote.\n");
		    }
		    else{
		        System.out.print("The student with the age " + age[i] + " can not vote.\n");
		    }
        }
        //Closing scanner class
		input.close();
	}
}

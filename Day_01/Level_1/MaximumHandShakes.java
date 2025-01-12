/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes. */

import java.util.Scanner;
	public class MaximumHandShakes {

    public static void main(String[] args) {
	    
		// Creating a Scanner object to take input from the user
		Scanner input= new Scanner(System.in); 
		
		//Getting number of students from user
		System.out.println("Enter number of students");
		int numberOfStudents = input.nextInt();
		
		//Calculating number of handshakes
		
		int totalHandShakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.println("Total possible handshakes: " + totalHandShakes);

    }   
}
/* Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it       
*/



//importing Scanner class for taking input
import java.util.Scanner;
//class declaration
public class YoungestFriend{
	//Main method declaration
	public static void main (String [] args){
	
		// Creating Scanner instance for user input
		Scanner input = new Scanner(System.in);
		
		//Asking user for input 
		System.out.print("Enter age of Amar ");
		int ageAmar = input.nextInt();
		
		System.out.print("Enter the height of Amar ");
		int heightAmar = input.nextInt();
		
		System.out.print("Enter the age of Akbar ");
		int ageAkbar = input.nextInt();
		
		System.out.print("Enter the height of Akbar ");
		int heightAkbar = input.nextInt();
		
		System.out.print("Enter the age of Anthony ");
		int ageAnthony = input.nextInt();
		
		System.out.print("Enter the height of Anthony ");
		int heightAnthony = input.nextInt();

		int youngestAge = ageAmar;
		String ans1 = "Amar";
		if (ageAkbar < youngestAge){
			youngestAge = ageAkbar; 
			ans1 = "Akbar";
		} 
		if(ageAnthony < youngestAge){ 
			youngestAge = ageAnthony; 
			ans1 = "Anthony";
		}
		String ans2 = "Amar";
		int tallestHeight = heightAmar;
		if (heightAkbar > tallestHeight){ 
			tallestHeight = heightAkbar; 
			ans2="Akbar";
		}
		if(heightAnthony > tallestHeight){
			tallestHeight = heightAnthony; 
			ans2 = "Anthony";
		}

		System.out.println("The youngest friend is  " + ans1);
		System.out.println("The tallest friend is  " + ans2);
	//Closing scanner class
		input.close();
    }
}




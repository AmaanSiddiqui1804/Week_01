/* An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km  
*/ 

import java.util.Scanner;
public class TriangularParkRoundCalculation{
	public static void main(String[] args){
		//Declaring variables for triangular park sides
		double side1, side2, side3;
		
		//Declaring scanner class for taking input 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of side 1 of triangular park in meters: ");
		
		// Taking length of side 1 from user
		side1 = input.nextDouble();
		
		System.out.print("Enter the length of side 2 of triangular park in meters: ");
		
		// Taking length of side 2 from user
		side2 = input.nextDouble();
		
		System.out.print("Enter the length of side 3 of triangular park in meters: ");
		
		// Taking length of side 3 from user
		side3 = input.nextDouble();
		
		// Calculation of total distance athlete would cover after covering one round (Perimeter of triangle)
		double totalDistance = side1 + side2 + side3 ; 
		
		// Converting 5Km to meters
		double athleteRunningDistance = 5000;

        // Calculating the total number of rounds required to complete 5 km
        double rounds = athleteRunningDistance / totalDistance;

        // Displaying the result
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.\n", rounds);

		//close the scanner input
		input.close();
		
	}
}
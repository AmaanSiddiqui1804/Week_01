/* Rewrite the Sample Program 2 with user inputs
Hint => 
Create variables and take user inputs for name, fromCity, viaCity, toCity
Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
Create Variables and take time taken 
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPercent
O/P => The results of Int Operations are ___, ___, and ___
*/

import java.util.*;
// Create TravelComputation Class to compute the Distance and Travel Time
class TravelComputation {

    public static void main(String[] args) {
        // Creating Scanner class instance for user input
        Scanner input = new Scanner(System.in);

        // Asking user for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Asking user for city details
        System.out.print("Enter the starting city (fromCity): ");
        String fromCity = input.nextLine();
        System.out.print("Enter the intermediate city (viaCity): ");
        String viaCity = input.nextLine();
        System.out.print("Enter the destination city (toCity): ");
        String toCity = input.nextLine();

        // Asking user for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double distanceFromToVia = input.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double distanceViaToFinalCity = input.nextDouble();

        // Asking user for time taken in travelling
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        float timeFromToVia = input.nextFloat();
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: ");
        float timeViaToFinalCity = input.nextFloat();

        // Calculation of total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        float totalTime = timeFromToVia + timeViaToFinalCity;


        // Printing the results
        System.out.println("\nTravel Details:");
        System.out.println("The total distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance +
                " miles and the total time taken is " + totalTime + " minutes.");

    }
}

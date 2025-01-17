/* Prime Number Checker:
○ Create a program that checks whether a given number is a prime number. 
○ The program should use a separate function to perform the prime check and
return the result.*/

import java.util.Scanner;

public class PrimeNumberCheck {

    //Method to check for prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        //Taking user input
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Is the given number prime: ? " + isPrime(num));
        
        sc.close();
    }
}

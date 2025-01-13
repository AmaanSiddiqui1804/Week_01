/* Write a program to generate a six-digit OTP number using Math.random() method. 
Validate the numbers are unique by generating the OTP number 10 times and ensuring 
all the 10 OTPs are not the same
Hint => 
Write a method to Generate a 6-digit OTP number using Math.random() 
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. 
If unique return true else return false
*/

public class OtpGenerator {

    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store generated OTPs

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP(); // Generate and store OTP
        }

        // Print all generated OTPs
        System.out.println("Generated OTPs: ");
        for (int otp : otps) {
            System.out.println(otp); // Print each OTP
        }

        // Check if all OTPs are unique
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000); // Generates a 6-digit number
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // No duplicates found
    }
}

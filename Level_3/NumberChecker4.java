public class NumberChecker4 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int num) {
        int[] digits = storeDigits(num);
        int sum = 0, product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    // Method to store digits of a number in an array
    public static int[] storeDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static void main(String[] args) {
        int num = (int) (Math.random() *9000) +1000 ;
        System.out.println("Number: " + num);
        System.out.println("Is Prime: " + isPrime(num));
        System.out.println("Is Neon Number: " + isNeonNumber(num));
        System.out.println("Is Spy Number: " + isSpyNumber(num));
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(num));
        System.out.println("Is Buzz Number: " + isBuzzNumber(num));
    }
}

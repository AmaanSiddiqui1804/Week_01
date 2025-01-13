import java.util.Scanner;
public class ToLowerCase{ 

    public static String toLower(String s1) {
        String result = "";

        // Going through each character in the string
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            // Checking and converting UPPERCASE to lowecase
            if (ch >= 'A' && ch <= 'Z') {
                
                ch = (char) (ch + 32);
            }

            // Adding the character to the result string
            result = result + ch;
        }
        return result;
    }

    public static boolean stringComparision(String str1 , String str2){
        
        for (int i = 0; i < str1.length(); i++) {
            
        if(str1.charAt(i)!= str2.charAt(i)){
            return false;
        }
        } return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to input the string
        System.out.println("Enter a UPPERCASE string to convert it to lowercase: \n");
        String s1 = input.nextLine();

        String str1 = toLower(s1);
        String str2 = s1.toLowerCase() ;

        boolean isEqual = stringComparision(str1, str2);
        System.out.println("String in lowercase by user defined method: " + str1 + 
                            "\nString in lowercase by built in method: " + str2);
        System.out.println("Are both results equal? " + (isEqual ? "Yes" : "No"));
        input.close();
    }
}
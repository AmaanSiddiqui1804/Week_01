import java.util.Scanner;
public class PalindromeCheck {

    public static boolean palindromeString(String st1){
        st1= st1.toLowerCase();

        char [] arr = st1.toCharArray();
        int left = 0 , right = arr.length-1;

        while(left < right){
            if(arr[left] != arr[right])
                return false;
            
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

		System.out.println("Enter a string to check palindrome: ");
		String st1 = input.next();  
        boolean ans = palindromeString(st1); 
        System.out.println("Is given String a pallindrome ? " + ans);
		input.close();
    }
    
}

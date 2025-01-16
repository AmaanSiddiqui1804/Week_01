import java.util.Scanner;
public class ReverseString{
	public static String reverseStr(String st1){
	
		char [] arr = st1.toCharArray();
		int left = 0 , right = arr.length-1;
		
		while(left<right){
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right -- ;
		}
		return new String(arr);
	}
	
			
	public static void main (String [] args) {
        
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to reverse it: ");
		String st1 = input.nextLine();
		System.out.println("Reverse string is : " + reverseStr(st1));

		input.close();
    }
       
}
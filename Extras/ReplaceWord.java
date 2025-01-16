/* 12: Write a replace method in Java that replaces a given word with another word in a
sentence:*/

import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Taking user input
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        System.out.println("Enter the word to replace:");
        String replace = sc.nextLine();
        System.out.println("Enter the word to replace with:");
        String replaceWith = sc.next();
        
        //Splitting string into words
        String [] arr = str.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i].equals(replace)) {
                arr[i] = replaceWith;
            }
        }
        
        //Printing the modified string
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
        
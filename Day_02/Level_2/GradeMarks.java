/* Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks     
*/

import java.util.*;
public class GradeMarks{ 
	public static void main(String args[]){
			Scanner input=new Scanner(System.in);
			System.out.println("Enter marks of physics: ");
			int physics=input.nextInt();
	
			System.out.println("Enter marks of chemistry: ");
			int chemistry=input.nextInt();
	
			System.out.println("enter marks of maths: ");
			int maths=input.nextInt();
	
			double marks = ((physics+chemistry+maths) * 100.0)/300.0;
	 
			// Calculating the grade 
			if(marks >=80) 
				System.out.println(" grade is A and remark is =  Level 4, above agency-normalized standards");
			else if (marks>=70 && marks<80)
				System.out.println(" grade is B and remark is = Level 3, at agency-normalized standards");
         
			else if (marks>=60 && marks<70)
				System.out.println(" grade is C and remark is = Level 2, below, but approaching agency-normalized standards");
			else if (marks>=50 && marks<60)
				System.out.println("  grade is D and remark is = Level 1-, well below agency-normalized standards");
			else if(marks>=40 && marks<50)
			    System.out.println(" grade is E and remark is =  Level 1-, too below agency-normalized standards");
			else
			    System.out.println(" grade is R and remark is = Remedial standards");
		input.close();
    }
}


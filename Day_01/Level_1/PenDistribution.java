
public class PenDistribution {
    public static void main(String[] args) {

        // Total number of pens available
        int totalPens = 14;

        // Total number of students
        int totalStudents = 3;

        // Calculation of number of pens each student will get
        int numberOfPens = totalPens / totalStudents;

        // Calculation of number of pens remaining
        int remainingNumberOfPens = totalPens % totalStudents;

        // Output the result
        System.out.println("The Pen Per Student is " + numberOfPens + 
            " and the remaining pen not distributed is " + remainingNumberOfPens);
    }
}

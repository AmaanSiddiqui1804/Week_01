import java.util.Scanner;

public class CalendarDisplay {

    // Array containing the names of the months (default access)
    static String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array containing the number of days in each month (default access)
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if the given year is a leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to return the number of days in the given month
    static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    static int getFirstDayOfMonth(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Method to display the calendar
    static void displayCalendar(int month, int year) {
        System.out.println("          " + monthNames[month - 1] + " " + year);
        System.out.println(" Sun  Mon  Tue   Wed   Thu    Fri   Sat");

        int daysInThisMonth = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(year, month);

        // Print spaces before the first day
        for (int i = 0; i < firstDay; i++) System.out.print("     ");

        // Print days of the month
        for (int day = 1; day <= daysInThisMonth; day++) {
            System.out.printf("%3d   ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        displayCalendar(month, year);
        input.close();
    }
}


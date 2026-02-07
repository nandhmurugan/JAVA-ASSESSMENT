package Conditional_Statements;
import java.util.Scanner;

public class Program7 {
//	Check if the entered date is valid in dd/mm/yyyy format.
//	Hint: Check month between 1–12, and days depend on month (and leap year for February).
//	Sample Input: 29/02/2020
//	Sample Output: Valid Date
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter date (dd mm yyyy):");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        int daysInMonth = 0;
        boolean leap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);

        if (m >= 1 && m <= 12) {
            if (m == 2)
                daysInMonth = leap ? 29 : 28;
            else if (m == 4 || m == 6 || m == 9 || m == 11)
                daysInMonth = 30;
            else
                daysInMonth = 31;
        }

        if (d >= 1 && d <= daysInMonth)
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");

        sc.close();
    }
}

package Conditional_Statements;
import java.util.Scanner;

public class Program4 {
//	Determine whether a given year is a leap year.
//	Hint: A year is a leap year if it is divisible by 400, or divisible by 4 but not 100.
//	Sample Input: 2024
//	Sample Output: Leap Year
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Output: Leap Year");
        else
            System.out.println("Output: Not a Leap Year");

        sc.close();
    }
}

package Conditional_Statements;
import java.util.Scanner;

public class Program8 {
//	Check if the entered time is valid in 24-hour format (HH:MM).
//	Hint: Hours → 00–23, Minutes → 00–59.
//	Sample Input: 13:45
//	Sample Output: Valid Time
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time (HH MM):");
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (h >= 0 && h <= 23 && m >= 0 && m <= 59)
            System.out.println("Valid Time");
        else
            System.out.println("Invalid Time");

        sc.close();
    }
}

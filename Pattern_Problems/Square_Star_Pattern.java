package Pattern_Problems;
import java.util.Scanner;

public class Square_Star_Pattern {
//	1. Square Star Pattern
//	Print a square of stars with n rows and columns.
//	Sample Input: 4
//	Sample Output:
//	* * * *
//	* * * *
//	* * * *
//	* * * *
//	Hint: Hint: Use two nested loops — one for rows, one for columns.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

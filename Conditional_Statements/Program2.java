package Conditional_Statements;
import java.util.Scanner;

public class Program2 {
//	Find the largest number among given numbers using if-else ladder or nested if statements.
//	Hint: Compare each number step by step using conditions.
//	Sample Input: 7 15 3 9
//	Sample Output: Maximum: 15
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("Maximum: " + max);

        sc.close();
    }
}

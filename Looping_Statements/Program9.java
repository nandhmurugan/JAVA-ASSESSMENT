package Looping_Statements;
import java.util.Scanner;

public class Program9 {
//	Generate the Fibonacci series up to n terms using loops.
//	Logic Explanation: Start with 0, 1. Next term = sum of previous two terms. Repeat n times.
//	Sample Input: 5
//	Sample Output: 0 1 1 2 3
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}

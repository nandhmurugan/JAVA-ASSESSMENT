package Looping_Statements;
import java.util.Scanner;

public class Program6 {
//	Find the sum of factorials of multiple numbers given as input.
//	Logic Explanation: For each number in the list, compute factorial using a loop and add it to a
//	running total.
//	Sample Input: n = 3, Numbers: 2 3 4
//	Sample Output: 2! + 3! + 4! = 2 + 6 + 24 = 32
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter count:");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            int fact = 1;

            for (int j = 1; j <= num; j++) {
                fact = fact * j;
            }

            total = total + fact;
        }

        System.out.println("Sum of Factorials = " + total);

        sc.close();
    }
}

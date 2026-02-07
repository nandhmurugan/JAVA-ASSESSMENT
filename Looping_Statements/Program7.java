package Looping_Statements;
import java.util.Scanner;

public class Program7 {
//	Compute the total of all even and all odd numbers up to a given limit.
//	Logic Explanation: Loop from 1 to n. If even → add to even_sum, else add to odd_sum.
//	Sample Input: 10
//	Sample Output: Sum of Even = 30, Sum of Odd = 25
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int evenSum = 0, oddSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                evenSum = evenSum + i;
            else
                oddSum = oddSum + i;
        }

        System.out.println("Sum of Even = " + evenSum + ", Sum of Odd = " + oddSum);

        sc.close();
    }
}

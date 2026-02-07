package Looping_Statements;
import java.util.Scanner;

public class Program5 {
//	Calculate the factorial of a given number using loops.
//	Logic Explanation: Set fact = 1. Multiply all numbers from 1 to n using a loop.
//	Sample Input: 5
//	Sample Output: 120
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);

        sc.close();
    }
}

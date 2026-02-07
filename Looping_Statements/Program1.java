package Looping_Statements;
import java.util.Scanner;

public class Program1 {
//	Write a program that prints all numbers from 1 to a given number n using a loop.
//	Logic Explanation: Use a for or while loop starting from 1 to n. Each iteration prints the current
//	number followed by a space.
//	Sample Input: 5
//	Sample Output: 1 2 3 4 5
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.print("Output: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}

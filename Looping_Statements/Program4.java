package Looping_Statements;
import java.util.Scanner;

public class Program4 {
//	Find the total sum of all numbers from 1 to n.
//	Logic Explanation: Initialize sum = 0. Loop from 1 to n and add each number to the sum.
//	Sample Input: 5
//	Sample Output: 15
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}

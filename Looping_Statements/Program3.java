package Looping_Statements;
import java.util.Scanner;

public class Program3 {
//	Generate the multiplication table for any given number up to 10 multiples.
//	Logic Explanation: Use a loop from 1 to 10 and multiply each iteration with the given number.
//	Sample Input: 5
//	Sample Output: 5 10 15 20 25 30 35 40 45 50
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        System.out.print("Output: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((n * i) + " ");
        }

        sc.close();
    }
}

package Looping_Statements;
import java.util.Scanner;

public class Program8 {
//	Determine if a given number is prime or not.
//	Logic Explanation: A number is prime if it has no divisors other than 1 and itself. Loop from 2 to
//	n/2 and check divisibility.
//
//	Sample Input: 17
//	Sample Output: Prime
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        boolean prime = true;

        if (n <= 1)
            prime = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

        sc.close();
    }
}

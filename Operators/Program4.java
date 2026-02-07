package Operators;
import java.util.Scanner;

public class Program4 {
//	Task: Write a program to swap the values of two integers using a temporary variable.
//	Sample Input: a = 5, b = 10
//	Expected Output: a = 10, b = 5
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, temp;
        System.out.println("Input:");
        a = sc.nextInt();
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Output: a = " + a + ", b = " + b);

        sc.close();
    }
}

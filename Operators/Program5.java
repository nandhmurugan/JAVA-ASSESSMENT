package Operators;
import java.util.Scanner;

public class Program5 {

//	Task: Write a program to swap two integers without using any temporary variable (use arithmetic or
//			bitwise operations).
//			Sample Input: a = 5, b = 10
//			Expected Output: a = 10, b = 5
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Input:");
        a = sc.nextInt();
        b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Output: a = " + a + ", b = " + b);

        sc.close();
    }
}

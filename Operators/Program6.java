package Operators;
import java.util.Scanner;

public class Program6 {

//	Task: Write a program that checks whether a given integer is odd or even.
//	Sample Input: 7
//	Expected Output: Odd
//	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Input:");
        n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Output: Even");
        else
            System.out.println("Output: Odd");

        sc.close();
    }
}

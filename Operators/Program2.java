package Operators;
import java.util.Scanner;

public class Program2 {
	
//	Task: Write a program that checks whether a given number is positive, negative, or zero.
//	Sample Input: -12
//	Expected Output: Negative

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Input:");
        n = sc.nextInt();

        String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";

        System.out.println("Output: " + result);

        sc.close();
    }
}

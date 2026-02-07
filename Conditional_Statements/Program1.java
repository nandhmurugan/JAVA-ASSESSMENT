package Conditional_Statements;
import java.util.Scanner;

public class Program1 {

//	Write a program to check whether the given number is odd or even using conditional statements.
//	Hint: A number is even if it is divisible by 2, otherwise it is odd.
//	Sample Input: 10
//	Sample Output: Even
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}

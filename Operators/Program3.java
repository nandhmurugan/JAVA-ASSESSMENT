package Operators;
import java.util.Scanner;

public class Program3 {

//	Task: Write a program to verify whether a given input character is an alphabet letter (A–Z or a–z).
//	Sample Input: A
//	Expected Output: Alphabet
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch;
        System.out.println("Input:");
        ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println("Output: Alphabet");
        else
            System.out.println("Output: Not an Alphabet");

        sc.close();
    }
}

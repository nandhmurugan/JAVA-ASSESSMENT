package Conditional_Statements;
import java.util.Scanner;

public class Program3 {
//	Identify whether a given character is an alphabet, digit, or special character.
//	Hint: Use character ranges: 'A–Z' or 'a–z' → Alphabet, '0–9' → Digit, otherwise → Special
//	Character.
//	Sample Input: @
//	Sample Output: Special Character
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println("Output: Alphabet");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Output: Number");
        else
            System.out.println("Output: Special Character");

        sc.close();
    }
}

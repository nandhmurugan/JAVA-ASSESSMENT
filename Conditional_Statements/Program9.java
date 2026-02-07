package Conditional_Statements;
import java.util.Scanner;

public class Program9 {
//	Create a simple calculator using a switch-case statement supporting +, -, *, /, and % operators.
//	Hint: Use switch to perform operations based on the operator.
//	Sample Input: 5 + 2
//	Sample Output: 7
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter expression (a operator b):");
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();

        switch (op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/': System.out.println("Result: " + (a / b)); break;
            case '%': System.out.println("Result: " + (a % b)); break;
            default: System.out.println("Invalid Operator");
        }

        sc.close();
    }
}

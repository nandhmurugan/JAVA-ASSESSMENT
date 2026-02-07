package Conditional_Statements;
import java.util.Scanner;

public class Program6 {
//	Check whether three given sides can form a valid triangle.
//	Hint: Triangle is possible if all these are true: a + b > c, a + c > b, b + c > a.
//	Sample Input: 3 4 5
//	Sample Output: Triangle is possible
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Triangle is possible");
        else
            System.out.println("Not possible");

        sc.close();
    }
}

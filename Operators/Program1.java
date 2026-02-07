
package Operators;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
//		Task: Write a program that determines which number is the largest among 4 given integers using
//		the ternary operator (?:).
//		Sample Input: 5 8 3 10
//		Expected Output: Maximum: 10

	
		Scanner sc=new Scanner(System.in);
		
		int a,b,c,d;
		System.out.println(" Input:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
		int m1=(a>b)? a:b;
		int m2=(m1>c)? m1:c;
		int max=(m2>d)? m2:d;
		
		
		

		System.out.println(" Output: maximum "+max);
    sc.close();

	}

}

package Looping_Statements;
import java.util.Scanner;

public class Program2 {
//	Display all odd and even numbers up to a given limit n.
//	Logic Explanation: Loop through 1 to n. If i % 2 == 0, it’s even; otherwise, it’s odd. Store them
//	separately and print.
//	Sample Input: 10
//	Sample Output: Odd: 1 3 5 7 9, Even: 2 4 6 8 10
//    public static void main(String[] args) {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter input number:");
	        int n = sc.nextInt();

	        System.out.print("Odd: ");
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 != 0)
	                System.out.print(i + " ");
	        }

	        System.out.print(", Even: ");
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0)
	                System.out.print(i + " ");
	        }

	        sc.close();
	    }
	}

package Pattern_Problems;
import java.util.Scanner;
public class Right_Angled_Triangle {
//	2. Right-Angled Triangle
//	Print a right-angled triangle of stars.
//	Sample Input: 5
//	Sample Output:
//	*
//	* *
//	* * *
//	* * * *
//	* * * * *
//	Hint: Hint: Inner loop runs i times for each row.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
package Pattern_Problems;

import java.util.Scanner;

public class Inverted_Right_Angled_Triangle {
//	3. Inverted Right-Angled Triangle
//	Print a triangle inverted upside down.
//	Sample Input: 5
//	Sample Output:
//	* * * * *
//	* * * *
//	* * *
//	* *
//	*
//	Hint: Hint: Start from n stars and decrease each line.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
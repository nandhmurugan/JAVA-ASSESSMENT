package Pattern_Problems;

import java.util.Scanner;

public class Hollow_Square {

    public static void main(String[] args) {

//    	4. Hollow Square
//
//    	Print a hollow square using stars.
//    	Sample Input: 5
//    	Sample Output:
//    	* * * * *
//    	* *
//    	* *
//    	* *
//    	* * * * *
//    	Hint: Hint: Print * only at first/last row or column.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();
    }
}

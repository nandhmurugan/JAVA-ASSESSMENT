package Conditional_Statements;
import java.util.Scanner;

public class Program5 {
//	Print the corresponding day of the week for a number between 1 and 7 using if-else or switch.
//	Hint: 1 = Monday, 2 = Tuesday, ..., 7 = Sunday.
//	Sample Input: 3
//	Sample Output: Wednesday
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number:");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid Day");
        }

        sc.close();
    }
}

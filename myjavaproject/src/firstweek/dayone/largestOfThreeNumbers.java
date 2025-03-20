package firstweek.dayone;
import java.util.Scanner;
//Find the largest of three numbers.


public class largestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of first number");
        int a = scanner.nextInt();

        System.out.println("enter the value of second number");
        int b = scanner.nextInt();

        System.out.println("enter the value of third number");
        int c = scanner.nextInt();

        int res = ((a > b && a > c) ? a : b > c ? b : c);

        System.out.println("the maximum of the three numbers is "+res);

        scanner.close();
    }
}

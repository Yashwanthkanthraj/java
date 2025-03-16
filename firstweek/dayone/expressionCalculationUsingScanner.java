package firstweek.dayone;

import java.util.Scanner;

public class expressionCalculationUsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the value of a ");
        double a = scanner.nextDouble();

        System.out.println("enter the value of b ");
        double b = scanner.nextDouble();

        System.out.println("the enter value of c ");
        double c = scanner.nextDouble();

        System.out.println("enter the value of d ");
        double d = scanner.nextDouble();

        System.out.println("enter the value of e ");
        double e = scanner.nextDouble();

        System.out.println("enter the value of f ");
        double f = scanner.nextDouble();

        double result = (a + b) * (c - d) / e % f;

        System.out.println("The result of the expression (a + b) * (c - d) / e % f is: " + result);
        scanner.close();
    }

}

package firstweek.practice;
//Find the maximum of three numbers using nested ternary operators.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the three numbers a , b , c ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a > b && a > c) {
            System.out.println(a+" is the largest number");
        } else if (b > c) {
            System.out.println(b+" is the largest number");
        } else {
            System.out.println(c+" is the largest number");
        }
        scanner.close();

    }
}

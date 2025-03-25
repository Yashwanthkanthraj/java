package practice_OPERATORS;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your given marks to view your Grade - ");

        int marks = scanner.nextInt();
        if (marks >= 90) {
            System.out.println("A");

        } else if (marks >= 80) {
            System.out.println("B");

        } else if (marks >= 70) {
            System.out.println("C");

        } else if (marks >= 60) {
            System.out.println("D");

        } else if (marks >= 45) {
            System.out.println("E");

        } else {
            System.out.println("F");
        }
        scanner.close();
    }
}

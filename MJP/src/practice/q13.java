package practice;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the year -");
        int num = scanner.nextInt();

        boolean div3 = num % 3 == 0;
        boolean div5 = num % 5 == 0;
        System.out.println((div3 || div5) && !(div3 && div5) ? "Valid" : "Invalid");
        scanner.close();
    }
}

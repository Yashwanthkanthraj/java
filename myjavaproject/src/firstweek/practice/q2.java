package firstweek.practice;

import java.util.Scanner;

//Determine if a number is in the range 10 to 50 (inclusive).
public class q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please provide a two digit number - ");
        int no = scanner.nextInt();

        if (no >= 10 && no <= 50) {
            System.out.println("the number is in range between 10 and 50 .");
        } else {
            System.out.println("the number is not in a range between 10 and 50.");
        }
        scanner.close();
    }

}

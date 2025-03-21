package practice;

import java.util.Scanner;

//Check if a given year is a leap year (divisible by 4, not by 100 unless also by 400)
                                     //((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)).
public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the year -");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("the given year - " + year + " is a leap year");

        } else {
            System.out.println(year + " is not a leap year !");
        }
        scanner.close();
    }

}

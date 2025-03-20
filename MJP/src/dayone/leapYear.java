package firstweek.dayone;

import java.util.Scanner;

//Check if a year is a leap year.
public class leapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 ==0 && year % 100 !=0) || (year%400==0);
        System.out.println(year+ "is a leap year ?" + isLeapYear);

        scanner.close();



    }
}
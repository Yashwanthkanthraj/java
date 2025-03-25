package practice_OPERATORS;

import java.util.Scanner;

//Calculate the number of days in a month (1-12), assuming February has 28 days.
public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number -");
        int month = scanner.nextInt();


        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
            System.out.println("month has 31 days !");
            break;
                
            case 4:case 6:case 9:case 11:
            System.out.println("month has 30 days");
            break;

            case 2: System.out.println("month has 28 days");
            break;
            default:System.out.println("invalid month");
            break;
        }
    scanner.close();
    }
}

package firstweek.project;

import java.util.Scanner;

//Print the day of the week (e.g., 1 = Monday, 7 = Sunday) using switch.
public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int weekday  = scanner.nextInt() ;

        switch (weekday) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;

            default:
                System.out.println("INVALID DAY");
                break;
        }

    }
}

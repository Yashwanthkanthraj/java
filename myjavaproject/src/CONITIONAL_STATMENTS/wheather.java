package firstweek.CONITIONAL_STATMENTS;

import java.util.Scanner;

public class wheather {

    int temp;
    boolean raining;

    public wheather() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the temperature - ");
        int temp = scanner.nextInt();

        if (temp < 60) {
            System.out.println("wear a jacket !");

            System.out.println("is it raining- ");
            boolean raining = scanner.nextBoolean();

            if (raining == true) {
                System.out.println("take your umbrella");
            } else {
                System.out.println("leave your umbrella");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {

        wheather monday = new wheather();
        monday.wheather();

    }
}
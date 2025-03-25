package practice_OPERATORS;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number -");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("the given number is even !");
        }else{
            System.out.println("the given number is odd !");
        }
        scanner.close();
    }
}
 
package practice;

import java.util.Scanner;
// Check if a number is positive, negative, or zero

public class q8 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print ("enter the number -");
        int num = scanner.nextInt();

        if((num > 0)&&(num != 0)){
            System.out.println("THe number is a positive number - ");
        } else if (num < 0){
            System.out.println("The number is a negotive number - ");
        }else {
            System.out.println("the number is a zero ");
        }
        scanner.close();
    }
}

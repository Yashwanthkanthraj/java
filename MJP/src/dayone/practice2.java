package firstweek.dayone;

/*
 * Write a program to concatenate two strings and print the result.

Write a program to compare two integers using the == operator
and print whether they are equal or not.

Write a program to check if a number is greater than another number using the > operator.

Write a program to check if a number is less than another number using the < operator.

Write a program to use the final keyword to declare a constant variable and print its value.
 */
public class practice2 {
    public static void main(String[] args) {

        String user1 = "hi i'm yashwanth it nice to code ";
        String user2 = "and i am uploading my files github.";
        int num1 = 15;
        int num2 = 25;
        final int yearofbirth = 1999;
        boolean compare = num1 == num2;
        boolean compare1 = num1 > num2;
        boolean compare2 = num1 < num2;

        System.out.println(user1 + user2);
        System.out.println(compare);
        System.out.println(compare1);
        System.out.println(compare2);
        System.out.println(yearofbirth);
    }
}

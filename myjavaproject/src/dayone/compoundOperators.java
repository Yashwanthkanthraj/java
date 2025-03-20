package firstweek.dayone;

/*
 * Write a program to use compound assignment operators (+=, -=, *=, /=) 
 * to update the value of a variable and print the result
 */
public class compoundOperators {
    public static void main(String[] args) {
        int a = 25;
        int b = 75;

        System.out.println("the value of a " + a);
        System.out.println("th value of b " + b);

        a += 5;
        System.out.println("the updated value of a " + a);

        b -= 20;
        System.out.println("the updated value of a " + b);

        a *= a * b;
        System.out.println("the updated value of a " + a);

        b /= a / b;
        System.out.println("the updated value of a " + b);

    }
}

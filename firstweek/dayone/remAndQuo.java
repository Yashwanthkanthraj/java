package firstweek.dayone;
/*Write a program to calculate the remainder of a division operation 
and print both the quotient and remainder. */
public class remAndQuo {

    public static void main(String[] args) {
        double n1 = 305;
        double n2 = 4;

        double rem = n1 % n2;
        double quo = n1 / n2;

        System.out.println("THE remainder is " + rem);
        System.out.println("THE quotient is " + quo);

    }
}
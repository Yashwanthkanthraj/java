package practice_OPERATORS;

//Write a program to check if two integers are equal, or if one is greater/less than the other.
public class q1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a==b){
            System.out.println("the given two integrs are equal");
        } else if (a>b){
            System.out.println("integer a = "+a+" greater than integer b = "+b);
        } else {
            System.out.println("integer b = "+b+" greater than integer a = "+a);
        }
    }
}

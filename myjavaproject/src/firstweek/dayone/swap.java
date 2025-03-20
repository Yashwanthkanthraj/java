package firstweek.dayone;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;

        System.out.println("before swapping");
        System.out.println("A value = " + a);
        System.out.println("B value = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swapping ");
        System.out.println("A value = " + a);
        System.out.println("B value = " + b);

    }
}

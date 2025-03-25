package practice_OPERATORS;

public class q14 {
    public static void main(String[] args) {
        double a = 1, b = -5, c = -6;
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {

            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("two roots : " + root1 + " -------- " + root2);

        } else if (discriminant == 0) {

            double root = (-b / (2 * a));
            System.out.println("one root " + root);

        } else {
            System.out.println("no real roots");
        }
    }
}

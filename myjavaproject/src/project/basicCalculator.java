package firstweek.project;

public class basicCalculator {

    // int a;
    int b;

    public basicCalculator() {

    }

    public int add(int a, int b) {
        return a + b;

    }

    public int subtract(int a, int b) {
        return a - b;

    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        basicCalculator myBasicCalculator = new basicCalculator();
        System.out.println(myBasicCalculator.add(5, 7));
        System.out.println(myBasicCalculator.subtract(45, 11));
        System.out.println(myBasicCalculator.multiply(12, 34));
        System.out.println(myBasicCalculator.divide(21, 8));
        System.out.println(myBasicCalculator.modulo(25, 4));

    }
}

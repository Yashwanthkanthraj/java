package Calculator;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {

            System.out.println("/n ---- calcaulator menu ----");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. multiply");
            System.out.println("4. Divide");
            System.out.println("5. Show History");
            System.out.println("6. Clear History");
            System.out.println("7. Exit");
            System.out.println(" Enter Your Choice:- ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:

                    System.out.println("Enter your First numer");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter your second number");
                    double num2 = scanner.nextDouble();

                    try {
                        double result = 0;

                        if (choice == 1)
                            result = calculator.add(num1, num2);
                        else if (choice == 2)
                            result = calculator.Subtract(num1, num2);
                        else if (choice == 3)
                            result = calculator.multiply(num1, num2);
                        else if (choice == 4)
                            result = calculator.divide(num1, num2);

                        System.out.printf("Result: %.2f \n", result);

                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    calculator.showHistory();
                    break;

                case 6:
                    calculator.clearHistory();
                    break;

                case 7:
                    isRunning = false;
                    System.out.println("Exiting ...");
                    break;

                default:
                    System.out.println("Inavlid choice try again .");
            }

        }
        scanner.close();
    }
}

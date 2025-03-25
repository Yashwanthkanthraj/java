package practice_loops;

import java.util.ArrayList;

// basic calculator with history
public class calaculator {

    private ArrayList<String> history; // creating arraylist with variable

    public calaculator() {
        history = new ArrayList<>(); // initializing new object;
    }

    // Add a calculation to the history
    private void addToHistory(String operation, double num1, double num2, double result) {
        String entry = String.format("%.2f %s %.2f = %.2f", num1, num2, result);
        history.add(entry);
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        addToHistory("+", num1, num2, result);
        return result;
    }

    public double Subtract(double num1, double num2) {
        double result = num1 - num2;
        addToHistory("-", num1, num2, num2);
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 - num2;
        addToHistory("*", num1, num2, num2);
        return result;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("cannot divide by zero !");
        }

        double result = num1 / num2;
        addToHistory("/", num1, num2, num2);
        return result;
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("History is empty");
            return;
        }

        System.out.println("/n---- calculate history ----");
        for (String entry : history) {
            System.out.println(entry);
        }
    }

    public void clearHistory() {
        history.clear();
        System.out.println("---history cleared ---");
    }
}
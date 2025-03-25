package expense_tracker;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    // ArrayList to store expenses
    private static ArrayList<Double> expenses = new ArrayList<>();
    // Scanner for user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Main menu loop
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            // Use switch for clear, structured menu navigation
            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    calculateTotalExpenses();
                    break;
                case 3:
                    findHighestExpense();
                    break;
                case 4:
                    findLowestExpense();
                    break;
                case 5:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Display menu options to the user
    private static void displayMenu() {
        System.out.println("\n--- Expense Tracker ---");
        System.out.println("1. Add Expense");
        System.out.println("2. Calculate Total Expenses");
        System.out.println("3. Find Highest Expense");
        System.out.println("4. Find Lowest Expense");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    // Get user's menu choice with input validation
    private static int getUserChoice() {
        while (true) {
            try {
                // Ensure we're reading an integer
                int choice = scanner.nextInt();
                // Clear the input buffer
                scanner.nextLine();
                return choice;
            } catch (Exception e) {
                // Handle invalid input
                System.out.println("Invalid input. Please enter a number.");
                // Clear the invalid input
                scanner.nextLine();
            }
        }
    }

    // Method to add a new expense
    private static void addExpense() {
        while (true) {
            try {
                System.out.print("Enter expense amount (or 0 to stop): $");
                double amount = scanner.nextDouble();
                
                // Allow user to exit adding expenses
                if (amount == 0) break;
                
                // Validate positive expense
                if (amount > 0) {
                    expenses.add(amount);
                    System.out.println("Expense added successfully!");
                } else {
                    System.out.println("Please enter a positive amount.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                // Clear the invalid input
                scanner.nextLine();
            }
        }
    }

    // Calculate and display total expenses
    private static void calculateTotalExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }

        double total = 0;
        // Use enhanced for loop to iterate through expenses
        for (double expense : expenses) {
            total += expense;
        }

        System.out.printf("Total Expenses: $%.2f%n", total);
    }

    // Find and display the highest expense
    private static void findHighestExpense() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }

        double highest = expenses.get(0);
        // Find highest expense using a for loop
        for (double expense : expenses) {
            if (expense > highest) {
                highest = expense;
            }
        }

        System.out.printf("Highest Expense: $%.2f%n", highest);
    }

    // Find and display the lowest expense
    private static void findLowestExpense() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }

        double lowest = expenses.get(0);
        // Find lowest expense using a for loop
        for (double expense : expenses) {
            if (expense < lowest) {
                lowest = expense;
            }
        }

        System.out.printf("Lowest Expense: $%.2f%n", lowest);
    }
}
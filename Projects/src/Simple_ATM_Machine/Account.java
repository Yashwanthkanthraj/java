package Simple_ATM_Machine;

import java.util.ArrayList;

public class Account {

    private String accountNumber;
    private int pin;
    private double balance;
    private ArrayList<String> transactionHistory;

    public  Account(String accountNumber, int pin, double balance) {

        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        transactionHistory = new ArrayList<>();

    }

    public boolean validatePin(int inputPin) {

        return inputPin == pin;

    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" Amount should be positive.");
            return;
        }

        balance += amount;
        transactionHistory.add(String.format("Deposit: +$%.2f current balance is: $%.2f", amount, balance));
        System.out.printf("$%.2f deposited. current balance is: $%.2f\n", amount, balance);

    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" amount must be positive.");
            return;

        }
        if ( balance < amount) {
            System.out.println("insufficent balance.");
            return;

        }
        balance -= amount;
        transactionHistory.add(String.format("Withdraw: -$%.2f current balance is: $%.2f ", amount, balance));
        System.out.printf("$%.2f withdrawn. current balance is: $%.2f\n", amount, balance);
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getTransactionHistory() {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Transactions:");
        return new ArrayList<>(transactionHistory);
    }

    public String getAccountNo() {
        return accountNumber;
    }
}

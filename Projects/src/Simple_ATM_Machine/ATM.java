package Simple_ATM_Machine;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts;
    private Account currentAccount;
    private Scanner scanner;

    public ATM() {
        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);

    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void startATM() {
        System.out.println("----- WELCOME TO THE ATM -----");
        while (true) {
            System.out.println("enter your account number: ");
            String accountNumber = scanner.nextLine();
            System.out.println("enter your secret pin.");
            int pin = scanner.nextInt();
            scanner.nextLine();

            boolean loginSucess = false;
            for (Account account : accounts) {
                if (account.getAccountNo().equals(accountNumber) && (account.validatePin(pin))) {
                    currentAccount = account;
                    loginSucess = true;
                    break;
                }

                if (!loginSucess) {
                    System.out.println("invalid account number or pin. please try again.");
                } else {
                    System.out.println("login Successful.");
                    break;
                }
            }
            boolean isActive = true;
            while (isActive) {
                System.out.println("-----Account Menu -----");
                System.out.println("1. check balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Passbook(transaction history)");
                System.out.println("5. Exiting");
                System.out.println("enter your choice");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.printf("Balance: $%.2f\n", currentAccount.getBalance());
                        break;
                    case 2:
                        System.out.println("enter deposit amount.");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine();
                        currentAccount.deposit(depositAmount);
                        break;

                    case 3:
                        System.out.println(" enter withdraw amount.");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine();
                        currentAccount.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("\n Passbook(Transaction history)");
                        for (String transaction : currentAccount.getTransactionHistory()) {
                            System.out.println(transaction);
                        }
                        break;

                    case 5:
                        isActive = false;
                        System.out.println("Thank you for using the ATM");
                        break;

                    default:
                        System.out.println("Invalid choice");
                        
                        break;
                }
            }
        }
    }
}



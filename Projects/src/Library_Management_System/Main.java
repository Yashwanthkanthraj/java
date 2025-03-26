package Library_Management_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {

            System.out.println("\n---------- library menu ----");
            System.out.println("1. add Book");
            System.out.println("2. remove Book");
            System.out.println("3. List all books");
            System.out.println("4. Check out book");
            System.out.println("5. Return bbok");
            System.out.println("6. Exit");
            System.out.println("enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter book title: ");
                    String title = scanner.nextLine().trim();
                    System.out.println("enter book Author: ");
                    String author = scanner.nextLine().trim();

                    if (title.isEmpty() || author.isEmpty()) {
                        System.out.println("titlt or author cannot be empty.");
                    } else {
                        library.addBook(title, author);
                    }
                    break;
                    
                case 2:
                    System.out.println("enter title to remove :");
                    title = scanner.nextLine().trim();
                    library.removeBook(title);
                    break;

                case 3:
                    System.out.println("list all books: ");
                    library.listAllBooks();
                    break;

                case 4:
                    System.out.println("enter title to checkout: ");
                    title = scanner.nextLine().trim();
                    library.checkOutBook(title);
                    break;

                case 5:
                    System.out.println("enter title to return: ");
                    title = scanner.nextLine().trim();
                    library.returnBook(title);
                    break;

                case 6:
                    isRunning = false;
                    System.out.println("Exiting ...");
                    break;

                default:
                    System.out.println(" invalid chice. try again");
                    break;
            }
        }
        scanner.close();
    }
}

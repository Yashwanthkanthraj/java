package Library_Management_System;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book Added : " + title);
    }

    public void removeBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                found = true;
                System.out.println("Book Removed " + title);
                break;
            }
            if (!found) {
                System.out.println("Book Not Found: " + title);
            }
        }
    }

    public void listAllBooks() {

        if (books.isEmpty()) {
            System.out.println("There are no books Availble. add books first!");
        }

        System.out.println("----All Books----");
        for (Book book : books) {

            String availability = book.isAvailable() ? "Available" : "Checked out";

            System.out.printf("- %s by %s (%s)\n", book.getTitle(), book.getAuthor(), availability);
        }
    }

    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.isAvailable()) {
                    book.checkOut();
                    System.out.println("book checked out: " + title);

                } else {
                    System.out.println("Book already checked out: " + title);
                }
                return;
            }
        }
        System.out.println("book not found");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isAvailable()) {
                    book.returnBook();
                    System.out.println(" book returned:" + title);

                } else {
                    System.out.println(" book already available: " + title);
                }
                return;
            }
        }
        System.out.println(title + "book is returned");
    }
}

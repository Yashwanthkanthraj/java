package Loops;

public class whileLoop {
    public static void main(String[] args) {

        // set attempts to 0
        int attempts = 0;

        // enter loop if condition is true
        while (passcode != 0524 && attempts < 4) {

            System.out.println("Try again.");
            passcode = getNewPasscode();
            attempts += 1;

            // is condition still true?
            // if so, repeat code block
        }
        // exit when condition is not true
    }
}
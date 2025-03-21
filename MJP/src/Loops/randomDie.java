package Loops;

import java.util.Random;

public class randomDie {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int dieRoll = randomGenerator.nextInt(6) + 1;
        /*randomGenerator.nextInt(6) generates a random integer 
        between 0 (inclusive) and 6 (exclusive), i.e., 0 to 5.
        + 1 shifts the range to 1–6, simulating a standard 6-sided die roll.
        Example: If nextInt(6) returns 3, dieRoll becomes 4. */

        while (dieRoll != 5) {
            System.out.println(dieRoll);
            dieRoll = randomGenerator.nextInt(6) + 1;
        }
    }
}

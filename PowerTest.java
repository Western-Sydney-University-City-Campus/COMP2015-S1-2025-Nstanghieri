package PowerTest;

import java.util.Scanner;

public class PowerTest {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int base;
        int exponent;

        base = getPositiveInt("Enter a positive base: ");
        exponent = getPositiveInt("Enter a positive exponent: ");

        int myResult = power(base, exponent);
        double mathResult = Math.pow(base, exponent);

        System.out.println("\nMy power method result: " + base + " raised to the power of " + exponent + " = " + myResult);
        System.out.println("Math.pow method result: " + base + " raised to the power of " + exponent + " = " + mathResult);

        if (myResult == mathResult) {
            System.out.println("SUCCESS – it looks like you wrote the power method correctly.");
        } else {
            System.out.println("Try again with smaller values of the base and exponent or something appears to be wrong with your power method.");
        }

        kb.close();
    }

    // Method to calculate base^exponent without Math.pow
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Any number to the power of 0 is 1
        }

        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Method to validate input as non-negative integer
    public static int getPositiveInt(String prompt) {
        int value;
        do {
            System.out.print(prompt);
            while (!kb.hasNextInt()) { 
                System.out.print("Invalid input. " + prompt);
                kb.next(); // discard bad input
            }
            value = kb.nextInt();
            if (value < 0) {
                System.out.println("Value must not be negative.");
            }
        } while (value < 0);
        return value;
    }
}
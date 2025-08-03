package Rodents;

import java.util.Scanner;

public class Rodents2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int initialPopulation;
        float percentageIncrease;
        int years;

        // Get and validate initial population
        int enteredPopulation;
        do {
            System.out.print("Enter initial population of Rodents of Unusual Size (min 300): ");
            enteredPopulation = input.nextInt();
        } while (!validateInt(enteredPopulation, 300));
        initialPopulation = enteredPopulation;

        // Get and validate percentage increase
        float enteredPercentage;
        do {
            System.out.print("Enter annual population increase percentage (min 0): ");
            enteredPercentage = input.nextFloat();
        } while (!validateFloat(enteredPercentage, 0));
        percentageIncrease = enteredPercentage;

        // Get and validate number of years
        int enteredYears;
        do {
            System.out.print("Enter number of years to estimate population (min 10): ");
            enteredYears = input.nextInt();
        } while (!validateInt(enteredYears, 10));
        years = enteredYears;

        // Predict and display population each year
        System.out.println("\n--- Rodents of Unusual Size Population Forecast ---");
        for (int year = 1; year <= years; year++) {
            initialPopulation += (int)(initialPopulation * (percentageIncrease / 100));
            System.out.println("Year " + year + ": " + initialPopulation + " rodents");
        }

        input.close();
    }

    // Validate integer input
    public static boolean validateInt(int value, int min) {
        if (value < min) {
            System.out.println("Error: Value must be at least " + min + ".");
            return false;
        }
        return true;
    }

    // Validate float input
    public static boolean validateFloat(float value, float min) {
        if (value < min) {
            System.out.println("Error: Value must be at least " + min + ".");
            return false;
        }
        return true;
    }
}

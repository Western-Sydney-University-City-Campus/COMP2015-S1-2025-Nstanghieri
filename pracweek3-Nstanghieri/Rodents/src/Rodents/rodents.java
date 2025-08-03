package Rodents;

import java.util.Scanner;

public class rodents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int population;
        double percentageIncrease;
        int years;

        // Prompt and validate initial population
        do {
            System.out.print("Enter initial population of Rodents of Unusual Size (minimum 300): ");
            population = input.nextInt();
            if (population < 300) {
                System.out.println("Error: Initial population must be at least 300.");
            }
        } while (population < 300);

        // Prompt and validate annual population increase
        do {
            System.out.print("Enter annual population increase percentage (non-negative): ");
            percentageIncrease = input.nextDouble();
            if (percentageIncrease < 0) {
                System.out.println("Error: Percentage increase cannot be negative.");
            }
        } while (percentageIncrease < 0);

        // Prompt and validate number of years
        do {
            System.out.print("Enter number of years to estimate population (minimum 10): ");
            years = input.nextInt();
            if (years < 10) {
                System.out.println("Error: Number of years must be at least 10.");
            }
        } while (years < 10);

        // Display population predictions
        System.out.println("\n--- Rodents of Unusual Size Population Forecast ---");
        for (int year = 1; year <= years; year++) {
            population += (int)(population * (percentageIncrease / 100));
            System.out.println("Year " + year + ": " + population + " rodents");
        }

        input.close();
    }
}
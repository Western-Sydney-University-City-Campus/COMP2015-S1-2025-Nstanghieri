package Temperatures;

import java.util.Scanner;

public class temperatures {

    // Method to display final output for a category
    public static void displayCategory(String category, int count, double total) {
        System.out.println(category + ":");
        if (count == 0) {
            System.out.println("0 day(s), average temperature: N/A\n");
        } else {
            double avg = total / count;
            System.out.printf("%d day(s), average temperature: %.1f°C%n%n", count, avg);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Sydney Daily Maximum Temperature Analyser!");
        System.out.println("Enter the daily maximum temperatures for Sydney. Enter -999 to finish.");

        // Variables for each category
        int freezingCount = 0, coldCount = 0, mildCount = 0, warmCount = 0, hotCount = 0, extremeCount = 0;
        double freezingTotal = 0, coldTotal = 0, mildTotal = 0, warmTotal = 0, hotTotal = 0, extremeTotal = 0;

        int day = 1;
        while (true) {
            System.out.print("Enter temperature for day " + day + ": ");
            double temp = input.nextDouble();

            if (temp == -999) {
                break;
            }

            if (temp < -10 || temp >= 50) {
                System.out.println("Ignored: Invalid temperature range.");
                continue;
            }

            // Categorize and accumulate
            if (temp < 0) {
                freezingCount++;
                freezingTotal += temp;
            } else if (temp < 10) {
                coldCount++;
                coldTotal += temp;
            } else if (temp < 20) {
                mildCount++;
                mildTotal += temp;
            } else if (temp < 30) {
                warmCount++;
                warmTotal += temp;
            } else if (temp < 40) {
                hotCount++;
                hotTotal += temp;
            } else {
                extremeCount++;
                extremeTotal += temp;
            }

            day++;
        }

        // Output summary
        System.out.println("\n===== Temperature Analysis =====\n");
        displayCategory("Freezing", freezingCount, freezingTotal);
        displayCategory("Cold", coldCount, coldTotal);
        displayCategory("Mild", mildCount, mildTotal);
        displayCategory("Warm", warmCount, warmTotal);
        displayCategory("Hot", hotCount, hotTotal);
        displayCategory("Extreme", extremeCount, extremeTotal);

        input.close();
    }
}
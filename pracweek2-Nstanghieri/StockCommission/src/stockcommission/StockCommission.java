package stockcommission;

import java.util.Scanner;

public class StockCommission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sharePrice;
        int numberOfShares;

        // Get and validate share price
        do {
            System.out.print("Enter the share price (greater than 0 and ≤ 500): ");
            sharePrice = input.nextDouble();
            if (sharePrice <= 0 || sharePrice > 500) {
                System.out.println("Invalid share price. Please enter a value > 0 and ≤ 500.");
            }
        } while (sharePrice <= 0 || sharePrice > 500);

        // Get and validate number of shares
        do {
            System.out.print("Enter the number of shares (100 to 100000): ");
            numberOfShares = input.nextInt();
            if (numberOfShares < 100 || numberOfShares > 100000) {
                System.out.println("Invalid number of shares. Please enter between 100 and 100000.");
            }
        } while (numberOfShares < 100 || numberOfShares > 100000);

        // Calculate costs
        double stockCost = sharePrice * numberOfShares;
        double commission = stockCost * 0.0425;
        double totalCost = stockCost + commission;

        // Output
        System.out.printf("\nStock cost: $%.2f\n", stockCost);
        System.out.printf("Commission (4.25%%): $%.2f\n", commission);
        System.out.printf("Total cost: $%.2f\n", totalCost);

        input.close();
    }
}
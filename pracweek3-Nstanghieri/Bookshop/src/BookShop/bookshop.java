package BookShop;

import java.util.Scanner;

public class bookshop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueShop = true;

        while (continueShop) {
            double totalDue = 0.0;
            String moreBooks;

            // Input book entries
            do {
                double price;
                int quantity;

                // Validate price
                do {
                    System.out.print("Enter book price: $");
                    price = input.nextDouble();
                    if (price <= 0) {
                        System.out.println("Error: Price must be greater than 0.");
                    }
                } while (price <= 0);

                // Validate quantity
                do {
                    System.out.print("Enter quantity: ");
                    quantity = input.nextInt();
                    if (quantity <= 0) {
                        System.out.println("Error: Quantity must be greater than 0.");
                    }
                } while (quantity <= 0);

                totalDue += price * quantity;

                System.out.print("Add another book? (yes/no): ");
                moreBooks = input.next().toLowerCase();
            } while (moreBooks.equals("yes"));

            // Display total
            System.out.printf("\nTotal Due: $%.2f\n", totalDue);

            // Payment
            double cashPayment = 0.0;
            double creditPayment = 0.0;
            double change = 0.0;
            double owing = 0.0;

            String paymentMethod;
            do {
                System.out.print("Enter payment method (cash/credit): ");
                paymentMethod = input.next().toLowerCase();
                if (!paymentMethod.equals("cash") && !paymentMethod.equals("credit")) {
                    System.out.println("Error: Please enter 'cash' or 'credit'.");
                }
            } while (!paymentMethod.equals("cash") && !paymentMethod.equals("credit"));

            if (paymentMethod.equals("credit")) {
                creditPayment = totalDue;
            } else {
                double cashTendered;
                do {
                    System.out.print("Enter cash amount: $");
                    cashTendered = input.nextDouble();
                    if (cashTendered < 0) {
                        System.out.println("Error: Cash amount cannot be negative.");
                    }
                } while (cashTendered < 0);

                if (cashTendered >= totalDue) {
                    cashPayment = totalDue;
                    change = cashTendered - totalDue;
                } else {
                    System.out.printf("Insufficient cash. $%.2f still owed.\n", totalDue - cashTendered);
                    System.out.print("Pay the rest with credit card? (yes/no): ");
                    String payWithCredit = input.next().toLowerCase();

                    if (payWithCredit.equals("yes")) {
                        cashPayment = cashTendered;
                        creditPayment = totalDue - cashTendered;
                    } else {
                        System.out.println("Transaction cancelled.\n");
                        continue; // Skip to next customer
                    }
                }
            }

            // Receipt
            System.out.println("\nPurchase Summary");
            System.out.println("=====================================");
            System.out.printf("Total Due: $%.2f\n", totalDue);

            if (cashPayment > 0) {
                System.out.printf("Cash Payment: $%.2f\n", cashPayment);
            }

            if (creditPayment > 0) {
                System.out.printf("Credit Card Payment: $%.2f\n", creditPayment);
            }

            if (change > 0) {
                System.out.printf("Change: $%.2f\n", change);
            }

            owing = totalDue - (cashPayment + creditPayment);
            System.out.printf("Owing: $%.2f\n", owing);
            System.out.println("=====================================\n");

            // Next customer?
            System.out.print("Serve next customer? (yes/no): ");
            String next = input.next().toLowerCase();
            if (!next.equals("yes")) {
                continueShop = false;
            }
        }

        input.close();
        System.out.println("Book shop is now closed.");
    }
}
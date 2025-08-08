package BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a new bank account with an initial balance
        BankAccount myAccount = new BankAccount("123456789", "John Doe", 1000.00);

        // Display account info
        myAccount.displayAccountInfo();

        // Test deposit
        myAccount.deposit(500);

        // Test withdraw (valid)
        myAccount.withdraw(300);

        // Test withdraw (invalid - insufficient funds)
        myAccount.withdraw(2000);

        // Final balance
        System.out.printf("Final Balance: $%.2f%n", myAccount.getBalance());
    }
}
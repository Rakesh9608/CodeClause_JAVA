import java.util.Scanner;

public class OnlineBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nWelcome to Online Banking System");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void checkBalance() {
        System.out.println("\nChecking Balance...");
        // Add code to check balance from the database
        System.out.println("Your current balance is: $1000");
    }

    private static void depositMoney() {
        System.out.println("\nDepositing Money...");
        System.out.print("Enter the amount to deposit: $");
        double amount = new Scanner(System.in).nextDouble();
        // Add code to deposit money into the account in the database
        System.out.println("Amount deposited successfully.");
    }

    private static void withdrawMoney() {
        System.out.println("\nWithdrawing Money...");
        System.out.print("Enter the amount to withdraw: $");
        double amount = new Scanner(System.in).nextDouble();
        // Add code to withdraw money from the account in the database
        System.out.println("Amount withdrawn successfully.");
    }

    private static void transferMoney() {
        System.out.println("\nTransferring Money...");
        System.out.print("Enter the account number to transfer money: ");
        int accountNumber = new Scanner(System.in).nextInt();
        System.out.print("Enter the amount to transfer: $");
        double amount = new Scanner(System.in).nextDouble();
        // Add code to transfer money from the account to another account in the database
        System.out.println("Amount transferred successfully.");
    }
}
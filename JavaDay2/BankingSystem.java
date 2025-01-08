package JavaDay2;

import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double minimumBalance;

    public SavingsAccount(String accountHolderName, String accountNumber, double balance, double minimumBalance) {
        super(accountHolderName, accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of " + minimumBalance + " must be maintained.");
        }
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(String accountHolderName, String accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Overdraft limit of " + overdraftLimit + " exceeded.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account type (Savings/Current): ");
        String accountType = scanner.nextLine();

        System.out.println("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = null;
        if ("Savings".equalsIgnoreCase(accountType)) {
            System.out.println("Enter minimum balance: ");
            double minimumBalance = scanner.nextDouble();
            account = new SavingsAccount(accountHolderName, accountNumber, balance, minimumBalance);
        } else if ("Current".equalsIgnoreCase(accountType)) {
            System.out.println("Enter overdraft limit: ");
            double overdraftLimit = scanner.nextDouble();
            account = new CurrentAccount(accountHolderName, accountNumber, balance, overdraftLimit);
        } else {
            System.out.println("Invalid account type.");
            System.exit(0);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an operation: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

package JavaDay2;

import java.util.Scanner;

public class BankATM {
    static double balance = 1000.00;
    static double electricityBill = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Electricity Bill Calculation");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    electricityBillCalculation(scanner);
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using our ATM.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }

    public static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public static void depositMoney(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("$" + depositAmount + " has been deposited. Your new balance is: $" + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("$" + withdrawAmount + " has been withdrawn. Your new balance is: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    public static void electricityBillCalculation(Scanner scanner) {
        System.out.print("Enter units of electricity consumed: ");
        double units = scanner.nextDouble();
        double ratePerUnit = 0.12;
        electricityBill = units * ratePerUnit;
        System.out.println("Your electricity bill is: $" + electricityBill);
    }
}

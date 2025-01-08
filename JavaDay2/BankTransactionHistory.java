package JavaDay2;

import java.util.Scanner;

public class BankTransactionHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000.0;
        char transactionType;

        do {
            System.out.println("Current balance: $" + balance);
            System.out.println("Enter transaction type (d=deposit, w=withdraw, q=quit): ");
            transactionType = scanner.next().charAt(0);

            if (transactionType == 'd') {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                balance += amount;
            } else if (transactionType == 'w') {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                if (balance >= amount) {
                    balance -= amount;
                } else {
                    System.out.println("Insufficient balance!");
                }
            }
        } while (transactionType != 'q');

        System.out.println("Final balance: $" + balance);
    }
}

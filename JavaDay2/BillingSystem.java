package JavaDay2;

import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items purchased: ");
        int itemCount = scanner.nextInt();
        double totalBill = 0;

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            totalBill += price;
        }

        System.out.println("Total Bill: $" + totalBill);
    }
}

package JavaDay2;

import java.util.Scanner;

public class RestaurantMenuOrdering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menuItems = { "Pizza", "Burger", "Pasta", "Salad" };
        double[] prices = { 10.99, 5.99, 8.49, 4.99 };
        double totalCost = 0;

        while (true) {
            System.out.println("Menu:");
            for (int i = 0; i < menuItems.length; i++) {
                System.out.println((i + 1) + ". " + menuItems[i] + " - $" + prices[i]);
            }
            System.out.print("Enter the item number to order (or 0 to stop): ");
            int itemChoice = scanner.nextInt();

            if (itemChoice == 0) {
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            totalCost += prices[itemChoice - 1] * quantity;
        }

        System.out.println("Total Order Cost: $" + totalCost);
    }
}

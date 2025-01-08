package JavaDay2;

import java.util.*;

class MenuItem {
    String itemName;
    double itemPrice;
    String itemCategory;

    public MenuItem(String itemName, double itemPrice, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
    }
}

class Restaurant {
    List<MenuItem> menu;
    Map<MenuItem, Integer> order;

    public Restaurant() {
        menu = new ArrayList<>();
        order = new HashMap<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }

    public void displayMenu() {
        System.out.println("\n--- Restaurant Menu ---");
        for (MenuItem item : menu) {
            System.out.println(item.itemName + " - " + item.itemCategory + " - Price: " + item.itemPrice);
        }
    }

    public void takeOrder(String itemName, int quantity) {
        for (MenuItem item : menu) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                order.put(item, order.getOrDefault(item, 0) + quantity);
                System.out.println(quantity + " " + itemName + "(s) added to your order.");
                return;
            }
        }
        System.out.println("Item " + itemName + " not found in the menu.");
    }

    public double calculateBill() {
        double total = 0;
        for (Map.Entry<MenuItem, Integer> entry : order.entrySet()) {
            MenuItem item = entry.getKey();
            int quantity = entry.getValue();
            total += item.itemPrice * quantity;
        }
        return total;
    }

    public void displayBill() {
        if (order.isEmpty()) {
            System.out.println("No items ordered.");
            return;
        }

        System.out.println("\n--- Your Order ---");
        for (Map.Entry<MenuItem, Integer> entry : order.entrySet()) {
            MenuItem item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(
                    item.itemName + " - " + quantity + " x " + item.itemPrice + " = " + (item.itemPrice * quantity));
        }

        double total = calculateBill();
        System.out.println("\nTotal Bill: " + total);
    }
}

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create restaurant and menu items
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(new MenuItem("Burger", 5.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Fries", 2.49, "Side Dish"));
        restaurant.addMenuItem(new MenuItem("Coke", 1.99, "Beverage"));
        restaurant.addMenuItem(new MenuItem("Pizza", 8.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Ice Cream", 3.49, "Dessert"));

        boolean exit = false;

        while (!exit) {
            System.out.println("\nRestaurant Order System");
            System.out.println("1. Display Menu");
            System.out.println("2. Order Item");
            System.out.println("3. Display Bill");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    restaurant.displayMenu();
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    restaurant.takeOrder(itemName, quantity);
                    break;
                case 3:
                    restaurant.displayBill();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for visiting! Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

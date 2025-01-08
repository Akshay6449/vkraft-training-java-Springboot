package JavaDay2;

import java.util.*;

class Customer {
    int customerId;
    String name;
    String address;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class Order {
    int orderId;
    String orderDate;
    List<String> orderedItems;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderedItems = new ArrayList<>();
    }

    public void addItem(String item) {
        orderedItems.add(item);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Ordered Items: " + orderedItems);
    }
}

public class ECommerceOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Customer Address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(customerId, name, address);

        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Order Date: ");
        String orderDate = scanner.nextLine();
        Order order = new Order(orderId, orderDate);

        System.out.print("Enter the number of items in the order: ");
        int numItems = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter item name: ");
            String item = scanner.nextLine();
            order.addItem(item);
        }

        System.out.println("\nCustomer Details:");
        customer.displayCustomerDetails();
        System.out.println("\nOrder Details:");
        order.displayOrderDetails();

        scanner.close();
    }
}

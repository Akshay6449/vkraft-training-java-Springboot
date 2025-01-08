package JavaDay2;

import java.util.*;

class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class Cart {
    List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.name + " added to the cart.");
    }

    public void removeProduct(String productName) {
        for (Iterator<Product> iterator = products.iterator(); iterator.hasNext();) {
            Product product = iterator.next();
            if (product.name.equalsIgnoreCase(productName)) {
                iterator.remove();
                System.out.println(productName + " removed from the cart.");
                return;
            }
        }
        System.out.println("Product " + productName + " not found in the cart.");
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (Product product : products) {
                System.out.println(product.name + " - Price: " + product.price + " Quantity: " + product.quantity);
            }
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nShopping Cart System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Cart");
            System.out.println("4. Calculate Total");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    Product product = new Product(name, price, quantity);
                    cart.addProduct(product);
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String productNameToRemove = scanner.nextLine();
                    cart.removeProduct(productNameToRemove);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    double total = cart.calculateTotal();
                    System.out.println("Total price: " + total);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting... Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

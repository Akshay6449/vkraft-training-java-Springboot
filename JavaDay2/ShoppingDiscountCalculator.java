package JavaDay2;

import java.util.Scanner;

public class ShoppingDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total price of items in cart: ");
        double totalPrice = scanner.nextDouble();
        double finalPrice;

        if (totalPrice > 500) {
            finalPrice = totalPrice - (totalPrice * 0.10);
        } else if (totalPrice >= 200) {
            finalPrice = totalPrice - (totalPrice * 0.05);
        } else {
            finalPrice = totalPrice;
        }

        System.out.println("Final Price: $" + finalPrice);
    }
}

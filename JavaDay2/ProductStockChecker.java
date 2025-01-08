package JavaDay2;

import java.util.Scanner;

public class ProductStockChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threshold = 10;
        String[] products = { "Product A", "Product B", "Product C" };
        int[] stock = { 5, 15, 3 };

        for (int i = 0; i < products.length; i++) {
            System.out.println("Stock of " + products[i] + ": " + stock[i]);
            if (stock[i] < threshold) {
                System.out.println("Reorder " + products[i]);
            }
        }
    }
}

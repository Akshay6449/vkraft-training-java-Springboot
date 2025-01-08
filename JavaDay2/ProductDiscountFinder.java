package JavaDay2;

import java.util.Scanner;

public class ProductDiscountFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfProducts = 3;
        double[] prices = new double[numberOfProducts];
        double[] discountPercentages = new double[numberOfProducts];

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Enter price of product " + (i + 1) + ":");
            prices[i] = scanner.nextDouble();
            System.out.println("Enter discount percentage for product " + (i + 1) + ":");
            discountPercentages[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numberOfProducts; i++) {
            double discountAmount = prices[i] * discountPercentages[i] / 100;
            double discountedPrice = prices[i] - discountAmount;
            System.out.println("Discounted price of product " + (i + 1) + ": " + discountedPrice);
        }
    }
}

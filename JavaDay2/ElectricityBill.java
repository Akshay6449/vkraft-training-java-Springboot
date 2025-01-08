package JavaDay2;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        double billAmount;

        if (units >= 0 && units <= 100) {
            billAmount = units * 1.0;
        } else if (units >= 101 && units <= 200) {
            billAmount = (100 * 1.0) + ((units - 100) * 2.0);
        } else if (units > 200) {
            billAmount = (100 * 1.0) + (100 * 2.0) + ((units - 200) * 3.0);
        } else {
            billAmount = 0.0;
            System.out.println("Invalid input! Units consumed cannot be negative.");
        }

        System.out.println("Your electricity bill is: $" + billAmount);
        scanner.close();
    }
}

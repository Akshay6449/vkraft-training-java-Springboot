package JavaDay2;

import java.util.Scanner;

public class LibraryFineCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of overdue books: ");
        int numBooks = scanner.nextInt();
        double totalFine = 0;

        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter overdue days for book " + (i + 1) + ": ");
            int overdueDays = scanner.nextInt();

            if (overdueDays <= 7) {
                totalFine += overdueDays * 1;
            } else {
                totalFine += 7 * 1 + (overdueDays - 7) * 2;
            }
        }

        System.out.println("Total Fine: $" + totalFine);
    }
}

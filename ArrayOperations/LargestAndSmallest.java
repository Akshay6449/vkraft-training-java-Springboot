package ArrayOperations;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid size.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > largest)
                largest = num;
            if (num < smallest)
                smallest = num;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        scanner.close();
    }
}

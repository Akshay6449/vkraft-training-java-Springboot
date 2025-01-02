package ArrayOperations;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                position = i + 1;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}

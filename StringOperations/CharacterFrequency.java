package StringOperations;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] frequency = new int[256];

        for (char ch : input.toCharArray()) {
            frequency[ch]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
}

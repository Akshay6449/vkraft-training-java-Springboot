package BasicJavaDay1;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean isCitizen = scanner.nextBoolean();

        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        scanner.close();
    }
}

package BasicJavaDay1;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (password.length() >= 8 && containsLetterAndNumber(password)) {
            System.out.println("The password is valid.");
        } else {
            System.out.println(
                    "The password is invalid. A valid password must be at least 8 characters long and contain both letters and numbers.");
        }

        scanner.close();
    }

    public static boolean containsLetterAndNumber(String password) {
        boolean hasLetter = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) {
                hasLetter = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        return hasLetter && hasDigit;
    }
}
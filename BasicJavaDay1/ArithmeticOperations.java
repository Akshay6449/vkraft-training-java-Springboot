package BasicJavaDay1;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int divide = num1 / num2;

        System.out.println("add " + addition);
        System.out.println("sub " + subtraction);
        System.out.println("mul " + multiplication);
        System.out.println("div " + divide);

        scanner.close();
    }

}
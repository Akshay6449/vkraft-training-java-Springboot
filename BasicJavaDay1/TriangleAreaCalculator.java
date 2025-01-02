package BasicJavaDay1;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        triangleCal(base, height);
        scanner.close();
    }

    public static void triangleCal(double base, double height) {

        double area = 0.5 * base * height;

        System.out.println("The area of the triangle is " + area);
    }
}

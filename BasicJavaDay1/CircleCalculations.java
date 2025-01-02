package BasicJavaDay1;

import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble();

        double pi = 3.14;

        cirCal(pi, r);

        scanner.close();
    }

    public static void cirCal(double pi, double r) {

        double circumstance = 2 * pi * r;
        double Area = pi * r * r;

        System.out.println("The circumstance is " + circumstance);
        System.out.println("The Area is " + Area);

    }
}
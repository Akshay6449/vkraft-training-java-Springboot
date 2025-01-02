package BasicJavaDay1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        calculateSimpleInterest(principal, rate, time);
        scanner.close();
    }

    public static void calculateSimpleInterest(double principal, double rate, double time) {

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The simpleInterest is " + simpleInterest);

    }

}
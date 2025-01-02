package BasicJavaDay1;

import java.util.Scanner;

public class TrafficLightSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traffic light color (Green, Yellow, Red): ");
        String lightColor = scanner.nextLine();

        System.out.print("Is there an obstacle? (true/false): ");
        boolean isObstacle = scanner.nextBoolean();

        if (isObstacle) {
            System.out.println("Stop! There is an obstacle.");
        } else if (lightColor.equalsIgnoreCase("Green")) {
            System.out.println("Go.");
        } else if (lightColor.equalsIgnoreCase("Yellow")) {
            System.out.println("Slow Down.");
        } else if (lightColor.equalsIgnoreCase("Red")) {
            System.out.println("Stop.");
        } else {
            System.out.println("Invalid light color.");
        }

        scanner.close();
    }
}

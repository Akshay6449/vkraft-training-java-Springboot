package JavaDay2;

import java.util.Scanner;

public class DailyStepTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] steps = new int[7];
        int totalSteps = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter steps for day " + (i + 1) + ":");
            steps[i] = scanner.nextInt();
            totalSteps += steps[i];
        }

        double averageSteps = totalSteps / 7.0;
        System.out.println("Total steps: " + totalSteps);
        System.out.println("Average steps per day: " + averageSteps);
    }
}

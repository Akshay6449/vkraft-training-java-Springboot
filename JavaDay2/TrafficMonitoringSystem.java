package JavaDay2;

import java.util.Scanner;

public class TrafficMonitoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalVehicles = 0;
        int intervals = 12;
        int[] vehicleCounts = new int[intervals];

        for (int i = 0; i < intervals; i++) {
            System.out.println("Enter the number of vehicles passing at interval " + (i + 1) + ":");
            vehicleCounts[i] = scanner.nextInt();
            totalVehicles += vehicleCounts[i];
        }

        double averageVehicles = (double) totalVehicles / intervals;
        System.out.println("Total vehicles: " + totalVehicles);
        System.out.println("Average vehicles per interval: " + averageVehicles);
    }
}

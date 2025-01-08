package JavaDay2;

import java.util.Scanner;

public class ParkingLotFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfVehicles = 3;
        double totalFee = 0;

        for (int i = 0; i < numberOfVehicles; i++) {
            System.out.println("Enter hours parked for vehicle " + (i + 1) + ":");
            int hoursParked = scanner.nextInt();

            double fee = 0;
            if (hoursParked <= 5) {
                fee = hoursParked * 2;
            } else {
                fee = 5 * 2 + (hoursParked - 5) * 1;
            }

            totalFee += fee;
            System.out.println("Parking fee for vehicle " + (i + 1) + ": $" + fee);
        }

        System.out.println("Total parking fee for all vehicles: $" + totalFee);
    }
}

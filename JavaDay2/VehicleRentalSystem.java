package JavaDay2;

import java.util.Scanner;

class Vehicle {
    String vehicleType;
    String numberPlate;
    double rentalPricePerDay;

    public Vehicle(String vehicleType, String numberPlate, double rentalPricePerDay) {
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double calculateRentalCost(int daysRented) {
        return rentalPricePerDay * daysRented;
    }
}

class Car extends Vehicle {
    int doors;

    public Car(String numberPlate, double rentalPricePerDay, int doors) {
        super("Car", numberPlate, rentalPricePerDay);
        this.doors = doors;
    }
}

class Bike extends Vehicle {
    boolean hasHelmet;

    public Bike(String numberPlate, double rentalPricePerDay, boolean hasHelmet) {
        super("Bike", numberPlate, rentalPricePerDay);
        this.hasHelmet = hasHelmet;
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    public Truck(String numberPlate, double rentalPricePerDay, double loadCapacity) {
        super("Truck", numberPlate, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle type (Car/Bike/Truck): ");
        String vehicleType = scanner.nextLine();

        System.out.println("Enter vehicle number plate: ");
        String numberPlate = scanner.nextLine();

        System.out.println("Enter rental price per day: ");
        double rentalPricePerDay = scanner.nextDouble();

        Vehicle vehicle = null;

        if ("Car".equalsIgnoreCase(vehicleType)) {
            System.out.println("Enter number of doors: ");
            int doors = scanner.nextInt();
            vehicle = new Car(numberPlate, rentalPricePerDay, doors);
        } else if ("Bike".equalsIgnoreCase(vehicleType)) {
            System.out.println("Does the bike come with a helmet (true/false)? ");
            boolean hasHelmet = scanner.nextBoolean();
            vehicle = new Bike(numberPlate, rentalPricePerDay, hasHelmet);
        } else if ("Truck".equalsIgnoreCase(vehicleType)) {
            System.out.println("Enter load capacity (in kg): ");
            double loadCapacity = scanner.nextDouble();
            vehicle = new Truck(numberPlate, rentalPricePerDay, loadCapacity);
        } else {
            System.out.println("Invalid vehicle type.");
            System.exit(0);
        }

        System.out.println("Enter number of days rented: ");
        int daysRented = scanner.nextInt();

        double rentalCost = vehicle.calculateRentalCost(daysRented);
        System.out.println("The rental cost for the " + vehicleType + " is: " + rentalCost);

        scanner.close();
    }
}

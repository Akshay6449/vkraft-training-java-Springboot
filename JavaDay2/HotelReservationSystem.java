package JavaDay2;

import java.util.*;

class Room {
    int roomNumber;
    String roomType;
    boolean isAvailable;
    double pricePerNight;

    public Room(int roomNumber, String roomType, boolean isAvailable, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.pricePerNight = pricePerNight;
    }

    public void bookRoom() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNumber + " has been booked successfully.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public void checkAvailability() {
        if (isAvailable) {
            System.out.println("Room " + roomNumber + " is available.");
        } else {
            System.out.println("Room " + roomNumber + " is not available.");
        }
    }

    public double calculateCharges(int nights) {
        return pricePerNight * nights;
    }
}

class Hotel {
    List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void displayRooms() {
        System.out.println("\n--- Available Rooms ---");
        for (Room room : rooms) {
            room.checkAvailability();
        }
    }

    public void bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.roomNumber == roomNumber) {
                room.bookRoom();
                return;
            }
        }
        System.out.println("Room number " + roomNumber + " not found.");
    }

    public void calculateTotalCharges(int roomNumber, int nights) {
        for (Room room : rooms) {
            if (room.roomNumber == roomNumber) {
                double totalCharges = room.calculateCharges(nights);
                System.out.println(
                        "Total charges for Room " + roomNumber + " for " + nights + " nights: " + totalCharges);
                return;
            }
        }
        System.out.println("Room number " + roomNumber + " not found.");
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        hotel.addRoom(new Room(101, "Single", true, 100.0));
        hotel.addRoom(new Room(102, "Double", true, 150.0));
        hotel.addRoom(new Room(103, "Suite", true, 200.0));

        boolean exit = false;

        while (!exit) {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. Display Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Calculate Charges");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    int roomNumber = scanner.nextInt();
                    hotel.bookRoom(roomNumber);
                    break;
                case 3:
                    System.out.print("Enter room number: ");
                    int roomForCharges = scanner.nextInt();
                    System.out.print("Enter number of nights: ");
                    int nights = scanner.nextInt();
                    hotel.calculateTotalCharges(roomForCharges, nights);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the hotel reservation system!");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        scanner.close();
    }
}

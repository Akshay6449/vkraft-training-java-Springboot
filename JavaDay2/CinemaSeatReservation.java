package JavaDay2;

import java.util.Scanner;

public class CinemaSeatReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] seats = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                seats[i][j] = "Available";
            }
        }

        while (true) {
            System.out.println("Cinema Seat Reservation:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(seats[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.print("Enter row (1-5) and column (1-5) to reserve (0 0 to exit): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row == 0 && col == 0)
                break;
            if (row > 0 && col > 0 && row <= 5 && col <= 5 && seats[row - 1][col - 1].equals("Available")) {
                seats[row - 1][col - 1] = "Reserved";
            } else {
                System.out.println("Invalid seat or already reserved.");
            }
        }
    }
}

package JavaDay2;

import java.util.Scanner;

public class EmployeeAttendanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        String[][] attendance = new String[n][7];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter attendance for Employee " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j + 1) + " (P/A): ");
                attendance[i][j] = scanner.next();
            }
        }

        System.out.println("\nAttendance Summary:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print(attendance[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package JavaDay2;

import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        double totalGrade = 0;
        boolean failed = false;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            totalGrade += grade;

            if (grade < 40) {
                failed = true;
            }
        }

        double averageGrade = totalGrade / numStudents;
        System.out.println("Average grade: " + averageGrade);

        if (failed) {
            System.out.println("Some students have failed.");
        }
    }
}

package JavaDay2;

import java.util.*;

class Student {
    String name;
    int rollNumber;
    List<Double> grades;
    int totalClasses;
    int attendedClasses;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new ArrayList<>();
        this.totalClasses = 0;
        this.attendedClasses = 0;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grades: " + grades);
        System.out.println("Attendance: " + attendedClasses + "/" + totalClasses);
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.size() > 0 ? sum / grades.size() : 0;
    }

    public void markAttendance(boolean attended) {
        totalClasses++;
        if (attended) {
            attendedClasses++;
        }
    }
}

class School {
    List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudentDetails(int rollNumber) {
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                student.displayDetails();
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public void markAttendance(int rollNumber, boolean attended) {
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                student.markAttendance(attended);
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public void addGrade(int rollNumber, double grade) {
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                student.addGrade(grade);
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public void calculateAverageGrade(int rollNumber) {
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                System.out
                        .println("Average Grade for Student " + student.name + ": " + student.calculateAverageGrade());
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        Student student1 = new Student("Alice", 101);
        student1.addGrade(85);
        student1.addGrade(90);
        student1.markAttendance(true);
        student1.markAttendance(true);
        school.addStudent(student1);

        Student student2 = new Student("Bob", 102);
        student2.addGrade(70);
        student2.addGrade(75);
        student2.markAttendance(true);
        student2.markAttendance(false);
        school.addStudent(student2);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nSchool Management System");
            System.out.println("1. Display Student Details");
            System.out.println("2. Mark Attendance");
            System.out.println("3. Add Grade");
            System.out.println("4. Calculate Average Grade");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter roll number to display details: ");
                    int rollNumber = scanner.nextInt();
                    school.displayStudentDetails(rollNumber);
                    break;
                case 2:
                    System.out.print("Enter roll number to mark attendance: ");
                    rollNumber = scanner.nextInt();
                    System.out.print("Did the student attend? (true/false): ");
                    boolean attended = scanner.nextBoolean();
                    school.markAttendance(rollNumber, attended);
                    break;
                case 3:
                    System.out.print("Enter roll number to add grade: ");
                    rollNumber = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    school.addGrade(rollNumber, grade);
                    break;
                case 4:
                    System.out.print("Enter roll number to calculate average grade: ");
                    rollNumber = scanner.nextInt();
                    school.calculateAverageGrade(rollNumber);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using the School Management System!");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        scanner.close();
    }
}

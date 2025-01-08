package JavaDay2;

class Employee {
    String empName;
    int empId;
    String empDesignation;
    double baseSalary;

    public Employee(String empName, int empId, String empDesignation, double baseSalary) {
        this.empName = empName;
        this.empId = empId;
        this.empDesignation = empDesignation;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class FullTimeEmployee extends Employee {
    double hra;
    double da;

    public FullTimeEmployee(String empName, int empId, String empDesignation, double baseSalary, double hra,
            double da) {
        super(empName, empId, empDesignation, baseSalary);
        this.hra = hra;
        this.da = da;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + hra + da;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;

    public PartTimeEmployee(String empName, int empId, String empDesignation, double hourlyWage, int hoursWorked) {
        super(empName, empId, empDesignation, 0);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee("John Doe", 101, "Manager", 50000, 10000, 8000);
        Employee partTimeEmp = new PartTimeEmployee("Jane Smith", 102, "Clerk", 200, 120);

        System.out.println("Full-Time Employee Salary: " + fullTimeEmp.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + partTimeEmp.calculateSalary());
    }
}

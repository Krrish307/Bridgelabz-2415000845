import java.util.*;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, 0);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        FullTimeEmployee f1 = new FullTimeEmployee(1, "Rohit", 80000);
        PartTimeEmployee p1 = new PartTimeEmployee(2, "Krish", 500, 80);
        f1.assignDepartment("HR");
        p1.assignDepartment("Tech");
        list.add(f1);
        list.add(p1);
        for (Employee e : list) e.displayDetails();
    }
}

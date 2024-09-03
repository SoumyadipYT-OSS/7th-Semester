import java.lang.System;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age =age;
    }
}

class HR extends Employee {
    private int eid;
    private double salary;

    HR(String name, int age, int eid, double salary) {
        super(name, age);
        this.eid = eid;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("HR Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Employee ID: " + eid);
        System.out.println("Salary: " + salary);
    }

    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}


public class Q4 {
    public static void main(String[] args) {
        // HR hr = new HR("Profulla Chandra Roy", 21, 1234, 80000.0);
        // hr.displayDetails();
        Employee e1 = new Employee("Soumyadip Majumder", 21);
        System.out.println("Name: " + e1.getName());
        System.out.println("Age: " + e1.getAge());
    }
}

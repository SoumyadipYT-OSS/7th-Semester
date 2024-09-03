import java.lang.System;

class Employee {
    public String name;
    private double salary;
    private int age;

    public void setData(String n, double s, int a) {
        this.name = n;
        this.salary = s;
        this.age = a;
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}


public class Q1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setData("Joseph", 65784.50, 25);
        e1.displayData();
    }
}
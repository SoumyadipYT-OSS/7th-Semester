using System;

class Employee {
    private int id;
    private int salary;
    public string? name;

    // using getter and setter in C#
    public int ID {
        get {
            return id;
        }
        set {
            id = value;
        }
    }

    public int SALARY {
        get {
            return salary;
        }
        set {
            salary = value;
        }
    }

    public string? NAME {
        get {
            return name;
        }
        set {
            name = value;
        }
    }

    // method to display
    public void displayEmployeeDetails() {
        System.Console.WriteLine("Name: " + name);
        System.Console.WriteLine("ID: " + id);
        System.Console.WriteLine("Salary: " + salary);
    }
}


class q1
{
    static void Main(string[] args) {
        Employee e1 = new Employee();

        Employee e2 = new Employee();
        e2.NAME = "X42";
        e2.ID = 42;
        e2.SALARY = 42000;

        Employee e3 = new Employee();
        e3.NAME = "ABC";
        e3.ID = 1;
        e3.SALARY = 80000;

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();
    }
    
}

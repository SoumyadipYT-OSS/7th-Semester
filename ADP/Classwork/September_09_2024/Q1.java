class Employee {
    public int id;
    private String emp_name;
    private int salary;

    // Default constructor
    Employee() {}

    Employee(int id, String eN, int s) {
        this.id = id;
        this.emp_name = eN;
        this.salary = s;
    }

    public void getDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + emp_name);
        System.out.println("Salary: " + salary + " per hour");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(1, "X42", 3000);
        Employee e3 = new Employee(2, "ABC", 2000);

        e1.getDetails();
        e2.getDetails();
        e3.getDetails();

        System.out.println(e1.getClass());
    }
}
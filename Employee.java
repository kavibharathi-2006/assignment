package employee;
public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    protected void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}
package manager;
import employee.Employee;
public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void showDetails() {
        display();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager("Priya", 80000, "IT");
        m.showDetails();
    }
}

import java.util.ArrayList;
class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create a list to store employees
        ArrayList<Employee> employees = new ArrayList<>();

        // Add employees to the list
        employees.add(new Employee(1, "Rizwan", 50000));
        employees.add(new Employee(2, "Akshay", 60000));
        employees.add(new Employee(3, "Nidhi", 70000));

        // Loop through the list and display details
        for (Employee emp : employees) {
            emp.displayDetails();
        }

    }
}

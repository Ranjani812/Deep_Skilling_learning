public class EmployeeManager {
    private Employee[] employees;
    private int count; // number of employees

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add employee
    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee array is full.");
        }
    }

    // Search employee by ID
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse all employees
    public void displayAllEmployees() {
        if (count == 0) {
            System.out.println("No employees.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1]; // shift left
            }
            employees[count - 1] = null;
            count--;
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}

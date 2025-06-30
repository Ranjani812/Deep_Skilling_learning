public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(1, "Alice", "Manager", 80000));
        manager.addEmployee(new Employee(2, "Bob", "Developer", 60000));
        manager.addEmployee(new Employee(3, "Charlie", "Designer", 55000));

        System.out.println("\nAll Employees:");
        manager.displayAllEmployees();

        System.out.println("\nSearching Employee ID 2:");
        Employee found = manager.searchEmployee(2);
        if (found != null)
            System.out.println(found);
        else
            System.out.println("Not found.");

        System.out.println("\nDeleting Employee ID 2:");
        manager.deleteEmployee(2);

        System.out.println("\nAll Employees After Deletion:");
        manager.displayAllEmployees();
    }
}

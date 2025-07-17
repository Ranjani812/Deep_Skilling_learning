public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Adding tasks
        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Develop Backend", "In Progress"));
        manager.addTask(new Task(3, "Testing", "Not Started"));

        // Display all
        System.out.println("\nAll Tasks:");
        manager.displayTasks();

        // Search
        System.out.println("\nSearching for Task ID 2:");
        Task task = manager.searchTask(2);
        System.out.println(task != null ? task : "Task not found.");

        // Delete
        System.out.println("\nDeleting Task ID 2:");
        manager.deleteTask(2);

        // Display after deletion
        System.out.println("\nAll Tasks after deletion:");
        manager.displayTasks();
    }
}

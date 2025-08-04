public class TaskManager {
    private TaskNode head;

    // Add task to end
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task added.");
    }

    // Search by ID
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }
        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                current.next = current.next.next;
                System.out.println("Task deleted.");
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found.");
    }
}

public class SortDemo {

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    // Swap
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        // Swap pivot
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    // Display orders
    public static void displayOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 500.0),
            new Order(102, "Bob", 1500.0),
            new Order(103, "Charlie", 800.0),
            new Order(104, "David", 200.0),
            new Order(105, "Eva", 1200.0)
        };

        System.out.println("Original Orders:");
        displayOrders(orders);

        // Bubble Sort
        bubbleSort(orders);
        System.out.println("\nOrders after Bubble Sort:");
        displayOrders(orders);

        // Reset orders for Quick Sort
        orders = new Order[]{
            new Order(101, "Alice", 500.0),
            new Order(102, "Bob", 1500.0),
            new Order(103, "Charlie", 800.0),
            new Order(104, "David", 200.0),
            new Order(105, "Eva", 1200.0)
        };

        // Quick Sort
        quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        displayOrders(orders);
    }
}

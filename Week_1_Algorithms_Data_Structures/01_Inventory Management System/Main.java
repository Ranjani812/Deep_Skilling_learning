public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 55000);
        Product p2 = new Product(102, "Smartphone", 20, 30000);
        Product p3 = new Product(103, "Tablet", 15, 25000);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.displayInventory();

        manager.updateProduct(102, 25, 28000);
        manager.deleteProduct(103);

        manager.displayInventory();
    }
}

public class DIExample {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl(); // Dependency
        CustomerService service = new CustomerService(repo);    // Injected

        service.displayCustomer(1);  // Should print Ranjani
        service.displayCustomer(3);  // Should print Unknown
    }
}

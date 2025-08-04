import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customerDB = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Simulate database
        customerDB.put(1, new Customer(1, "Ranjani"));
        customerDB.put(2, new Customer(2, "Vikram"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerDB.getOrDefault(id, new Customer(id, "Unknown"));
    }
}

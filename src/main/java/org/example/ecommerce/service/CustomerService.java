public interface CustomerService {

    Customer createCustomer(Customer customer);

    Optional<Customer> findByEmail(String email);

    List<Customer> findAll();

    void deleteCustomer(Long id);
}

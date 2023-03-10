package customerApp.Domain;


import java.util.List;

public interface CustomerRepository{
    public List<Customer> getCustomers();
    public void addCustomer(Customer customer);
    public void deleteCustomer(Integer id);
    public void updateCustomer(Integer id, Customer customer);
}

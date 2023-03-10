package customerApp.Infrastructure;

import customerApp.Domain.Customer;
import customerApp.Domain.CustomerRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;



public class CustomerPostgresRepository  implements CustomerRepository {
    CustomerRepositoryJPA repository;


    public CustomerPostgresRepository(CustomerRepositoryJPA repository){
        this.repository = repository;
    }

    public List<Customer> getCustomers() {
        return this.repository.findAll();
    }

    public void addCustomer(Customer customer) {
        repository.save(customer);
    }

    public void deleteCustomer(Integer id) {
        repository.deleteById(id);
    }

    public void updateCustomer(Integer id, Customer customer) {
        Optional<Customer> customerOptional = repository.findById(id);
        Customer customerOriginal = customerOptional.get();
        customerOriginal.setName(customer.getName());
        customerOriginal.setEmail(customer.getEmail());
        customerOriginal.setAge(customer.getAge());
        repository.save(customerOriginal);
    }
}

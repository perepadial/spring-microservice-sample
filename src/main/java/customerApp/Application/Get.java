package customerApp.Application;

import customerApp.Domain.CustomerRepository;
import customerApp.Domain.Customer;

import java.util.List;

public class Get {
    CustomerRepository customerRepository;
    public Get(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> execute(){
        return this.customerRepository.getCustomers();
    }
}

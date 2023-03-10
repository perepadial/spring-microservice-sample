package customerApp.Application;

import customerApp.Domain.Customer;
import customerApp.Domain.CustomerRepository;
import customerApp.Infrastructure.CustomerRequest;

public class Insert {
    CustomerRepository customerRepository;
    public Insert(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(CustomerRequest customerRequest){
        Customer customer = new Customer(customerRequest);
        customerRepository.addCustomer(customer);
    }


}

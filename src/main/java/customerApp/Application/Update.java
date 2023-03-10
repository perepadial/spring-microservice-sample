package customerApp.Application;

import customerApp.Domain.Customer;
import customerApp.Domain.CustomerRepository;
import customerApp.Infrastructure.CustomerRequest;

public class Update {
    CustomerRepository customerRepository;

    public Update(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(Integer id, CustomerRequest customerRequest){
        this.customerRepository.updateCustomer(id, new Customer(customerRequest));
    }


}

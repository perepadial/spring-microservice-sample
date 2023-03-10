package customerApp.Application;

import customerApp.Domain.CustomerRepository;

public class Delete {
    CustomerRepository customerRepository;

    public Delete(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(Integer id){
        this.customerRepository.deleteCustomer(id);
    }
}

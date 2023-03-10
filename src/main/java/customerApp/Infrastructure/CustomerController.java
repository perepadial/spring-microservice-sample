package customerApp.Infrastructure;

import customerApp.Application.Delete;
import customerApp.Application.Get;
import customerApp.Application.Insert;
import customerApp.Application.Update;
import customerApp.Domain.Customer;
import customerApp.Domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
interface CustomerRepositoryJPA extends JpaRepository<Customer, Integer> {};

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    @Autowired
    CustomerRepositoryJPA jpaRepository;

    @GetMapping()
    public List<Customer> getCustomers(){
        CustomerRepository repository = new CustomerPostgresRepository(jpaRepository);
        Get useCase = new Get(repository);
        return useCase.execute();
    }

    @PostMapping
    public void addCustomer(@RequestBody CustomerRequest customerRequest){
        CustomerRepository repository = new CustomerPostgresRepository(jpaRepository);
        Insert useCase = new Insert(repository);
        useCase.execute(customerRequest);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id){
        CustomerRepository repository = new CustomerPostgresRepository(jpaRepository);
        Delete useCase = new Delete(repository);
        useCase.execute(id);
    }

    @PutMapping("{customerId}")
    public void updateCustomer(@PathVariable("customerId") Integer id, @RequestBody CustomerRequest customerRequest){
        CustomerRepository repository = new CustomerPostgresRepository(jpaRepository);
        Update useCase = new Update(repository);
        useCase.execute(id, customerRequest);
    }
}

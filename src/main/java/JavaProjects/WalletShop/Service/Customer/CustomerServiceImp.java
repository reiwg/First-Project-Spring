package JavaProjects.WalletShop.Service.Customer;

import JavaProjects.WalletShop.Controller.Customer.Dto.CustomerDto;
import JavaProjects.WalletShop.Entity.Customer.Customer;
import JavaProjects.WalletShop.Repository.Customer.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImp implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public void saveCustomer(CustomerDto customerDto) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findCustomerById(long customerId) {
        return customerRepository.getReferenceById(customerId);
    }

    @Override
    public void removeCustomerById(long customerId) {
        customerRepository.deleteById(customerId);
    }
}

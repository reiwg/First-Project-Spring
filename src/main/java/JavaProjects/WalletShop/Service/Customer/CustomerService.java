package JavaProjects.WalletShop.Service.Customer;

import JavaProjects.WalletShop.Controller.Customer.Dto.CustomerDto;
import JavaProjects.WalletShop.Entity.Customer.Customer;

import java.util.List;

public interface CustomerService {
    void saveCustomer (CustomerDto customerDto); // falta fazer dto

    List<Customer> getAllCustomers();

    Customer findCustomerById (long customerId);

    void removeCustomerById (long customerId);
}

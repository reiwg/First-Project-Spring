//package JavaProjects.WalletShop.Controller.Customer;
//
//import java.util.List;
//
//
//import JavaProjects.WalletShop.Controller.Customer.Dto.CustomerDto;
//import JavaProjects.WalletShop.Entity.Customer.Customer;
//import JavaProjects.WalletShop.Service.Customer.CustomerService;
//
//import jakarta.validation.Valid;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
//@AllArgsConstructor
//@RestController
//@RequestMapping("/api/customers")
//public class CustomerController {
//
//    private final CustomerService customerService;
//
//    @PostMapping
//    public ResponseEntity<String> createCustomer(@RequestBody @Valid CustomerDto customerDto) {
//        customerService.saveCustomer(customerDto);
//        return new ResponseEntity<String>("Cliente criado com sucesso.", HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public List<Customer> getAll() {
//        return customerService.getAllCustomers();
//    }
//
//    @GetMapping("/{id}")
//    public Customer getById(@PathVariable long id) {
//        return customerService.findCustomerById(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> removeById(@PathVariable long id) {
//        customerService.removeCustomerById(id);
//        return new ResponseEntity<String>("Deletado com sucesso", HttpStatus.OK);
//    }
//}

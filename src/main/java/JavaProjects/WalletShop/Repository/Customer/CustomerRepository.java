package JavaProjects.WalletShop.Repository.Customer;

import JavaProjects.WalletShop.Entity.Customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

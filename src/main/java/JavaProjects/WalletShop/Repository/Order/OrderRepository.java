package JavaProjects.WalletShop.Repository.Order;

import JavaProjects.WalletShop.Entity.Order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}

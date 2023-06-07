package JavaProjects.WalletShop.Service.Order;

import JavaProjects.WalletShop.Entity.Customer.Customer;
import JavaProjects.WalletShop.Entity.Order.Order;
import JavaProjects.WalletShop.Entity.Wallet.Wallet;
import JavaProjects.WalletShop.Repository.Customer.CustomerRepository;
import JavaProjects.WalletShop.Repository.Order.OrderRepository;
import JavaProjects.WalletShop.Repository.Wallet.WalletRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class OrderServiceImp implements OrderService {

    private final OrderRepository orderRepository;
    @Autowired
    private WalletRepository walletRepository;

    @Override
    public void addWalletsToOrder (List<Wallet> wallets, String orderId) {
        Order order = findOrderById(orderId);

    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order findOrderById(String orderId) {
        return orderRepository.getReferenceById(orderId);
    }

    @Override
    public void removeOrderById(String orderId) {
        orderRepository.deleteById(orderId);

    }
}

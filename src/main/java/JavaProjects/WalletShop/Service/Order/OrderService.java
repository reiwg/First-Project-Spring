package JavaProjects.WalletShop.Service.Order;

import JavaProjects.WalletShop.Entity.Order.Order;
import JavaProjects.WalletShop.Entity.Wallet.Wallet;

import java.util.List;

public interface OrderService {


    void addWalletsToOrder(List<Wallet> wallets, String orderId);

    List<Order> getAllOrders();

    Order findOrderById (String orderId);

    void removeOrderById (String orderId);
}

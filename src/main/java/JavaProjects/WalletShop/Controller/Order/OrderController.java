package JavaProjects.WalletShop.Controller.Order;

import JavaProjects.WalletShop.Controller.Order.OrderDto.OrderDto;
import JavaProjects.WalletShop.Entity.Order.Order;
import JavaProjects.WalletShop.Entity.Wallet.Wallet;
import JavaProjects.WalletShop.Service.Order.OrderService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<String> postWalletsToOrder(@RequestBody @Valid List<Wallet> wallets, String orderId) {

        List<Wallet> wallet = new ArrayList<>();
        wallets.add(wallets);

        return new ResponseEntity<String>("Salvo com sucesso", HttpStatus.CREATED);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable String id) {
        return orderService.findOrderById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeOrderById(@PathVariable String id) {
        orderService.removeOrderById(id);
        return new ResponseEntity<String>("Deletado com sucesso", HttpStatus.OK);
    }
}


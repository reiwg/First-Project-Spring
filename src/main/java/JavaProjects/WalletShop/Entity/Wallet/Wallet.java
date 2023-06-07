package JavaProjects.WalletShop.Entity.Wallet;

import JavaProjects.WalletShop.Entity.Order.Order;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;
import java.util.Set;


@Entity
@Table(name = "wallets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull 
    @NotBlank
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "produtos")
    private List<Order> orders;
}


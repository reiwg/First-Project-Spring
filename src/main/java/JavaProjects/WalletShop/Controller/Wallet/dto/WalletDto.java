package JavaProjects.WalletShop.Controller.Wallet.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WalletDto {

    @NotEmpty(message = "Wallet must contain id")
    private String id;

    @NotEmpty(message = "Wallet must contain name")
    private String name;


}
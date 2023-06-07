
package JavaProjects.WalletShop.Controller.Wallet;

import java.util.List;

import JavaProjects.WalletShop.Controller.Wallet.dto.WalletDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaProjects.WalletShop.Entity.Wallet.Wallet;
import JavaProjects.WalletShop.Service.Wallet.WalletService;
import jakarta.validation.Valid;

@AllArgsConstructor
@RestController
@RequestMapping("/api/wallets")
public class WalletController {

    private final WalletService walletService;


    @PostMapping
    public ResponseEntity<String> createWallet(@RequestBody @Valid WalletDto wallet) {
        walletService.saveWallet(wallet);
        return new ResponseEntity<String>("Salvo com sucesso", HttpStatus.CREATED);
    }

    @GetMapping
    public List<Wallet> getAll() {
        return walletService.getAllWallet();
    }

    @GetMapping("/{id}")
    public Wallet getById(@PathVariable long id) {
        return walletService.findWalletById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeById (@PathVariable long id) {
        walletService.removeById(id);
        return new ResponseEntity<String>("Deletado com sucesso", HttpStatus.OK);
    }




}


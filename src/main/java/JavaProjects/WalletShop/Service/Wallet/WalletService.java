package JavaProjects.WalletShop.Service.Wallet;

import java.util.List;
import JavaProjects.WalletShop.Controller.Wallet.dto.WalletDto;
import JavaProjects.WalletShop.Entity.Wallet.Wallet;

public interface WalletService {

    
    void saveWallet (WalletDto walletDto);
    
    List<Wallet> getAllWallet();

    Wallet findWalletById (long walletId);

    void removeById (long walletId);
}

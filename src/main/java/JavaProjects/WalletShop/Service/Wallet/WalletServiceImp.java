package JavaProjects.WalletShop.Service.Wallet;

import java.util.List;

import JavaProjects.WalletShop.Controller.Wallet.dto.WalletDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import JavaProjects.WalletShop.Entity.Wallet.Wallet;
import JavaProjects.WalletShop.Repository.Wallet.WalletRepository;

@Service
@AllArgsConstructor
public class WalletServiceImp implements WalletService {
    
    private final WalletRepository walletRepository;
    @Override
    public void saveWallet(WalletDto walletDto) {
        Wallet wallet = new Wallet();
        BeanUtils.copyProperties(walletDto, wallet);
        walletRepository.save(wallet);
    }

    @Override
    public List<Wallet> getAllWallet() {
        return walletRepository.findAll();
    }

    @Override
    public Wallet findWalletById(long walletId) {
        return walletRepository.getReferenceById(walletId);
    }

    @Override
    public void removeById(long walletId) {
        walletRepository.deleteById(walletId);
    }

}

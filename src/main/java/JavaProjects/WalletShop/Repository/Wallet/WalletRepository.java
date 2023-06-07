package JavaProjects.WalletShop.Repository.Wallet;

import JavaProjects.WalletShop.Controller.Wallet.dto.WalletDto;
import org.springframework.data.jpa.repository.JpaRepository;

import JavaProjects.WalletShop.Entity.Wallet.Wallet;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet,Long> {

    void save(WalletDto walletDto);

}
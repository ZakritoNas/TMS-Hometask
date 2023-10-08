package service;

import domain.Wallet;
import lombok.Data;
import org.springframework.stereotype.Service;
import service.interfaces.WalletService;

@Data
@Service
public class WalletServiceImpl implements WalletService {

    private final Wallet wallet;

    public WalletServiceImpl(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet addWinnings(){
        wallet.setSumOfBet(wallet.getSumOfBet() + 1000);
        return wallet;
    }

    public Wallet withdrawWinnings(){
        wallet.setSumOfBet(wallet.getSumOfBet() - 1000);
        return wallet;
    }
}

package service;

import domain.Pair;
import org.springframework.stereotype.Service;
import service.interfaces.RacingService;
import utils.MyAnnotation;

import java.util.Random;
import java.util.Scanner;

@Service
public class   RacingServiceImpl implements RacingService {
    private final PairServiceImpl pairs;
    private final WalletServiceImpl walletService;

    public RacingServiceImpl(PairServiceImpl pairs, WalletServiceImpl walletService) {
        this.pairs = pairs;
        this.walletService = walletService;
    }

    @MyAnnotation
    public void startRacing() throws InterruptedException {
        System.out.println("Добро пожаловать на скачки!");
        System.out.println("Пожалуйста сделайте свою ставку  и выбирете пару");
        for(int i =0; i < pairs.getPairs().size(); i++){
            System.out.println(i + " - " + pairs.getPairs().get(i));
        }

        Scanner userInput = new Scanner(System.in);
        Integer bet = userInput.nextInt();
        if (bet < pairs.getPairs().size()) {
            Pair yourChoice = pairs.getPairs().get(bet);
            System.out.println("Гонка началась...");
            for (int i = 1; i <= 5; i++) {
                pairs.getPairs().stream().map(Pair::getHorse).forEach(horse -> horse.setSpeed(new Random().nextDouble()));
                System.out.println("Победитель круга №" + i + " - " + pairs.getWinner());
                Thread.sleep(3000);
            }
            Pair winner = pairs.getWinner();
            if (yourChoice.equals(winner)) {
                System.out.println("----------------------------");
                System.out.println("Congratulations, your bet is a winner! You can take your winnings.");
                walletService.addWinnings();
            } else {
                System.out.println("----------------------------");
                System.out.println("Your bet lost...");
                walletService.withdrawWinnings();
            }

            System.out.println("Победитель: " + winner);
            System.out.println(walletService.getWallet().toString());
        } else {
            System.out.println("Указанная пара не учавствует в гонке. Пожалуйста, перепроверьте ставку");
        }
    }
}

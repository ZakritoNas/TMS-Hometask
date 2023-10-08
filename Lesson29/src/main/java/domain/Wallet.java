package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Wallet {

    private int sumOfBet = 10_000;

    @Override
    public String toString(){
        return "Ваш балаланс: " + sumOfBet;
    }
}

package domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {

    private int sumOfBet = 1000;

    @Override
    public String toString(){
        return "Ваш балаланс: " + sumOfBet;
    }
}

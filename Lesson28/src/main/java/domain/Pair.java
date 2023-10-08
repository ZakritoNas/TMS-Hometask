package domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pair {
    private Rider rider;
    private Horse horse;

    @Override
    public String toString(){
        return rider.getName() + " и " + horse.getName();
    }

}

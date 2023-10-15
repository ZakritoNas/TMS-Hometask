package service;

import domain.Pair;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Service;
import service.intarfaces.PairService;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class PairServiceImpl implements PairService {

    private final List<Pair> pairs;

    public PairServiceImpl(List<Pair> pairs) {
        this.pairs = pairs;
    }

    public Pair getWinner() {
        List<Double> speeds = new ArrayList<>();
        for (Pair pair : pairs) {
            speeds.add(pair.getHorse().getSpeed());
        }
        Double max = speeds.stream().max(Double::compare).get();
        int winner = speeds.indexOf(max);
        return pairs.get(winner);
    }
}

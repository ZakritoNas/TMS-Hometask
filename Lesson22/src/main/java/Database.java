import domain.Flowers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class Database {

    public static List<Flowers> flowers = new ArrayList<>();

    public void create(Flowers flower){
        flower.setId(UUID.randomUUID());
        flowers.add(flower);
    }

    public List<Flowers> getByName(String name){
        if (name == null || name.isBlank()){
            return flowers;
        }

        return flowers.stream()
                .filter(flower -> name.equals(flower.getName()))
                .collect(Collectors.toList());
    }

    public void delete(UUID id){
        Optional<Flowers> first = flowers.stream()
                .filter(flowers -> flowers.getId().equals(id))
                .findFirst();

        first.ifPresent(flower -> flowers.remove(flower));
    }
}
